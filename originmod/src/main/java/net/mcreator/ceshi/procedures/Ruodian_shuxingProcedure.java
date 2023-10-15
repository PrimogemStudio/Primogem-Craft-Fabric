package net.mcreator.ceshi.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

import java.util.Random;

public class Ruodian_shuxingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, (int) Mth.nextDouble(new Random(), 1, 5), (false), (false)));
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 600, (int) Mth.nextDouble(new Random(), 1, 5), (false), (false)));
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600, (int) Mth.nextDouble(new Random(), 1, 5), (false), (false)));
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, (int) Mth.nextDouble(new Random(), 1, 3), (false), (false)));
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 600, (int) Mth.nextDouble(new Random(), 1, 2), (false), (false)));
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, (int) Mth.nextDouble(new Random(), 1, 5), (false), (false)));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, (int) Mth.nextDouble(new Random(), 1, 5), (false), (false)));
			}
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200, (int) Mth.nextDouble(new Random(), 1, 3), (false), (false)));
		}
		if (Math.random() < 0.1) {
			entity.setSecondsOnFire(10);
		}
		if (Math.random() < 0.1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.JISHENG.get(), 200, (int) Mth.nextDouble(new Random(), 1, 3), (false), (false)));
		}
		if (Math.random() < 0.1) {
			entity.setAirSupply((int) (0 - 100));
		}
		if (Math.random() < 0.1) {
			entity.setSprinting((false));
		}
		if (Math.random() < 0.1) {
			entity.setDeltaMovement(new Vec3(10, 10, 10));
		}
	}
}
