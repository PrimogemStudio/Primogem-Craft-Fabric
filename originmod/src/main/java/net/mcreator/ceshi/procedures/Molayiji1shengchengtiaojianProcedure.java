package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Molayiji1shengchengtiaojianProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.canSeeSkyFromBelowWater(new BlockPos(x, y, z));
	}
}
