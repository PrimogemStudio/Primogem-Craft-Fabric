package com.primogemstudio.primogemcraft.blocks.instances;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class ExquisiteMoraBlock extends Block {
    public ExquisiteMoraBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4f, 100f).requiresCorrectToolForDrops());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.exquisite_mora_block.line1"));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }
}
