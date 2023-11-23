package com.primogemstudio.primogemcraft.blocks.instances;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class RustedPlankStairsBlock extends StairBlock {
    public RustedPlankStairsBlock() {
        super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
    }

    @Override
    public float getExplosionResistance() {
        return 1f;
    }

    @Override
    public boolean isRandomlyTicking(BlockState p_56947_) {
        return false;
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
    }

    public static void registerRenderLayer() {
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.RUSTED_PLANK_STAIR_BLOCK, RenderType.cutout());
    }
}
