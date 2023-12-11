package com.primogemstudio.primogemcraft.mixin.blocks;

import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BushBlock.class)
public class BushBlockMixin {
    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    public void canSurvive(BlockState state, LevelReader level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (state.getBlock() == (Object) this) {
            var bl = level.getBlockState(pos.below());
            if (bl.getBlock() instanceof BlockExtension be) cir.setReturnValue(be.canSustainPlant(bl, level, pos.below(), Direction.UP));
        }
    }
}
