package net.mcreator.ceshi.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class ZsfsxProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (!itemstack.getOrCreateTag().getBoolean("zsf_sx")) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.GUOQU.get(), (int) (itemstack.getOrCreateTag().getDouble("zsq_sx") * 20), 0));
			itemstack.getOrCreateTag().putBoolean("zsf_sx", (true));
		}
		if (itemstack.getOrCreateTag().getBoolean("zsf_sx")) {
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
					itemstack.getOrCreateTag().putBoolean("zsf_sx", (false));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) (itemstack.getOrCreateTag().getDouble("zsq_sx") * 20 * 0.5));
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (itemstack.getOrCreateTag().getDouble("zsq_sx") * 20 * 0.5));
		}
	}
}
