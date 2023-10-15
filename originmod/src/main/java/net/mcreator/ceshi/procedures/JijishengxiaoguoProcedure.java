package net.mcreator.ceshi.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class JijishengxiaoguoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 12) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A74\u5B83\u4EEC\u997F\u4E86\u5E76\u51C6\u5907\u5543\u98DF\u4F60"), (true));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.JIJISHENGCHONGDEFENNU.get(), 60, 1, (true), (true)));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 100);
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.95) {
				if (Math.random() < 0.3) {
					entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.4));
				} else {
					if (Math.random() < 0.3) {
						entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.6));
					} else {
						if (Math.random() < 0.5) {
							entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.3));
						} else {
							if (Math.random() < 0.5) {
								entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.5));
							} else {
								entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.2));
							}
						}
					}
				}
			}
		}
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, (false), (false)));
		}
	}
}
