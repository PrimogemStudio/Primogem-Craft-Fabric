package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.GrassCoreBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MODID;

public class PrimogemCraftBlocks {
    private static GrassCoreBlock GRASS_CORE_BLOCK;
    public static void init() {
        GRASS_CORE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MODID, "caoyuanhekuai"), new GrassCoreBlock());
    }
}
