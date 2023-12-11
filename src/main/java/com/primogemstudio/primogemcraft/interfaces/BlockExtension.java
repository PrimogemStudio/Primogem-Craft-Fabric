package com.primogemstudio.primogemcraft.interfaces;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public interface BlockExtension {
    default void onDestroyedByPlayer(Level level, Player player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack tool) {}
    default boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing) {
        return false;
    }
}
