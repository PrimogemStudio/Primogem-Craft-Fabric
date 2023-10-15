package net.mcreator.ceshi.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class Zuoshao_sxProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("zhuoshao", (entity.getPersistentData().getDouble("zhuoshao") + 1));
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "particle minecraft:lava ~ ~1 ~");
		}
		if (entity.getPersistentData().getDouble("zhuoshao") >= 40) {
			entity.hurt(DamageSource.LAVA, (float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.ZHUOSHAO.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.ZHUOSHAO.get()).getAmplifier() : 0) + 1));
			entity.getPersistentData().putDouble("zhuoshao", 0);
		}
	}
}
