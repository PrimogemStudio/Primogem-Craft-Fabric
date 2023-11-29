package com.primogemstudio.primogemcraft.blocks;

import com.primogemstudio.primogemcraft.blocks.instances.*;
import com.primogemstudio.primogemcraft.blocks.instances.dendrocore.*;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftBlocks {
    public static final DendroCoreBlock DENDRO_CORE_BLOCK = register("dendro_core_block", new DendroCoreBlock());
    public static final PrimogemBlock PRIMOGEM_BLOCK = register("primogem_block", new PrimogemBlock());
    public static final PrimogemOre PRIMOGEM_ORE = register("primogem_ore", new PrimogemOre());
    public static final Block DEEP_SLATE_PRIMOGEM_ORE = register("deep_slate_primogem_ore", new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.POLISHED_DEEPSLATE).strength(5f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops()));
    public static final IntertwinedFateBlock INTERTWINED_FATE_BLOCK = register("intertwined_fate_block", new IntertwinedFateBlock());
    public static final MoraBunchBlock MORA_BUNCH_BLOCK = register("mora_bunch_block", new MoraBunchBlock());
    public static final MoraBlock MORA_BLOCK = register("mora_block", new MoraBlock());
    public static final ExquisiteMoraBlock EXQUISITE_MORA_BLOCK = register("exquisite_mora_block", new ExquisiteMoraBlock());
    public static final CheapMoraBlock CHEAP_MORA_BLOCK = register("cheap_mora_block", new CheapMoraBlock());
    public static final CheapMoraSlabBlock CHEAP_MORA_SLAB_BLOCK = register("cheap_mora_slab", new CheapMoraSlabBlock());
    public static final CheapMoraStairBlock CHEAP_MORA_STAIR_BLOCK = register("cheap_mora_stair", new CheapMoraStairBlock());
    public static final CheapMoraWallBlock CHEAP_MORA_WALL_BLOCK = register("cheap_mora_wall", new CheapMoraWallBlock());
    public static final TeyvatPlanksBlock TEYVAT_PLANKS_BLOCK = register("teyvat_planks", new TeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock TEYVAT_PLANK_SLAB_BLOCK = register("teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock TEYVAT_PLANK_STAIR_BLOCK = register("teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock TEYVAT_PLANK_FENCE_BLOCK = register("teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock TEYVAT_PLANK_FENCE_GATE_BLOCK = register("teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final BlueTeyvatPlanksBlock BLUE_TEYVAT_PLANKS_BLOCK = register("blue_teyvat_planks", new BlueTeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock BLUE_TEYVAT_PLANK_SLAB_BLOCK = register("blue_teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock BLUE_TEYVAT_PLANK_STAIR_BLOCK = register("blue_teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock BLUE_TEYVAT_PLANK_FENCE_BLOCK = register("blue_teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock BLUE_TEYVAT_PLANK_FENCE_GATE_BLOCK = register("blue_teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final PinkTeyvatPlanksBlock PINK_TEYVAT_PLANKS_BLOCK = register("pink_teyvat_planks", new PinkTeyvatPlanksBlock());
    public static final TeyvatPlankSlabBlock PINK_TEYVAT_PLANK_SLAB_BLOCK = register("pink_teyvat_plank_slab", new TeyvatPlankSlabBlock());
    public static final TeyvatPlankStairBlock PINK_TEYVAT_PLANK_STAIR_BLOCK = register("pink_teyvat_plank_stair", new TeyvatPlankStairBlock());
    public static final TeyvatPlankFenceBlock PINK_TEYVAT_PLANK_FENCE_BLOCK = register("pink_teyvat_plank_fence", new TeyvatPlankFenceBlock());
    public static final TeyvatPlankFenceGateBlock PINK_TEYVAT_PLANK_FENCE_GATE_BLOCK = register("pink_teyvat_plank_fence_gate", new TeyvatPlankFenceGateBlock());
    public static final CharCoalBlock CHAR_COAL_BLOCK = register("charcoal_block", new CharCoalBlock());
    public static final RustedPlankBlock RUSTED_PLANK_BLOCK = register("rusted_plank", new RustedPlankBlock());
    public static final RustedPlankStairsBlock RUSTED_PLANK_STAIR_BLOCK = register("rusted_plank_stairs", new RustedPlankStairsBlock());
    public static final DendroCorePlanksBlock DENDRO_CORE_PLANKS_BLOCK = register("dendro_core_planks", new DendroCorePlanksBlock());
    public static final DendroCorePlankSlabBlock DENDRO_CORE_PLANK_SLAB_BLOCK = register("dendro_core_plank_slab", new DendroCorePlankSlabBlock());
    public static final DendroCorePlankStairsBlock DENDRO_CORE_PLANK_STAIRS_BLOCK = register("dendro_core_plank_stairs", new DendroCorePlankStairsBlock());
    public static final DendroCorePlankPressurePlateBlock DENDRO_CORE_PLANK_PRESSURE_PLATE_BLOCK = register("dendro_core_plank_pressure_plate", new DendroCorePlankPressurePlateBlock());
    public static final DendroCodePlankButtonBlock DENDRO_CORE_PLANK_BUTTON_BLOCK = register("dendro_core_plank_button", new DendroCodePlankButtonBlock());
    public static final DendroCorePlanksFenceGateBlock DENDRO_CORE_PLANK_FENCE_GATE_BLOCK = register("dendro_core_plank_fence_gate", new DendroCorePlanksFenceGateBlock());
    public static final DendroCorePlankFenceBlock DENDRO_CORE_PLANK_FENCE_BLOCK = register("dendro_core_plank_fence", new DendroCorePlankFenceBlock());
    public static final VayudaTurquoiseGemstoneOre VAYUDA_TURQUOISE_GEMSTONE_ORE_BLOCK = register("vayuda_turquoise_gemstone_ore", new VayudaTurquoiseGemstoneOre());
    public static final VayudaTurquoiseGemstoneBlock VAYUDA_TURQUOISE_GEMSTONE_BLOCK = register("vayuda_turquoise_gemstone_block", new VayudaTurquoiseGemstoneBlock());
    public static final VajradaAmethystOre VAJRADA_AMETHYST_ORE_BLOCK = register("vajrada_amethyst_ore", new VajradaAmethystOre());
    public static final VajradaAmethystBlock VAJRADA_AMETHYST_BLOCK = register("vajrada_amethyst_block", new VajradaAmethystBlock());

    @Environment(EnvType.CLIENT)
    public static void initRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(), PrimogemCraftBlocks.MORA_BUNCH_BLOCK, PrimogemCraftBlocks.CHEAP_MORA_WALL_BLOCK, PrimogemCraftBlocks.RUSTED_PLANK_STAIR_BLOCK);
    }

    private static <T extends Block> T register(String id, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, id), block);
    }
}
