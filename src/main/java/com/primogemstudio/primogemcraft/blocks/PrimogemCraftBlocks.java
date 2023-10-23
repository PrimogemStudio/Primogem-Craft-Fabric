package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.DendroCoreBlock;
import com.primogemstudio.primogemcraft.blocks.instances.PrimogemBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftBlocks {
    public static final DendroCoreBlock DENDRO_CORE_BLOCK = register("dendro_core_block", new DendroCoreBlock());
    public static final PrimogemBlock PRIMOGEM_BLOCK = register("primogem_block", new PrimogemBlock());

    private static <T extends Block> T register(String id, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, id), block);
    }
}
