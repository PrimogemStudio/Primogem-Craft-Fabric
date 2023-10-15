package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class Dibiaomolayiji_xinxianzhiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !(world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:wasteland")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_beach")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:dry")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:hot")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_ocean")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_river")))
				&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:water"))) && !new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& !new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()) && !new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()));
	}
}
