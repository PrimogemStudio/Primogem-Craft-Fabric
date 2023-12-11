package com.primogemstudio.primogemcraft.mixin.blocks;

import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    public void canSurvive(BlockState state, LevelReader level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        var bs = level.getBlockState(pos.below());
        if (bs.getBlock() instanceof BlockExtension be) {
            cir.setReturnValue(be.canSustainPlant(bs, level, pos, Direction.UP) && !level.getBlockState(pos.above()).liquid());
        }
    }
}
