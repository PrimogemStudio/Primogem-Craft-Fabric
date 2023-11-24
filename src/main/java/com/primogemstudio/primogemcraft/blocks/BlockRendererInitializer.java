package com.primogemstudio.primogemcraft.blocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class BlockRendererInitializer {
    public static void init() {
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.MORA_BUNCH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.CHEAP_MORA_WALL, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PrimogemCraftBlocks.RUSTED_PLANK_STAIR_BLOCK, RenderType.cutout());
    }
}
