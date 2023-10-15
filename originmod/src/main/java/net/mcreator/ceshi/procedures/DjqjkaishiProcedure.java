package net.mcreator.ceshi.procedures;

import net.minecraft.world.entity.Entity;

public class DjqjkaishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("djpp", 0);
	}
}
