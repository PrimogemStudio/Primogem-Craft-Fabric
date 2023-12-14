package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FarmBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FarmBlock.class)
public class FarmBlockMixin {
    @ModifyReturnValue(method = "shouldMaintainFarmland", at = @At("TAIL"))
    private static boolean shouldMaintainFarmland(boolean original, BlockGetter level, BlockPos pos) {
        var bl = level.getBlockState(pos.above()).getBlock();
        if (bl instanceof BlockExtension be && be.canSustainPlant(level.getBlockState(pos.above()), level, pos, Direction.UP)) {
            return true;
        }
        return original;
    }
}
