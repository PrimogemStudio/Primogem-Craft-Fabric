package com.primogemstudio.primogemcraft.util;

import com.primogemstudio.primogemcraft.advancements.PrimogemCraftAdvancements;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;

import java.util.Random;

/**
 * Accepts various forms of a floating point half-precision (2 byte) number
 * and contains methods to convert to a
 * full-precision floating point number Float and Double instance.
 * <p>
 * <p>
 * This implemention was inspired by <a href="https://stackoverflow.com/users/237321/x4u">x4u</a> who is a user contributing
 * to stackoverflow.com.
 *
 * @author dougestep
 */
@SuppressWarnings("SpellCheckingInspection")
public class HalfPrecisionFloat {
    public static double opt = 0.005;
    public static boolean usePrecisionLost = false;
    private final short halfPrecision;
    private static final Random random = new Random();

    /**
     * Creates an instance of this class from the supplied
     * full-precision floating point number.
     *
     * @param number the float number.
     */
    public HalfPrecisionFloat(final float number) {
        final int val = fromFullPrecision(number);
        halfPrecision = (short) val;
    }

    public static void onChanged(ServerPlayer player) {
        try {
            GachaServer.data.enableCollapsing = usePrecisionLost;
            GachaServer.data.collapsingArg = opt;
            GachaServer.onDataChange();

            if (usePrecisionLost) PrimogemCraftAdvancements.WORLD_COLLAPSING.trigger(player);
        } catch (Exception ignored) {
        }
    }

    /**
     * Returns the full-precision float number from the half-precision
     * value assigned on this instance.
     *
     * @return the full-precision floating pointing number.
     */
    private float toFullPrecision() {
        int mantisa = halfPrecision & 0x03ff;
        int exponent = halfPrecision & 0x7c00;

        if (exponent == 0x7c00) {
            exponent = 0x3fc00;
        } else if (exponent != 0) {
            exponent += 0x1c000;
            if (mantisa == 0 && exponent > 0x1c400) {
                return Float.intBitsToFloat((halfPrecision & 0x8000) << 16 | exponent << 13 | 0x3ff);
            }
        } else if (mantisa != 0) {
            exponent = 0x1c400;
            do {
                mantisa <<= 1;
                exponent -= 0x400;
            } while ((mantisa & 0x400) == 0);
            mantisa &= 0x3ff;
        }

        return Float.intBitsToFloat((halfPrecision & 0x8000) << 16 | (exponent | mantisa) << 13);
    }

    /**
     * Returns the integer representation of the supplied
     * full-precision floating pointing number.
     *
     * @param number the full-precision floating pointing number.
     * @return the integer representation.
     */
    private int fromFullPrecision(final float number) {
        int fbits = Float.floatToIntBits(number);
        int sign = fbits >>> 16 & 0x8000;

        int val = (fbits & 0x7fffffff) + 0x1000;

        if (val >= 0x47800000) {
            if ((fbits & 0x7fffffff) >= 0x47800000) {
                if (val < 0x7f800000) {
                    return sign | 0x7c00;
                }
                return sign | 0x7c00 | (fbits & 0x007fffff) >>> 13;
            }
            return sign | 0x7bff;
        }
        if (val >= 0x38800000) {
            return sign | val - 0x38000000 >>> 13;
        }
        if (val < 0x33000000) {
            return sign;
        }
        val = (fbits & 0x7fffffff) >>> 23;
        return sign | ((fbits & 0x7fffff | 0x800000) + (0x800000 >>> val - 102) >>> 126 - val);
    }

    public static double toHalf(float old) {
        if (usePrecisionLost) {
            if (random.nextDouble(0, 1) < opt) return new HalfPrecisionFloat(old).toFullPrecision();
            else return old;
        } else return old;
    }
}