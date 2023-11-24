package com.primogemstudio.primogemcraft.blocks.instances.dendrocore;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class DendroCorePlankStairsBlock extends StairBlock {
    public DendroCorePlankStairsBlock() {
        super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(3f, 2f).dynamicShape());
    }

    @Override
    public float getExplosionResistance() {
        return 2f;
    }

    @Override
    public boolean isRandomlyTicking(BlockState p_56947_) {
        return false;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }
}