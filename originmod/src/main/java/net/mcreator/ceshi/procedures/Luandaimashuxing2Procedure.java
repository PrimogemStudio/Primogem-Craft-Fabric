package net.mcreator.ceshi.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class Luandaimashuxing2Procedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == PrimogemcraftModItems.LUANQIBAZAODEDAIMA.get()) {
						if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.ZHENGCHANGDAIMA.get()) : false)) {
							sourceentity.getPersistentData().putBoolean("daima1_naijiu", (true));
						}
						if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.ZHENGCHANGDAIMA.get()) : false) {
							if ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 1) {
								if (sourceentity instanceof Player _player)
									_player.getFoodData().setFoodLevel(2);
							} else {
								if (Math.random() < 0.5) {
									if (sourceentity instanceof Player _player)
										_player.getFoodData().setFoodLevel((int) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 1));
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 1) {
									sourceentity.hurt(DamageSource.STARVE, 2);
								} else {
									if (sourceentity instanceof Player _player)
										_player.getFoodData().setFoodLevel((int) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 2));
								}
							}
						}
					}
					if (itemstackiterator.getItem() == PrimogemcraftModItems.YOUDIANQIQIAODEDAIMA.get()) {
						if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.QIQIAODAIMAXIUFU.get()) : false)) {
							sourceentity.getPersistentData().putBoolean("daima2_naijiu", (true));
						}
					}
				}
			}
		}
	}
}
