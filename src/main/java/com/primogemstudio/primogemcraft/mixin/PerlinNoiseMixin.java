package com.primogemstudio.primogemcraft.mixin;

import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PerlinNoise.class)
public class PerlinNoiseMixin {
    /**
     * @author hackermdch
     * @reason recreate the border land
     */
    @Overwrite
    public static double wrap(double value) {
        return value;
    }
}
