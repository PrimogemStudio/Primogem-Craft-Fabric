package com.primogemstudio.primogemcraft.blocks.instances;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CheapMoraSlabBlock extends SlabBlock {
    public CheapMoraSlabBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 4f).requiresCorrectToolForDrops());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }
}
