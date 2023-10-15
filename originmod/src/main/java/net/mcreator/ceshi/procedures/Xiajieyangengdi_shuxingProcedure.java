package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Xiajieyangengdi_shuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forget:crops"))) || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.LAVA)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.NETHERRACK.defaultBlockState(), 3);
		}
	}
}
