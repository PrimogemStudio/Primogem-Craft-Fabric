package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.*;
import com.primogemstudio.primogemcraft.blocks.instances.dendrocore.*;
import com.primogemstudio.primogemcraft.blocks.instances.materials.dagadus.NagadusEmeraldBlock;
import com.primogemstudio.primogemcraft.blocks.instances.materials.dagadus.NagadusEmeraldOreBlock;
import com.primogemstudio.primogemcraft.blocks.instances.materials.vajrada.VajradaAmethystBlock;
import com.primogemstudio.primogemcraft.blocks.instances.materials.vajrada.VajradaAmethystOre;
import com.primogemstudio.primogemcraft.blocks.instances.materials.vayuda.VayudaTurquoiseGemstoneBlock;
import com.primogemstudio.primogemcraft.blocks.instances.materials.vayuda.VayudaTurquoiseGemstoneOre;
import com.primogemstudio.primogemcraft.blocks.instances.mora.*;
import com.primogemstudio.primogemcraft.blocks.instances.planks.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftBlocks {
    public static final DendroCoreBlock DENDRO_CORE_BLOCK = registerWithItem("dendro_core_block", new DendroCoreBlock());
    public static final PrimogemBlock PRIMOGEM_BLOCK = registerWithItem("primogem_block", new PrimogemBlock());
    public static final PrimogemOre PRIMOGEM_ORE = registerWithItem("primogem_ore", new PrimogemOre());
    public static final Block DEEP_SLATE_PRIMOGEM_ORE = registerWithItem("deep_slate_primogem_ore", new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.POLISHED_DEEPSLATE).strength(5f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops()));
    public static final IntertwinedFateBlock INTERTWINED_FATE_BLOCK = registerWithItem("intertwined_fate_block", new IntertwinedFateBlock());
    public static final MoraBunchBlock MORA_BUNCH_BLOCK = registerWithItem("mora_bunch_block", new MoraBunchBlock());
    public static final MoraBlock MORA_BLOCK = registerWithItem("mora_block", new MoraBlock());
    public static final ExquisiteMoraBlock EXQUISITE_MORA_BLOCK = registerWithItem("exquisite_mora_block", new ExquisiteMoraBlock());
    public static final CheapMoraBlock CHEAP_MORA_BLOCK = registerWithItem("cheap_mora_block", new CheapMoraBlock());
    public static final CheapMoraSlabBlock CHEAP_MORA_SLAB_BLOCK = registerWithItem("cheap_mora_slab", new CheapMoraSlabBlock());
    public static final CheapMoraStairBlock CHEAP_MORA_STAIR_BLOCK = registerWithItem("cheap_mora_stair", new CheapMoraStairBlock());
    public static final CheapMoraWallBlock CHEAP_MORA_WALL_BLOCK = registerWithItem("cheap_mora_wall", new CheapMoraWallBlock());
    public static final TeyvatPlanksBlock TEYVAT_PLANKS_BLOCK = registerWithItem("teyvat_planks", new TeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock TEYVAT_PLANK_SLAB_BLOCK = registerWithItem("teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock TEYVAT_PLANK_STAIR_BLOCK = registerWithItem("teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock TEYVAT_PLANK_FENCE_BLOCK = registerWithItem("teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock TEYVAT_PLANK_FENCE_GATE_BLOCK = registerWithItem("teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final BlueTeyvatPlanksBlock BLUE_TEYVAT_PLANKS_BLOCK = registerWithItem("blue_teyvat_planks", new BlueTeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock BLUE_TEYVAT_PLANK_SLAB_BLOCK = registerWithItem("blue_teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock BLUE_TEYVAT_PLANK_STAIR_BLOCK = registerWithItem("blue_teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock BLUE_TEYVAT_PLANK_FENCE_BLOCK = registerWithItem("blue_teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK = registerWithItem("blue_teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final PinkTeyvatPlanksBlock PINK_TEYVAT_PLANKS_BLOCK = registerWithItem("pink_teyvat_planks", new PinkTeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock PINK_TEYVAT_PLANK_SLAB_BLOCK = registerWithItem("pink_teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock PINK_TEYVAT_PLANK_STAIR_BLOCK = registerWithItem("pink_teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock PINK_TEYVAT_PLANK_FENCE_BLOCK = registerWithItem("pink_teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK = registerWithItem("pink_teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final CharCoalBlock CHAR_COAL_BLOCK = registerWithItem("charcoal_block", new CharCoalBlock());
    public static final RustedPlankBlock RUSTED_PLANK_BLOCK = registerWithItem("rusted_plank", new RustedPlankBlock());
    public static final RustedPlankStairsBlock RUSTED_PLANK_STAIR_BLOCK = registerWithItem("rusted_plank_stairs", new RustedPlankStairsBlock());
    public static final RustIronBarBlock RUST_IRON_BAR_BLOCK = registerWithItem("rust_iron_bar", new RustIronBarBlock());
    public static final DendroCorePlanksBlock DENDRO_CORE_PLANKS_BLOCK = registerWithItem("dendro_core_planks", new DendroCorePlanksBlock());
    public static final DendroCorePlankSlabBlock DENDRO_CORE_PLANK_SLAB_BLOCK = registerWithItem("dendro_core_plank_slab", new DendroCorePlankSlabBlock());
    public static final DendroCorePlankStairsBlock DENDRO_CORE_PLANK_STAIRS_BLOCK = registerWithItem("dendro_core_plank_stairs", new DendroCorePlankStairsBlock());
    public static final DendroCorePlankPressurePlateBlock DENDRO_CORE_PLANK_PRESSURE_PLATE_BLOCK = registerWithItem("dendro_core_plank_pressure_plate", new DendroCorePlankPressurePlateBlock());
    public static final DendroCodePlankButtonBlock DENDRO_CORE_PLANK_BUTTON_BLOCK = registerWithItem("dendro_core_plank_button", new DendroCodePlankButtonBlock());
    public static final DendroCorePlanksFenceGateBlock DENDRO_CORE_PLANK_FENCE_GATE_BLOCK = registerWithItem("dendro_core_plank_fence_gate", new DendroCorePlanksFenceGateBlock());
    public static final DendroCorePlankFenceBlock DENDRO_CORE_PLANK_FENCE_BLOCK = registerWithItem("dendro_core_plank_fence", new DendroCorePlankFenceBlock());
    public static final VayudaTurquoiseGemstoneOre VAYUDA_TURQUOISE_GEMSTONE_ORE_BLOCK = registerWithItem("vayuda_turquoise_gemstone_ore", new VayudaTurquoiseGemstoneOre());
    public static final VayudaTurquoiseGemstoneBlock VAYUDA_TURQUOISE_GEMSTONE_BLOCK = registerWithItem("vayuda_turquoise_gemstone_block", new VayudaTurquoiseGemstoneBlock());
    public static final VajradaAmethystOre VAJRADA_AMETHYST_ORE_BLOCK = registerWithItem("vajrada_amethyst_ore", new VajradaAmethystOre());
    public static final VajradaAmethystBlock VAJRADA_AMETHYST_BLOCK = registerWithItem("vajrada_amethyst_block", new VajradaAmethystBlock());
    public static final March7thStatueBlock MARCH_7TH_STATUE_BLOCK = registerWithItem("march_7th_statue", new March7thStatueBlock());
    public static final NagadusEmeraldOreBlock NAGADUS_EMERALD_ORE_BLOCK = registerWithItem("nagadus_emerald_ore", new NagadusEmeraldOreBlock());
    public static final NagadusEmeraldBlock NAGADUS_EMERALD_BLOCK = registerWithItem("nagadus_emerald_block", new NagadusEmeraldBlock());
    @Environment(EnvType.CLIENT)
    public static void initRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(), PrimogemCraftBlocks.MORA_BUNCH_BLOCK, PrimogemCraftBlocks.CHEAP_MORA_WALL_BLOCK, PrimogemCraftBlocks.RUSTED_PLANK_STAIR_BLOCK);
    }

    private static <T extends Block> T registerWithItem(String id, T block) {
        var rel = new ResourceLocation(MOD_ID, id);
        Registry.register(BuiltInRegistries.ITEM, rel, new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, rel, block);
    }
}
