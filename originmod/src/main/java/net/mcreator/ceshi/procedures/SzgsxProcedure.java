package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class SzgsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.1 && ((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.BUBBLE_COLUMN)) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.CAOYUANHE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
