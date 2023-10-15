package net.mcreator.ceshi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FengraoguaiwushuxingProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getWorld(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGMINGZHI))) {
			if (world.getDifficulty() == Difficulty.EASY) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= 100) {
					if (Math.random() < 0.05 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 100) {
					if (Math.random() < 0.03 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
			}
			if (world.getDifficulty() == Difficulty.NORMAL) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= 100) {
					if (Math.random() < 0.1 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 100) {
					if (Math.random() < 0.05 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
			}
			if (world.getDifficulty() == Difficulty.HARD) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= 100 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
					if (Math.random() < 0.18) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 100 * (world.getLevelData().getGameRules().getInt(PrimogemcraftModGameRules.GUIZEMOYINSHENSHENGCHENGBEILV))) {
					if (Math.random() < 0.1) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 2000000, 0));
					}
				}
			}
		}
	}
}
