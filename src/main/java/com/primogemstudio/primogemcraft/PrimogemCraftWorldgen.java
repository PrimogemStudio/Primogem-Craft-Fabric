package com.primogemstudio.primogemcraft;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.GenerationStep;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;


public class PrimogemCraftWorldgen {
    public static void init() {
        BiomeModifications.create(new ResourceLocation(MOD_ID, "primogem_ore")).add(ModificationPhase.ADDITIONS, c -> c.hasTag(TagKey.create(Registries.BIOME, new ResourceLocation("is_overworld"))), m -> {
            m.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, "primogem_ore")));
            m.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, "primogem_ore_buried")));
            m.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, "primogem_ore_large")));
        });
        BiomeModifications.addFeature(c -> c.getBiomeKey().location().equals(new ResourceLocation("plains")), GenerationStep.Decoration.UNDERGROUND_ORES, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, "vayuda_turquoise_gemstone_ore")));
    }
}
