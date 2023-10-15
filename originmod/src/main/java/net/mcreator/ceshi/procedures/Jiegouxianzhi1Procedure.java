package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class Jiegouxianzhi1Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_ocean"))) && !new ResourceLocation("river").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName());
	}
}
