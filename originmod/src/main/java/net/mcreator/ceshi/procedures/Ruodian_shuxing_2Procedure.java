package net.mcreator.ceshi.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class Ruodian_shuxing_2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.01) {
			entity.hurt(DamageSource.MAGIC, 1);
		}
		entity.getPersistentData().putDouble("ruodian_01", (entity.getPersistentData().getDouble("ruodian_01") + 1));
		if (entity.getPersistentData().getDouble("ruodian_01") == 100) {
			entity.fallDistance = 4;
			entity.getPersistentData().putDouble("ruodian_01", 0);
		}
	}
}
