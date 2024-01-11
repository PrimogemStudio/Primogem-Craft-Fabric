package com.primogemstudio.primogemcraft;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static net.minecraft.world.level.biome.Biomes.*;
import static net.minecraft.world.level.levelgen.GenerationStep.Decoration.UNDERGROUND_ORES;


public class PrimogemCraftWorldgen {
    public static void init() {
        BiomeModifications.create(new ResourceLocation(MOD_ID, "primogem_ore")).add(ModificationPhase.ADDITIONS, c -> c.hasTag(BiomeTags.IS_OVERWORLD), m -> {
            m.getGenerationSettings().addFeature(UNDERGROUND_ORES, placedFeature("primogem_ore"));
            m.getGenerationSettings().addFeature(UNDERGROUND_ORES, placedFeature("primogem_ore_buried"));
            m.getGenerationSettings().addFeature(UNDERGROUND_ORES, placedFeature("primogem_ore_large"));
        });
        BiomeModifications.addFeature(c -> c.getBiomeKey() == PLAINS, UNDERGROUND_ORES, placedFeature("vayuda_turquoise_gemstone_ore"));
        BiomeModifications.addFeature(c -> List.of(LUKEWARM_OCEAN, BEACH, RIVER).contains(c.getBiomeKey()), UNDERGROUND_ORES, placedFeature("vajrada_amethyst_ore"));
    }

    private static ResourceKey<PlacedFeature> placedFeature(String id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, id));
    }
}
