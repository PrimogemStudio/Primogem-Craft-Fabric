package com.primogemstudio.primogemcraft.mixin;

import com.primogemstudio.primogemcraft.util.HalfPrecisionFloat;
import net.minecraft.util.Mth;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PerlinNoise.class)
public class PerlinNoiseMixin {
    /**
     * @author hackermdch
     * @reason recreate the far land (x/z = ±12550821 in 1.18-, x/z = ±1606505300 in 1.18+)
     */
    @Overwrite
    public static double wrap(double value) {
        if (HalfPrecisionFloat.usePrecisionLost) return value;
        else return value - (double) Mth.lfloor(value / 3.3554432E7 + 0.5) * 3.3554432E7;
    }
}
