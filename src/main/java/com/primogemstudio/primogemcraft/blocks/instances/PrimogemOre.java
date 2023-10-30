package com.primogemstudio.primogemcraft.blocks.instances;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.List;

public class PrimogemOre extends Block {
    public PrimogemOre() {
        super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.ANCIENT_DEBRIS).strength(3.0F, 5.0F).requiresCorrectToolForDrops());
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        list.add(Component.literal("再氪两单嘛~"));
    }

    @SuppressWarnings("deprecation")
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() == this;
    }

    @SuppressWarnings("deprecation")
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }
}
