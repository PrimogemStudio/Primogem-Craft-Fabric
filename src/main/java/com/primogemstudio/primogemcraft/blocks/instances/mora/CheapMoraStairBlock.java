package com.primogemstudio.primogemcraft.blocks.instances.mora;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class CheapMoraStairBlock extends StairBlock {
    public CheapMoraStairBlock() {
        super(Blocks.AIR.defaultBlockState(), Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.0F, 4.0F).requiresCorrectToolForDrops().dynamicShape());
    }

    @Override
    public float getExplosionResistance() {
        return 4f;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return false;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }
}
