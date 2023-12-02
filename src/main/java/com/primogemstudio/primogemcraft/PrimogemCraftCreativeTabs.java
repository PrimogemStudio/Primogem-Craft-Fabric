package com.primogemstudio.primogemcraft;

import com.google.common.collect.ImmutableList;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks.*;
import static com.primogemstudio.primogemcraft.items.PrimogemCraftItems.*;

public class PrimogemCraftCreativeTabs {
    public static final ResourceKey<CreativeModeTab> KEY_MAIN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_blocks_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_TOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tools_tab"));

    public static void init() {
        PrimogemCraftItems.init();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_MAIN, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft")).icon(() -> new ItemStack(PRIMOGEM_ITEM))
                .displayItems((ip, output) -> ImmutableList.of(
                        THE_ALL_BEGINNING_ITEM, PRIMOGEM_ITEM, PRIMOGEM_BILLET_ITEM,
                        DENDRO_CORE_ITEM, OLD_STONE_ITEM, MASTER_LESS_STAR_DUST_ITEM,
                        MASTER_LESS_STARG_LITTER_ITEM, MORA_ITEM, EXQUISITE_MORA_ITEM,
                        EXQUISITE_MORA_BAG_ITEM, MORA_WALLET_ITEM, MORA_BILLET_ITEM,
                        COSMIC_FRAGMENTS_ITEM, ACQUAINT_FATE_ITEM, INTERTWINED_FATE_ITEM,
                        INTERTWINED_FATE_TEN_ITEM, VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_FRAGMENT_ITEM, VAYUDA_TURQUOISE_GEMSTONE_PIECE_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_ITEM, VAYUDA_TURQUOISE_GEMSTONE_IRON_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_ITEM, VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_ITEM,
                        VAJRADA_AMETHYST_SLIVER_ITEM, VAJRADA_AMETHYST_FRAGMENT_ITEM,
                        VAJRADA_AMETHYST_PIECE_ITEM, VAJRADA_AMETHYST_ITEM,
                        VAJRADA_AMETHYST_IRON_ITEM, VAJRADA_AMETHYST_DIAMOND_ITEM,
                        VAJRADA_AMETHYST_NETHERITE_ITEM, A_NEW_DAY_WITH_HOPE_RECORD_ITEM,
                        THE_FADING_STORIES_RECORD_ITEM, HAKUSHIN_LULLABY_RECORD_ITEM,
                        VILLAGE_SURROUNDED_BY_GREEN_RECORD_ITEM, BALLAD_OF_MANY_WATERS_RECORD_ITEM,
                        SPACE_WALK_RECORD_ITEM, SALTY_MOON_RECORD_ITEM, TAKE_THE_JOURNEY_RECORD_ITEM,
                        SOCIETY_TICKET_ITEM
                ).forEach(output::accept)).build());
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_BLOCKS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_blocks")).icon(() -> new ItemStack(PRIMOGEM_ORE))
                .displayItems((ip, output) -> ImmutableList.of(
                        PRIMOGEM_ORE, DEEP_SLATE_PRIMOGEM_ORE, PRIMOGEM_BLOCK,
                        VAYUDA_TURQUOISE_GEMSTONE_ORE_BLOCK, VAYUDA_TURQUOISE_GEMSTONE_BLOCK,
                        VAJRADA_AMETHYST_ORE_BLOCK, VAJRADA_AMETHYST_BLOCK, INTERTWINED_FATE_BLOCK,
                        DENDRO_CORE_BLOCK, MORA_BUNCH_BLOCK, MORA_BLOCK, EXQUISITE_MORA_BLOCK,
                        CHEAP_MORA_BLOCK, CHEAP_MORA_SLAB_BLOCK, CHEAP_MORA_STAIR_BLOCK,
                        CHEAP_MORA_WALL_BLOCK, TEYVAT_STICK_ITEM, TEYVAT_PLANKS_BLOCK,
                        TEYVAT_PLANK_SLAB_BLOCK, TEYVAT_PLANK_STAIR_BLOCK, TEYVAT_PLANK_FENCE_BLOCK,
                        TEYVAT_PLANK_FENCE_GATE_BLOCK, BLUE_TEYVAT_PLANKS_BLOCK, BLUE_TEYVAT_PLANK_SLAB_BLOCK,
                        BLUE_TEYVAT_PLANK_STAIR_BLOCK, BLUE_TEYVAT_PLANK_FENCE_BLOCK,
                        BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK, PINK_TEYVAT_PLANKS_BLOCK,
                        PINK_TEYVAT_PLANK_SLAB_BLOCK, PINK_TEYVAT_PLANK_STAIR_BLOCK,
                        PINK_TEYVAT_PLANK_FENCE_BLOCK, PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK, CHAR_COAL_BLOCK,
                        RUSTED_PLANK_BLOCK, RUSTED_PLANK_STAIR_BLOCK, DENDRO_CORE_PLANKS_BLOCK,
                        DENDRO_CORE_PLANK_SLAB_BLOCK, DENDRO_CORE_PLANK_STAIRS_BLOCK,
                        DENDRO_CORE_PLANK_FENCE_BLOCK, DENDRO_CORE_PLANK_FENCE_GATE_BLOCK,
                        DENDRO_CORE_PLANK_PRESSURE_PLATE_BLOCK, DENDRO_CORE_PLANK_BUTTON_BLOCK
                ).forEach(output::accept)).build());
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_TOOLS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_weapon_tools")).icon(() -> new ItemStack(DULL_BLADE_ITEM))
                .displayItems((ip, output) -> ImmutableList.of(
                        DULL_BLADE_ITEM, DENDRO_PICKAXE_ITEM, PRIMOGEM_PICKAXE_ITEM,
                        PRIMOGEM_HOE_ITEM, PRIMOGEM_AXE_ITEM, PRIMOGEM_SHOVEL_ITEM,
                        PRIMOGEM_SWORD_ITEM, STRANGE_PRIMOGEM_SWORD_ITEM, MORA_PICKAXE_ITEM,
                        MORA_HOE_ITEM, MORA_AXE_ITEM, MORA_SHOVEL_ITEM, MORA_SWORD_ITEM,
                        MORA_HELMET_ITEM, MORA_CHESTPLATE_ITEM, MORA_LEGGINGS_ITEM, MORA_BOOTS_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_HOE_ITEM, VAYUDA_TURQUOISE_GEMSTONE_AXE_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_PICKAXE_ITEM, VAYUDA_TURQUOISE_GEMSTONE_SHOVEL_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_IRON_SWORD_ITEM, VAYUDA_TURQUOISE_GEMSTONE_IRON_HELMET_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_IRON_CHESTPLATE_ITEM, VAYUDA_TURQUOISE_GEMSTONE_IRON_LEGGINGS_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_IRON_BOOTS_ITEM, VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_SWORD_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_HELMET_ITEM, VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_CHESTPLATE_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_LEGGINGS_ITEM, VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_BOOTS_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_SWORD_ITEM, VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_HELMET_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_CHESTPLATE_ITEM, VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_LEGGINGS_ITEM,
                        VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_BOOTS_ITEM, VAJRADA_AMETHYST_HOE_ITEM, VAJRADA_AMETHYST_AXE_ITEM,
                        VAJRADA_AMETHYST_PICKAXE_ITEM, VAJRADA_AMETHYST_SHOVEL_ITEM, VAJRADA_AMETHYST_IRON_SWORD_ITEM, VAJRADA_AMETHYST_DIAMOND_SWORD_ITEM, VAJRADA_AMETHYST_NETHERITE_SWORD_ITEM
                ).forEach(output::accept)).build());
    }
}