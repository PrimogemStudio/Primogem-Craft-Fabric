package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.items.instances.IntertwinedFate;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.*;

public class PrimogemCraftItems {
    public static Item PRIMOGEM;
    public static BlockItem DENDRO_CORE_BLOCK_ITEM;
    public static Item VAYUDA_TURQUOISE_GEMSTONE;
    public static IntertwinedFate INTERTWINED_FATE;

    public static void init() {
        PRIMOGEM = register("primogem", new Item(new Item.Properties().rarity(Rarity.EPIC)));
        DENDRO_CORE_BLOCK_ITEM = register("dendro_core_block", new BlockItem(DENDRO_CORE_BLOCK, new Item.Properties()));
        VAYUDA_TURQUOISE_GEMSTONE = register("vayuda_turquoise_gemstone", new Item(new Item.Properties()));
        INTERTWINED_FATE = register("intertwined_fate", new IntertwinedFate());
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
