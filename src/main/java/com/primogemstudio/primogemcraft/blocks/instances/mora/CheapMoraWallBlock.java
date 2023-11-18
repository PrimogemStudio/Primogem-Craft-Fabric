package com.primogemstudio.primogemcraft.blocks.instances.mora;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class CheapMoraWallBlock extends WallBlock {
    public CheapMoraWallBlock() {
        super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(3.0F, 30.0F).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().forceSolidOn());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public static void registerRenderLayer() {
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.CHEAP_MORA_WALL, RenderType.cutout());
    }
}