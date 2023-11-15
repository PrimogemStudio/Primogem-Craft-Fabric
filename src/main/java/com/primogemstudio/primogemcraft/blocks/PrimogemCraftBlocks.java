package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftBlocks {
    public static final DendroCoreBlock DENDRO_CORE_BLOCK = register("dendro_core_block", new DendroCoreBlock());
    public static final PrimogemBlock PRIMOGEM_BLOCK = register("primogem_block", new PrimogemBlock());
    public static final PrimogemOre PRIMOGEM_ORE = register("primogem_ore", new PrimogemOre());
    public static final IntertwinedFateBlock INTERTWINED_FATE_BLOCK = register("intertwined_fate_block", new IntertwinedFateBlock());
    public static final MoraBunchBlock MORA_BUNCH = register("mora_bunch_block", new MoraBunchBlock());
    public static final MoraBlock MORA_BLOCK = register("mora_block", new MoraBlock());
    public static final ExquisiteMoraBlock EXQUISITE_MORA_BLOCK = register("exquisite_mora_block", new ExquisiteMoraBlock());
    public static final CheapMoraBlock CHEAP_MORA_BLOCK = register("cheap_mora_block", new CheapMoraBlock());
    public static final CheapMoraSlabBlock CHEAP_MORA_SLAB = register("cheap_mora_slab", new CheapMoraSlabBlock());
    public static final CheapMoraStairBlock CHEAP_MORA_STAIR = register("cheap_mora_stair", new CheapMoraStairBlock());
    public static final CheapMoraWallBlock CHEAP_MORA_WALL = register("cheap_mora_wall", new CheapMoraWallBlock());
    static {
        MoraBunchBlock.registerRenderLayer();
        CheapMoraWallBlock.registerRenderLayer();
    }
    private static <T extends Block> T register(String id, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, id), block);
    }
}
