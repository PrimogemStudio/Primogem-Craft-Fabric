package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.GrassCoreBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MODID;

public class PrimogemCraftBlocks {
    private static GrassCoreBlock GRASS_CORE_BLOCK;
    public static void init() {
        GRASS_CORE_BLOCK = Registry.register(
                BuiltInRegistries.BLOCK,
                new ResourceLocation(MODID, "caoyuanhekuai"),
                new GrassCoreBlock()
        );
    }
}
