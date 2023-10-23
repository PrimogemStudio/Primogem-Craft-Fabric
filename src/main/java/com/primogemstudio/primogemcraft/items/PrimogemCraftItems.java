package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.items.instances.DendroPickaxeItem;
import com.primogemstudio.primogemcraft.items.instances.IntertwinedFateItem;
import com.primogemstudio.primogemcraft.items.instances.PrimogemItem;
import com.primogemstudio.primogemcraft.items.instances.TheAllBeginningItem;
import com.primogemstudio.primogemcraft.items.instances.records.ANewDayWithHopeItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.DENDRO_CORE_BLOCK;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.PRIMOGEM_BLOCK;

public class PrimogemCraftItems {
    public static final TheAllBeginningItem THE_ALL_BEGINNING = register("the_all_beginning", new TheAllBeginningItem());
    public static final Item PRIMOGEM = register("primogem", new PrimogemItem());
    public static final BlockItem DENDRO_CORE_BLOCK_ITEM = register("dendro_core_block", new BlockItem(DENDRO_CORE_BLOCK, new Item.Properties()));
    public static final BlockItem PRIMOGEM_BLOCK_ITEM = register("primogem_block", new BlockItem(PRIMOGEM_BLOCK, new Item.Properties()));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE = register("vayuda_turquoise_gemstone", new Item(new Item.Properties()));
    public static final IntertwinedFateItem INTERTWINED_FATE = register("intertwined_fate", new IntertwinedFateItem());
    public static final DendroPickaxeItem DENDRO_PICKAXE = register("dendro_pickaxe", new DendroPickaxeItem());
    public static final ANewDayWithHopeItem A_NEW_DAY_WITH_HOPE_RECORD = register("music_disc_a_new_day_with_hope", new ANewDayWithHopeItem());

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
