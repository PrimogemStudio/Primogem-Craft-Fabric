package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.items.instances.*;
import com.primogemstudio.primogemcraft.items.instances.records.ANewDayWithHopeItem;
import com.primogemstudio.primogemcraft.items.instances.records.HakushinLullabyItem;
import com.primogemstudio.primogemcraft.items.instances.records.TheFadingStoriesItem;
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
    public static final PrimogemPickaxeItem PRIMOGEM_PICKAXE = register("primogem_pickaxe", new PrimogemPickaxeItem());
    public static final ANewDayWithHopeItem A_NEW_DAY_WITH_HOPE_RECORD = register("music_disc_a_new_day_with_hope", new ANewDayWithHopeItem());
    public static final TheFadingStoriesItem THE_FADING_STORIES = register("music_disc_the_fading_stories", new TheFadingStoriesItem());
    public static final HakushinLullabyItem HAKUSHIN_LULLABY = register("music_disc_hakushin_lullaby", new HakushinLullabyItem());
    public static final IntertwinedFateTenTimesItem INTERTWINED_FATE_TEN = register("intertwined_fate_ten", new IntertwinedFateTenTimesItem());

    public static void init() {
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
