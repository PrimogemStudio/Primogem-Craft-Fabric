package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(StemBlock.class)
public class StemBlockMixin {
    @ModifyExpressionValue(method = "randomTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z", ordinal = 0))
    private boolean randomTick(boolean original, @Local ServerLevel level, @Local(ordinal = 1) BlockPos blockPos, @Local(ordinal = 1) BlockState blockState) {
        if (blockState.getBlock() instanceof BlockExtension be) {
            return original || be.canSustainPlant(blockState, level, blockPos.below(), Direction.UP);
        }
        return original;
    }
}
