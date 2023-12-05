package com.primogemstudio.primogemcraft.items;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.items.instances.*;
import com.primogemstudio.primogemcraft.items.instances.curios.SocietyTicketItem;
import com.primogemstudio.primogemcraft.items.instances.materials.vajrada.*;
import com.primogemstudio.primogemcraft.items.instances.materials.vayuda.*;
import com.primogemstudio.primogemcraft.items.instances.mora.*;
import com.primogemstudio.primogemcraft.items.instances.primogem.*;
import com.primogemstudio.primogemcraft.items.instances.records.*;
import com.primogemstudio.primogemcraft.items.instances.templates.SmithingTemplateElement1Item;
import com.primogemstudio.primogemcraft.items.instances.templates.SmithingTemplateElement2Item;
import com.primogemstudio.primogemcraft.items.instances.templates.SmithingTemplateMoraItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftItems {
    public static final TheAllBeginningItem THE_ALL_BEGINNING_ITEM = register("the_all_beginning", new TheAllBeginningItem());
    public static final PrimogemItem PRIMOGEM_ITEM = register("primogem", new PrimogemItem());
    public static final OldStoneItem OLD_STONE_ITEM = register("old_stone", new OldStoneItem());
    public static final Item MASTER_LESS_STAR_DUST_ITEM = register("masterless_stardust", new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final Item MASTER_LESS_STARG_LITTER_ITEM = register("masterless_starglitter", new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final PrimogemBilletItem PRIMOGEM_BILLET_ITEM = register("primogem_billet", new PrimogemBilletItem());
    public static final IntertwinedFateItem INTERTWINED_FATE_ITEM = register("intertwined_fate", new IntertwinedFateItem());
    public static final AcquaintFateItem ACQUAINT_FATE_ITEM = register("acquaint_fate", new AcquaintFateItem());
    public static final DendroPickaxeItem DENDRO_PICKAXE_ITEM = register("dendro_pickaxe", new DendroPickaxeItem());
    public static final PrimogemPickaxeItem PRIMOGEM_PICKAXE_ITEM = register("primogem_pickaxe", new PrimogemPickaxeItem());
    public static final PrimogemHoeItem PRIMOGEM_HOE_ITEM = register("primogem_hoe", new PrimogemHoeItem());
    public static final PrimogemAxeItem PRIMOGEM_AXE_ITEM = register("primogem_axe", new PrimogemAxeItem());
    public static final PrimogemShovelItem PRIMOGEM_SHOVEL_ITEM = register("primogem_shovel", new PrimogemShovelItem());
    public static final PrimogemSwordItem PRIMOGEM_SWORD_ITEM = register("primogem_sword", new PrimogemSwordItem());
    public static final DullBladeItem DULL_BLADE_ITEM = register("dull_blade", new DullBladeItem());
    public static final ANewDayWithHopeRecordItem A_NEW_DAY_WITH_HOPE_RECORD_ITEM = register("music_disc_a_new_day_with_hope", new ANewDayWithHopeRecordItem());
    public static final TheFadingStoriesRecordItem THE_FADING_STORIES_RECORD_ITEM = register("music_disc_the_fading_stories", new TheFadingStoriesRecordItem());
    public static final HakushinLullabyRecordItem HAKUSHIN_LULLABY_RECORD_ITEM = register("music_disc_hakushin_lullaby", new HakushinLullabyRecordItem());
    public static final VillageSurroundedByGreenRecordItem VILLAGE_SURROUNDED_BY_GREEN_RECORD_ITEM = register("music_disc_village_surrounded_by_green", new VillageSurroundedByGreenRecordItem());
    public static final BalladofManyWatersRecordItem BALLAD_OF_MANY_WATERS_RECORD_ITEM = register("music_disc_ballad_of_many_waters", new BalladofManyWatersRecordItem());
    public static final SpaceWalkRecordItem SPACE_WALK_RECORD_ITEM = register("music_disc_space_walk", new SpaceWalkRecordItem());
    public static final SaltyMoonRecordItem SALTY_MOON_RECORD_ITEM = register("music_disc_salty_moon", new SaltyMoonRecordItem());
    public static final TakeTheJourneyRecordItem TAKE_THE_JOURNEY_RECORD_ITEM = register("music_disc_take_the_journey", new TakeTheJourneyRecordItem());
    public static final IntertwinedFateTenTimesItem INTERTWINED_FATE_TEN_ITEM = register("intertwined_fate_ten", new IntertwinedFateTenTimesItem());
    public static final Item MORA_BILLET_ITEM = register("mora_billet", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final Item MORA_ITEM = register("mora", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final ExquisiteMoraItem EXQUISITE_MORA_ITEM = register("exquisite_mora", new ExquisiteMoraItem());
    public static final ExquisiteMoraBagItem EXQUISITE_MORA_BAG_ITEM = register("exquisite_mora_bag", new ExquisiteMoraBagItem());
    public static final MoraWalletItem MORA_WALLET_ITEM = register("mora_wallet", new MoraWalletItem());
    public static final CosmicFragmentsItem COSMIC_FRAGMENTS_ITEM = register("cosmic_fragments", new CosmicFragmentsItem());
    public static final SocietyTicketItem SOCIETY_TICKET_ITEM = register("society_ticket", new SocietyTicketItem());
    public static final StrangePrimogemSwordItem STRANGE_PRIMOGEM_SWORD_ITEM = register("strange_primogem_sword", new StrangePrimogemSwordItem());
    public static final MoraPickaxeItem MORA_PICKAXE_ITEM = register("mora_pickaxe", new MoraPickaxeItem());
    public static final MoraSwordItem MORA_SWORD_ITEM = register("mora_sword", new MoraSwordItem());
    public static final MoraShovelItem MORA_SHOVEL_ITEM = register("mora_shovel", new MoraShovelItem());
    public static final MoraHoeItem MORA_HOE_ITEM = register("mora_hoe", new MoraHoeItem());
    public static final MoraAxeItem MORA_AXE_ITEM = register("mora_axe", new MoraAxeItem());
    public static final MoraArmorItem.MoraHelmet MORA_HELMET_ITEM = register("mora_helmet", new MoraArmorItem.MoraHelmet());
    public static final MoraArmorItem.MoraChestplate MORA_CHESTPLATE_ITEM = register("mora_chestplate", new MoraArmorItem.MoraChestplate());
    public static final MoraArmorItem.MoraLeggings MORA_LEGGINGS_ITEM = register("mora_leggings", new MoraArmorItem.MoraLeggings());
    public static final MoraArmorItem.MoraBoots MORA_BOOTS_ITEM = register("mora_boots", new MoraArmorItem.MoraBoots());
    public static final Item TEYVAT_STICK_ITEM = register("teyvat_stick", new Item(new Item.Properties()));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE_ITEM = register("vayuda_turquoise_gemstone", new Item(new Item.Properties()));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE_PIECE_ITEM = register("vayuda_turquoise_gemstone_piece", new Item(new Item.Properties()));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE_FRAGMENT_ITEM = register("vayuda_turquoise_gemstone_fragment", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final Item VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM = register("vayuda_turquoise_gemstone_sliver", new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final VayudaTurquoiseGemstoneHoeItem VAYUDA_TURQUOISE_GEMSTONE_HOE_ITEM = register("vayuda_turquoise_gemstone_hoe", new VayudaTurquoiseGemstoneHoeItem());
    public static final VayudaTurquoiseGemstoneAxeItem VAYUDA_TURQUOISE_GEMSTONE_AXE_ITEM = register("vayuda_turquoise_gemstone_axe", new VayudaTurquoiseGemstoneAxeItem());
    public static final VayudaTurquoiseGemstonePickaxeItem VAYUDA_TURQUOISE_GEMSTONE_PICKAXE_ITEM = register("vayuda_turquoise_gemstone_pickaxe", new VayudaTurquoiseGemstonePickaxeItem());
    public static final VayudaTurquoiseGemstoneShovelItem VAYUDA_TURQUOISE_GEMSTONE_SHOVEL_ITEM = register("vayuda_turquoise_gemstone_shovel", new VayudaTurquoiseGemstoneShovelItem());
    public static final VayudaTurquoiseGemstoneIronItem VAYUDA_TURQUOISE_GEMSTONE_IRON_ITEM = register("vayuda_turquoise_gemstone_iron", new VayudaTurquoiseGemstoneIronItem());
    public static final VayudaTurquoiseGemstoneDiamondItem VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_ITEM = register("vayuda_turquoise_gemstone_diamond", new VayudaTurquoiseGemstoneDiamondItem());
    public static final VayudaTurquoiseGemstoneNetheriteItem VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_ITEM = register("vayuda_turquoise_gemstone_netherite", new VayudaTurquoiseGemstoneNetheriteItem());
    public static final VayudaTurquoiseGemstoneIronSwordItem VAYUDA_TURQUOISE_GEMSTONE_IRON_SWORD_ITEM = register("vayuda_turquoise_gemstone_iron_sword", new VayudaTurquoiseGemstoneIronSwordItem());
    public static final VayudaTurquoiseGemstoneDiamondSwordItem VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_SWORD_ITEM = register("vayuda_turquoise_gemstone_diamond_sword", new VayudaTurquoiseGemstoneDiamondSwordItem());
    public static final VayudaTurquoiseGemstoneNetheriteSwordItem VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_SWORD_ITEM = register("vayuda_turquoise_gemstone_netherite_sword", new VayudaTurquoiseGemstoneNetheriteSwordItem());
    public static final VayudaTurquoiseGemstoneNetheriteArmorItem.Helmet VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_HELMET_ITEM = register("vayuda_turquoise_gemstone_netherite_helmet", new VayudaTurquoiseGemstoneNetheriteArmorItem.Helmet());
    public static final VayudaTurquoiseGemstoneNetheriteArmorItem.Chestplate VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_CHESTPLATE_ITEM = register("vayuda_turquoise_gemstone_netherite_chestplate", new VayudaTurquoiseGemstoneNetheriteArmorItem.Chestplate());
    public static final VayudaTurquoiseGemstoneNetheriteArmorItem.Leggings VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_LEGGINGS_ITEM = register("vayuda_turquoise_gemstone_netherite_leggings", new VayudaTurquoiseGemstoneNetheriteArmorItem.Leggings());
    public static final VayudaTurquoiseGemstoneNetheriteArmorItem.Boots VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_BOOTS_ITEM = register("vayuda_turquoise_gemstone_netherite_boots", new VayudaTurquoiseGemstoneNetheriteArmorItem.Boots());

    public static final VayudaTurquoiseGemstoneDiamondArmorItem.Helmet VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_HELMET_ITEM = register("vayuda_turquoise_gemstone_diamond_helmet", new VayudaTurquoiseGemstoneDiamondArmorItem.Helmet());
    public static final VayudaTurquoiseGemstoneDiamondArmorItem.Chestplate VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_CHESTPLATE_ITEM = register("vayuda_turquoise_gemstone_diamond_chestplate", new VayudaTurquoiseGemstoneDiamondArmorItem.Chestplate());
    public static final VayudaTurquoiseGemstoneDiamondArmorItem.Leggings VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_LEGGINGS_ITEM = register("vayuda_turquoise_gemstone_diamond_leggings", new VayudaTurquoiseGemstoneDiamondArmorItem.Leggings());
    public static final VayudaTurquoiseGemstoneDiamondArmorItem.Boots VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_BOOTS_ITEM = register("vayuda_turquoise_gemstone_diamond_boots", new VayudaTurquoiseGemstoneDiamondArmorItem.Boots());

    public static final VayudaTurquoiseGemstoneIronArmorItem.Helmet VAYUDA_TURQUOISE_GEMSTONE_IRON_HELMET_ITEM = register("vayuda_turquoise_gemstone_iron_helmet", new VayudaTurquoiseGemstoneIronArmorItem.Helmet());
    public static final VayudaTurquoiseGemstoneIronArmorItem.Chestplate VAYUDA_TURQUOISE_GEMSTONE_IRON_CHESTPLATE_ITEM = register("vayuda_turquoise_gemstone_iron_chestplate", new VayudaTurquoiseGemstoneIronArmorItem.Chestplate());
    public static final VayudaTurquoiseGemstoneIronArmorItem.Leggings VAYUDA_TURQUOISE_GEMSTONE_IRON_LEGGINGS_ITEM = register("vayuda_turquoise_gemstone_iron_leggings", new VayudaTurquoiseGemstoneIronArmorItem.Leggings());
    public static final VayudaTurquoiseGemstoneIronArmorItem.Boots VAYUDA_TURQUOISE_GEMSTONE_IRON_BOOTS_ITEM = register("vayuda_turquoise_gemstone_iron_boots", new VayudaTurquoiseGemstoneIronArmorItem.Boots());
    public static final Item VAJRADA_AMETHYST_ITEM = register("vajrada_amethyst", new Item(new Item.Properties()));
    public static final Item VAJRADA_AMETHYST_SLIVER_ITEM = register("vajrada_amethyst_sliver", new Item(new Item.Properties()));
    public static final Item VAJRADA_AMETHYST_FRAGMENT_ITEM = register("vajrada_amethyst_fragment", new Item(new Item.Properties()));
    public static final Item VAJRADA_AMETHYST_PIECE_ITEM = register("vajrada_amethyst_piece", new Item(new Item.Properties()));
    public static final DendroCoreItem DENDRO_CORE_ITEM = register("dendro_core", new DendroCoreItem());
    public static final VajradaAmethystHoeItem VAJRADA_AMETHYST_HOE_ITEM = register("vajrada_amethyst_hoe", new VajradaAmethystHoeItem());
    public static final VajradaAmethystAxeItem VAJRADA_AMETHYST_AXE_ITEM = register("vajrada_amethyst_axe", new VajradaAmethystAxeItem());
    public static final VajradaAmethystPickaxeItem VAJRADA_AMETHYST_PICKAXE_ITEM = register("vajrada_amethyst_pickaxe", new VajradaAmethystPickaxeItem());
    public static final VajradaAmethystShovelItem VAJRADA_AMETHYST_SHOVEL_ITEM = register("vajrada_amethyst_shovel", new VajradaAmethystShovelItem());
    public static final VajradaAmethystIronItem VAJRADA_AMETHYST_IRON_ITEM = register("vajrada_amethyst_iron", new VajradaAmethystIronItem());
    public static final VajradaAmethystDiamondItem VAJRADA_AMETHYST_DIAMOND_ITEM = register("vajrada_amethyst_diamond", new VajradaAmethystDiamondItem());
    public static final VajradaAmethystNetheriteItem VAJRADA_AMETHYST_NETHERITE_ITEM = register("vajrada_amethyst_netherite", new VajradaAmethystNetheriteItem());
    public static final VajradaAmethystIronSwordItem VAJRADA_AMETHYST_IRON_SWORD_ITEM = register("vajrada_amethyst_iron_sword", new VajradaAmethystIronSwordItem());
    public static final VajradaAmethystDiamondSwordItem VAJRADA_AMETHYST_DIAMOND_SWORD_ITEM = register("vajrada_amethyst_diamond_sword", new VajradaAmethystDiamondSwordItem());
    public static final VajradaAmethystNetheriteSwordItem VAJRADA_AMETHYST_NETHERITE_SWORD_ITEM = register("vajrada_amethyst_netherite_sword", new VajradaAmethystNetheriteSwordItem());
    public static final VajradaAmethystIronArmorItem.Helmet VAJRADA_AMETHYST_IRON_HELMET = register("vajrada_amethyst_iron_helmet", new VajradaAmethystIronArmorItem.Helmet());
    public static final VajradaAmethystIronArmorItem.Chestplate VAJRADA_AMETHYST_IRON_CHESTPLATE = register("vajrada_amethyst_iron_chestplate", new VajradaAmethystIronArmorItem.Chestplate());
    public static final VajradaAmethystIronArmorItem.Leggings VAJRADA_AMETHYST_IRON_LEGGINGS = register("vajrada_amethyst_iron_leggings", new VajradaAmethystIronArmorItem.Leggings());
    public static final VajradaAmethystIronArmorItem.Boots VAJRADA_AMETHYST_IRON_BOOTS = register("vajrada_amethyst_iron_boots", new VajradaAmethystIronArmorItem.Boots());
    public static final VajradaAmethystDiamondArmorItem.Helmet VAJRADA_AMETHYST_DIAMOND_HELMET = register("vajrada_amethyst_diamond_helmet", new VajradaAmethystDiamondArmorItem.Helmet());
    public static final VajradaAmethystDiamondArmorItem.Chestplate VAJRADA_AMETHYST_DIAMOND_CHESTPLATE = register("vajrada_amethyst_diamond_chestplate", new VajradaAmethystDiamondArmorItem.Chestplate());
    public static final VajradaAmethystDiamondArmorItem.Leggings VAJRADA_AMETHYST_DIAMOND_LEGGINGS = register("vajrada_amethyst_diamond_leggings", new VajradaAmethystDiamondArmorItem.Leggings());
    public static final VajradaAmethystDiamondArmorItem.Boots VAJRADA_AMETHYST_DIAMOND_BOOTS = register("vajrada_amethyst_diamond_boots", new VajradaAmethystDiamondArmorItem.Boots());

    public static final VajradaAmethystNetheriteArmorItem.Helmet VAJRADA_AMETHYST_NETHERITE_HELMET = register("vajrada_amethyst_netherite_helmet", new VajradaAmethystNetheriteArmorItem.Helmet());
    public static final VajradaAmethystNetheriteArmorItem.Chestplate VAJRADA_AMETHYST_NETHERITE_CHESTPLATE = register("vajrada_amethyst_netherite_chestplate", new VajradaAmethystNetheriteArmorItem.Chestplate());
    public static final VajradaAmethystNetheriteArmorItem.Leggings VAJRADA_AMETHYST_NETHERITE_LEGGINGS = register("vajrada_amethyst_netherite_leggings", new VajradaAmethystNetheriteArmorItem.Leggings());
    public static final VajradaAmethystNetheriteArmorItem.Boots VAJRADA_AMETHYST_NETHERITE_BOOTS = register("vajrada_amethyst_netherite_boots", new VajradaAmethystNetheriteArmorItem.Boots());
    public static final SmithingTemplateMoraItem SMITHING_TEMPLATE_MORA_ITEM = register("smithing_template_mora", new SmithingTemplateMoraItem());
    public static final SmithingTemplateElement1Item SMITHING_TEMPLATE_ELEMENT_1_ITEM = register("smithing_template_element1", new SmithingTemplateElement1Item());
    public static final SmithingTemplateElement2Item SMITHING_TEMPLATE_ELEMENT_2_ITEM = register("smithing_template_element2", new SmithingTemplateElement2Item());
    public static final Item ELEMENT_CRYSTAL = register("element_crystal", new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static void init() {
        PrimogemCraftMobEffects.init();
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, id), item);
    }
}
