package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.items.instances.DendroPickaxeItem;
import com.primogemstudio.primogemcraft.items.instances.IntertwinedFateItem;
import com.primogemstudio.primogemcraft.items.instances.PrimogemItem;
import com.primogemstudio.primogemcraft.items.instances.TheAllBeginningItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.DENDRO_CORE_BLOCK;

public class PrimogemCraftItems {
    public static TheAllBeginningItem THE_ALL_BEGINNING;
    public static Item PRIMOGEM;
    public static BlockItem DENDRO_CORE_BLOCK_ITEM;
    public static Item VAYUDA_TURQUOISE_GEMSTONE;
    public static IntertwinedFateItem INTERTWINED_FATE;
    public static DendroPickaxeItem DENDRO_PICKAXE;
    public static void init() {
        THE_ALL_BEGINNING = register("the_all_beginning", new TheAllBeginningItem());
        PRIMOGEM = register("primogem", new PrimogemItem());
        DENDRO_CORE_BLOCK_ITEM = register("dendro_core_block", new BlockItem(DENDRO_CORE_BLOCK, new Item.Properties()));
        VAYUDA_TURQUOISE_GEMSTONE = register("vayuda_turquoise_gemstone", new Item(new Item.Properties()));
        INTERTWINED_FATE = register("intertwined_fate", new IntertwinedFateItem());
        DENDRO_PICKAXE = register("dendro_pickaxe", new DendroPickaxeItem());
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
