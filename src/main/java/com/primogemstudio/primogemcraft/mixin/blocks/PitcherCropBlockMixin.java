package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.PitcherCropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PitcherCropBlock.class)
public abstract class PitcherCropBlockMixin extends DoublePlantBlock {
    public PitcherCropBlockMixin(Properties properties) {
        super(properties);
    }

    @ModifyReturnValue(method = "canSurvive", at = @At(value = "RETURN", ordinal = 0))
    private boolean canSurvive(boolean original, BlockState state, LevelReader level, BlockPos pos) {
        return super.canSurvive(state, level, pos);
    }

    @ModifyReturnValue(method = "canSurvive", at = @At("TAIL"))
    private boolean canSurvive2(boolean original, BlockState state, LevelReader level, BlockPos pos) {
        var below = pos.below();
        var isSoil = mayPlaceOn(level.getBlockState(below), level, below);
        var bs = level.getBlockState(below);
        if (state.getBlock() == this && bs instanceof BlockExtension be) {
            isSoil = be.canSustainPlant(bs, level, below, Direction.UP);
        }
        return isSoil && sufficientLight(level, pos) && (state.getValue(AGE) < 3 || isUpper(level.getBlockState(pos.above())));
    }

    @Shadow
    @Final
    public static IntegerProperty AGE;

    @Shadow
    private static boolean sufficientLight(LevelReader level, BlockPos pos) {
        return false;
    }

    @Shadow
    private static boolean isUpper(BlockState state) {
        return false;
    }
}
