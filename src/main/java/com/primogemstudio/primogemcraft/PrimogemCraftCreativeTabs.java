package com.primogemstudio.primogemcraft;

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
import static com.primogemstudio.primogemcraft.items.PrimogemCraftItems.*;

public class PrimogemCraftCreativeTabs {
    public static final ResourceKey<CreativeModeTab> KEY_MAIN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_blocks_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_TOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tools_tab"));

    public static void init() {
        PrimogemCraftItems.init();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_MAIN, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft")).icon(() -> new ItemStack(PRIMOGEM_ITEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(THE_ALL_BEGINNING_ITEM);
            output.accept(PRIMOGEM_ITEM);
            output.accept(PRIMOGEM_BILLET_ITEM);
            output.accept(OLD_STONE_ITEM);
            output.accept(MASTER_LESS_STAR_DUST_ITEM);
            output.accept(MASTER_LESS_STARG_LITTER_ITEM);
            output.accept(MORA_ITEM);
            output.accept(EXQUISITE_MORA_ITEM);
            output.accept(EXQUISITE_MORA_BAG_ITEM);
            output.accept(MORA_WALLET_ITEM);
            output.accept(MORA_BILLET_ITEM);
            output.accept(ACQUAINT_FATE_ITEM);
            output.accept(INTERTWINED_FATE_ITEM);
            output.accept(INTERTWINED_FATE_TEN_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_FRAGMENT_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_PIECE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_ITEM);
            output.accept(VAJRADA_AMETHYST_SLIVER_ITEM);
            output.accept(VAJRADA_AMETHYST_FRAGMENT_ITEM);
            output.accept(VAJRADA_AMETHYST_PIECE_ITEM);
            output.accept(VAJRADA_AMETHYST_ITEM);
            output.accept(A_NEW_DAY_WITH_HOPE_RECORD_ITEM);
            output.accept(THE_FADING_STORIES_RECORD_ITEM);
            output.accept(HAKUSHIN_LULLABY_RECORD_ITEM);
            output.accept(VILLAGE_SURROUNDED_BY_GREEN_RECORD_ITEM);
            output.accept(BALLAD_OF_MANY_WATERS_RECORD_ITEM);
            output.accept(SPACE_WALK_RECORD_ITEM);
            output.accept(SALTY_MOON_RECORD_ITEM);
            output.accept(TAKE_THE_JOURNEY_RECORD_ITEM);
        }).build());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_BLOCKS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_blocks")).icon(() -> new ItemStack(PRIMOGEM_ORE_ITEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(PRIMOGEM_ORE_ITEM);
            output.accept(DEEP_SLATE_PRIMOGEM_ORE_ITEM);
            output.accept(PRIMOGEM_BLOCK_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_ORE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_BLOCK_ITEM);
            output.accept(VAJRADA_AMETHYST_ORE_BLOCK_ITEM);
            output.accept(VAJRADA_AMETHYST_BLOCK_ITEM);
            output.accept(INTERTWINED_FATE_BLOCK_ITEM);
            output.accept(DENDRO_CORE_BLOCK_ITEM);
            output.accept(MORA_BUNCH_BLOCK_ITEM);
            output.accept(MORA_BLOCK_ITEM);
            output.accept(EXQUISITE_MORA_BLOCK_ITEM);
            output.accept(CHEAP_MORA_BLOCK_ITEM);
            output.accept(CHEAP_MORA_SLAB_ITEM);
            output.accept(CHEAP_MORA_STAIR_ITEM);
            output.accept(CHEAP_MORA_WALL_ITEM);
            output.accept(TEYVAT_STICK_ITEM);
            output.accept(TEYVAT_PLANKS_BLOCK_ITEM);
            output.accept(TEYVAT_PLANK_SLAB_BLOCK_ITEM);
            output.accept(TEYVAT_PLANK_STAIR_BLOCK_ITEM);
            output.accept(TEYVAT_PLANK_FENCE_BLOCK_ITEM);
            output.accept(TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM);
            output.accept(BLUE_TEYVAT_PLANKS_BLOCK_ITEM);
            output.accept(BLUE_TEYVAT_PLANK_SLAB_BLOCK_ITEM);
            output.accept(BLUE_TEYVAT_PLANK_STAIR_BLOCK_ITEM);
            output.accept(BLUE_TEYVAT_PLANK_FENCE_BLOCK_ITEM);
            output.accept(BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM);
            output.accept(PINK_TEYVAT_PLANKS_BLOCK_ITEM);
            output.accept(PINK_TEYVAT_PLANK_SLAB_BLOCK_ITEM);
            output.accept(PINK_TEYVAT_PLANK_STAIR_BLOCK_ITEM);
            output.accept(PINK_TEYVAT_PLANK_FENCE_BLOCK_ITEM);
            output.accept(PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK_ITEM);
            output.accept(CHAR_COAL_BLOCK_ITEM);
            output.accept(RUSTED_PLANK_BLOCK_ITEM);
            output.accept(RUSTED_PLANK_STAIR_BLOCK_ITEM);
            output.accept(DENDRO_CORE_PLANKS_BLOCK_ITEM);
            output.accept(DENDRO_CORE_PLANK_SLAB_ITEM);
            output.accept(DENDRO_CORE_PLANK_STAIRS_ITEM);
            output.accept(DENDRO_CORE_PLANK_FENCE_ITEM);
            output.accept(DENDRO_CORE_PLANK_FENCE_GATE_ITEM);
            output.accept(DENDRO_CORE_PLANK_PRESSURE_PLATE_ITEM);
            output.accept(DENDRO_CORE_PLANK_BUTTON_ITEM);
        }).build());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_TOOLS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_weapon_tools")).icon(() -> new ItemStack(DULL_BLADE_ITEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(DULL_BLADE_ITEM);
            output.accept(DENDRO_PICKAXE_ITEM);
            output.accept(PRIMOGEM_PICKAXE_ITEM);
            output.accept(PRIMOGEM_HOE_ITEM);
            output.accept(PRIMOGEM_AXE_ITEM);
            output.accept(PRIMOGEM_SHOVEL_ITEM);
            output.accept(PRIMOGEM_SWORD_ITEM);
            output.accept(STRANGE_PRIMOGEM_SWORD_ITEM);
            output.accept(MORA_PICKAXE_ITEM);
            output.accept(MORA_HOE_ITEM);
            output.accept(MORA_AXE_ITEM);
            output.accept(MORA_SHOVEL_ITEM);
            output.accept(MORA_SWORD_ITEM);
            output.accept(MORA_HELMET_ITEM);
            output.accept(MORA_CHESTPLATE_ITEM);
            output.accept(MORA_LEGGINGS_ITEM);
            output.accept(MORA_BOOTS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_HOE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_AXE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_PICKAXE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_SHOVEL_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_SWORD_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_HELMET_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_CHESTPLATE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_LEGGINGS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_IRON_BOOTS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_SWORD_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_HELMET_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_CHESTPLATE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_LEGGINGS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_DIAMOND_BOOTS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_SWORD_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_HELMET_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_CHESTPLATE_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_LEGGINGS_ITEM);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE_NETHERITE_BOOTS_ITEM);
        }).build());
    }
}