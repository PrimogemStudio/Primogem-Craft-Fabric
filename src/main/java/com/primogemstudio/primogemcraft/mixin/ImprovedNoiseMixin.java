package com.primogemstudio.primogemcraft.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.level.levelgen.synth.ImprovedNoise;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static com.primogemstudio.primogemcraft.util.HalfPrecisionFloat.toHalf;
import static com.primogemstudio.primogemcraft.util.HalfPrecisionFloat.usePrecisionLost;

/**
 * @author coder2
 * recreate the sharp far land (x/z = ±784400)
 */
@Mixin(ImprovedNoise.class)
public abstract class ImprovedNoiseMixin {
    @ModifyVariable(method = "noise(DDDDD)D", ordinal = 8, at = @At(value = "STORE", opcode = Opcodes.DSTORE))
    private double noise$mv1(double value, @Local(ordinal = 5) double d, @Local(ordinal = 0) int i) {
        if (usePrecisionLost) return d - toHalf(i);
        return d - (double) i;
    }

    @ModifyVariable(method = "noise(DDDDD)D", ordinal = 9, at = @At(value = "STORE", opcode = Opcodes.DSTORE))
    private double noise$mv2(double value, @Local(ordinal = 6) double e, @Local(ordinal = 1) int j) {
        if (usePrecisionLost) return e - toHalf(j);
        else return e - (double) j;
    }

    @ModifyVariable(method = "noise(DDDDD)D", ordinal = 10, at = @At(value = "STORE", opcode = Opcodes.DSTORE))
    private double noise$mv3(double value, @Local(ordinal = 7) double f, @Local(ordinal = 2) int k) {
        if (usePrecisionLost) return f - toHalf(k);
        return f - (double) k;
    }

    @WrapOperation(method = "noiseWithDerivative", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/synth/ImprovedNoise;sampleWithDerivative(IIIDDD[D)D"))
    private double onNoiseWithDerivative(ImprovedNoise instance, int gridX, int gridY, int gridZ, double deltaX, double deltaY, double deltaZ, double[] noiseValues, Operation<Double> original, @Local(ordinal = 3) double d, @Local(ordinal = 4) double e, @Local(ordinal = 5) double f) {
        return original.call(
                instance,
                gridX, gridY, gridZ,
                usePrecisionLost ? d - toHalf(gridX) : d - (double) gridX,
                usePrecisionLost ? e - toHalf(gridY) : e - (double) gridY,
                usePrecisionLost ? f - toHalf(gridZ) : f - (double) gridZ,
                noiseValues
        );
    }
}