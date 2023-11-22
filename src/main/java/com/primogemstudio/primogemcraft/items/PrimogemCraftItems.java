package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.items.instances.*;
import com.primogemstudio.primogemcraft.items.instances.mora.*;
import com.primogemstudio.primogemcraft.items.instances.primogem.*;
import com.primogemstudio.primogemcraft.items.instances.records.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.*;

public class PrimogemCraftItems {
    public static final TheAllBeginningItem THE_ALL_BEGINNING = register("the_all_beginning", new TheAllBeginningItem());
    public static final PrimogemItem PRIMOGEM = register("primogem", new PrimogemItem());
    public static final OldStoneItem OLD_STONE = register("old_stone", new OldStoneItem());
    public static final Item MASTER_LESS_STAR_DUST = register("masterless_stardust", new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final Item MASTER_LESS_STARG_LITTER = register("masterless_starglitter", new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final PrimogemBilletItem PRIMOGEM_BILLET = register("primogem_billet", new PrimogemBilletItem());
    public static final BlockItem DENDRO_CORE_BLOCK_ITEM = register("dendro_core_block", new BlockItem(DENDRO_CORE_BLOCK, new Item.Properties()));
    public static final BlockItem PRIMOGEM_BLOCK_ITEM = register("primogem_block", new BlockItem(PRIMOGEM_BLOCK, new Item.Properties()));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE = register("vayuda_turquoise_gemstone", new Item(new Item.Properties()));
    public static final IntertwinedFateItem INTERTWINED_FATE = register("intertwined_fate", new IntertwinedFateItem());
    public static final AcquaintFateItem ACQUAINT_FATE = register("acquaint_fate", new AcquaintFateItem());
    public static final DendroPickaxeItem DENDRO_PICKAXE = register("dendro_pickaxe", new DendroPickaxeItem());
    public static final PrimogemPickaxeItem PRIMOGEM_PICKAXE = register("primogem_pickaxe", new PrimogemPickaxeItem());
    public static final PrimogemHoeItem PRIMOGEM_HOE = register("primogem_hoe", new PrimogemHoeItem());
    public static final PrimogemAxeItem PRIMOGEM_AXE = register("primogem_axe", new PrimogemAxeItem());
    public static final PrimogemShovelItem PRIMOGEM_SHOVEL = register("primogem_shovel", new PrimogemShovelItem());
    public static final PrimogemSwordItem PRIMOGEM_SWORD = register("primogem_sword", new PrimogemSwordItem());
    public static final DullBladeItem DULL_BLADE = register("dull_blade", new DullBladeItem());
    public static final ANewDayWithHopeItem A_NEW_DAY_WITH_HOPE_RECORD = register("music_disc_a_new_day_with_hope", new ANewDayWithHopeItem());
    public static final TheFadingStoriesItem THE_FADING_STORIES = register("music_disc_the_fading_stories", new TheFadingStoriesItem());
    public static final HakushinLullabyItem HAKUSHIN_LULLABY = register("music_disc_hakushin_lullaby", new HakushinLullabyItem());
    public static final VillageSurroundedByGreenItem VILLAGE_SURROUNDED_BY_GREEN = register("music_disc_village_surrounded_by_green", new VillageSurroundedByGreenItem());
    public static final SpaceWalkItem SPACE_WALK = register("music_disc_space_walk", new SpaceWalkItem());
    public static final SaltyMoonItem SALTY_MOON = register("music_disc_salty_moon", new SaltyMoonItem());
    public static final TakeTheJourneyItem TAKE_THE_JOURNEY = register("music_disc_take_the_journey", new TakeTheJourneyItem());
    public static final IntertwinedFateTenTimesItem INTERTWINED_FATE_TEN = register("intertwined_fate_ten", new IntertwinedFateTenTimesItem());
    public static final Item MORA_BILLET = register("mora_billet", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final Item MORA = register("mora", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final ExquisiteMoraItem EXQUISITE_MORA = register("exquisite_mora", new ExquisiteMoraItem());
    public static final ExquisiteMoraBagItem EXQUISITE_MORA_BAG = register("exquisite_mora_bag", new ExquisiteMoraBagItem());
    public static final MoraWalletItem MORA_WALLET = register("mora_wallet", new MoraWalletItem());
    public static final StrangePrimogemSwordItem STRANGE_PRIMOGEM_SWORD = register("strange_primogem_sword", new StrangePrimogemSwordItem());
    public static final BlockItem PRIMOGEM_ORE_ITEM = register("primogem_ore", new BlockItem(PRIMOGEM_ORE, new Item.Properties()));
    public static final BlockItem INTERTWINED_FATE_BLOCK_ITEM = register("intertwined_fate_block", new BlockItem(INTERTWINED_FATE_BLOCK, new Item.Properties()));
    public static final BlockItem MORA_BUNCH_BLOCK_ITEM = register("mora_bunch_block", new BlockItem(MORA_BUNCH, new Item.Properties()));
    public static final BlockItem MORA_BLOCK_ITEM = register("mora_block", new BlockItem(MORA_BLOCK, new Item.Properties()));
    public static final BlockItem EXQUISITE_MORA_BLOCK_ITEM = register("exquisite_mora_block", new BlockItem(EXQUISITE_MORA_BLOCK, new Item.Properties()));
    public static final BlockItem CHEAP_MORA_BLOCK_ITEM = register("cheap_mora_block", new BlockItem(CHEAP_MORA_BLOCK, new Item.Properties()));
    public static final BlockItem CHEAP_MORA_SLAB_ITEM = register("cheap_mora_slab", new BlockItem(CHEAP_MORA_SLAB, new Item.Properties()));
    public static final BlockItem CHEAP_MORA_STAIR_ITEM = register("cheap_mora_stair", new BlockItem(CHEAP_MORA_STAIR, new Item.Properties()));
    public static final BlockItem CHEAP_MORA_WALL_ITEM = register("cheap_mora_wall", new BlockItem(CHEAP_MORA_WALL, new Item.Properties()));
    public static final MoraPickaxeItem MORA_PICKAXE_ITEM = register("mora_pickaxe", new MoraPickaxeItem());
    public static final MoraSwordItem MORA_SWORD_ITEM = register("mora_sword", new MoraSwordItem());
    public static final MoraShovelItem MORA_SHOVEL_ITEM = register("mora_shovel", new MoraShovelItem());
    public static final MoraHoeItem MORA_HOE_ITEM = register("mora_hoe", new MoraHoeItem());
    public static final MoraAxeItem MORA_AXE_ITEM = register("mora_axe", new MoraAxeItem());
    public static final MoraArmorItem.MoraHelmet MORA_HELMET_ITEM = register("mora_helmet", new MoraArmorItem.MoraHelmet());
    public static final MoraArmorItem.MoraChestplate MORA_CHESTPLATE_ITEM = register("mora_chestplate", new MoraArmorItem.MoraChestplate());
    public static final MoraArmorItem.MoraLeggings MORA_LEGGINGS_ITEM = register("mora_leggings", new MoraArmorItem.MoraLeggings());
    public static final MoraArmorItem.MoraBoots MORA_BOOTS_ITEM = register("mora_boots", new MoraArmorItem.MoraBoots());
    public static final BlockItem TEYVAT_PLANKS_BLOCK_ITEM = register("teyvat_planks", new BlockItem(TEYVAT_PLANKS_BLOCK, new Item.Properties()));
    public static final BlockItem TEYVAT_PLANK_SLAB_BLOCK_ITEM = register("teyvat_plank_slab", new BlockItem(TEYVAT_PLANK_SLAB_BLOCK, new Item.Properties()));
    public static final BlockItem TEYVAT_PLANK_STAIR_BLOCK_ITEM = register("teyvat_plank_stair", new BlockItem(TEYVAT_PLANK_STAIR_BLOCK, new Item.Properties()));
    public static final BlockItem TEYVAT_PLANK_FENCE_BLOCK_ITEM = register("teyvat_plank_fence", new BlockItem(TEYVAT_PLANK_FENCE_BLOCK, new Item.Properties()));
    public static final BlockItem TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM = register("teyvat_plank_fence_gate", new BlockItem(TEYVAT_PLANK_FENCE_GATE_BLOCK, new Item.Properties()));
    public static final Item TEYVAT_STICK_ITEM = register("teyvat_stick", new Item(new Item.Properties()));
    public static final BlockItem BLUE_TEYVAT_PLANKS_BLOCK_ITEM = register("blue_teyvat_planks", new BlockItem(BLUE_TEYVAT_PLANKS_BLOCK, new Item.Properties()));
    public static final BlockItem BLUE_TEYVAT_PLANK_SLAB_BLOCK_ITEM = register("blue_teyvat_plank_slab", new BlockItem(BLUE_TEYVAT_PLANK_SLAB_BLOCK, new Item.Properties()));
    public static final BlockItem BLUE_TEYVAT_PLANK_STAIR_BLOCK_ITEM = register("blue_teyvat_plank_stair", new BlockItem(BLUE_TEYVAT_PLANK_STAIR_BLOCK, new Item.Properties()));
    public static final BlockItem BLUE_TEYVAT_PLANK_FENCE_BLOCK_ITEM = register("blue_teyvat_plank_fence", new BlockItem(BLUE_TEYVAT_PLANK_FENCE_BLOCK, new Item.Properties()));
    public static final BlockItem BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM = register("blue_teyvat_plank_fence_gate", new BlockItem(BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK, new Item.Properties()));
    public static final BlockItem PINK_TEYVAT_PLANKS_BLOCK_ITEM = register("pink_teyvat_planks", new BlockItem(PINK_TEYVAT_PLANKS_BLOCK, new Item.Properties()));

    public static final BlockItem PINK_TEYVAT_PLANK_SLAB_BLOCK_ITEM = register("pink_teyvat_plank_slab", new BlockItem(PINK_TEYVAT_PLANK_SLAB_BLOCK, new Item.Properties()));
    public static final BlockItem PINK_TEYVAT_PLANK_STAIR_BLOCK_ITEM = register("pink_teyvat_plank_stair", new BlockItem(PINK_TEYVAT_PLANK_STAIR_BLOCK, new Item.Properties()));
    public static final BlockItem PINK_TEYVAT_PLANK_FENCE_BLOCK_ITEM = register("pink_teyvat_plank_fence", new BlockItem(PINK_TEYVAT_PLANK_FENCE_BLOCK, new Item.Properties()));
    public static final BlockItem PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM = register("pink_teyvat_plank_fence_gate", new BlockItem(PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK, new Item.Properties()));
    public static final BlockItem CHAR_COAL_BLOCK_ITEM = register("charcoal_block", new BlockItem(CHAR_COAL_BLOCK, new Item.Properties()));
    public static final BlockItem RUSTED_PLANK_BLOCK_ITEM = register("rusted_plank", new BlockItem(RUSTED_PLANK_BLOCK, new Item.Properties()));
    public static void init() {
        PrimogemCraftMobEffects.init();
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
