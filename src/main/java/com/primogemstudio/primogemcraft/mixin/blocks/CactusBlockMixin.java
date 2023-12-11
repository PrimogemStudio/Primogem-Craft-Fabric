package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
    @SuppressWarnings("deprecation")
    @ModifyReturnValue(method = "canSurvive", at = @At("TAIL"))
    public boolean canSurvive(boolean original, BlockState state, LevelReader level, BlockPos pos) {
        var bs = level.getBlockState(pos.below());
        if (bs.getBlock() instanceof BlockExtension be) {
            return be.canSustainPlant(bs, level, pos, Direction.UP) && !level.getBlockState(pos.above()).liquid();
        }
        return original;
    }
}
