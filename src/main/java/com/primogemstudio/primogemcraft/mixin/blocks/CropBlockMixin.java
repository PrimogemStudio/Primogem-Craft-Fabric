package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CropBlock.class)
public class CropBlockMixin {
    @ModifyArg(method = "getGrowthSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/BlockGetter;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", ordinal = 0))
    private static BlockPos getBlockState(BlockPos arg, @Share("pos") LocalRef<BlockPos> pos) {
        pos.set(arg);
        return arg;
    }

    @Redirect(method = "getGrowthSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z", ordinal = 0))
    private static boolean getGrowthSpeed(BlockState instance, Block ob, Block block, BlockGetter level, BlockPos pos, @Share("pos") LocalRef<BlockPos> bp) {
        if (instance.getBlock() instanceof BlockExtension be) {
            return be.canSustainPlant(instance, level, bp.get(), Direction.UP);
        }
        return instance.is(ob);
    }
}
