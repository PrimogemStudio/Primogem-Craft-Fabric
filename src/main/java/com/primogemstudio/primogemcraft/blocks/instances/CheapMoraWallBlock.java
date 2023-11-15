package com.primogemstudio.primogemcraft.blocks.instances;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CheapMoraWallBlock extends WallBlock {
    public CheapMoraWallBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 30f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).requiresCorrectToolForDrops());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public static void registerRenderLayer() {
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.CHEAP_MORA_WALL, RenderType.cutout());
    }
}