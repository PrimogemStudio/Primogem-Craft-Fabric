package com.primogemstudio.primogemcraft.mixin.blocks;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.primogemstudio.primogemcraft.interfaces.BlockExtension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MushroomBlock.class)
public class MushroomBlockMixin {
    @ModifyReturnValue(method = "canSurvive", at = @At("TAIL"))
    public boolean canSurvive(boolean original, BlockState state, LevelReader level, BlockPos pos) {
        if (state.getBlock() == (Object) this) {
            var bl = level.getBlockState(pos.below());
            if (bl.getBlock() instanceof BlockExtension be && be.canSustainPlant(bl, level, pos.below(), Direction.UP)) {
                return true;
            }
        }
        return original;
    }
}
