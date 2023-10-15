package net.mcreator.ceshi.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class Zhushishuxing1Procedure {
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
					if (itemstackiterator.getItem() == PrimogemcraftModItems.MEIYOUZHUSHIDAIMA.get()) {
						if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.QUEZHUSHIXIAOGUO.get()) : false)) {
							sourceentity.getPersistentData().putBoolean("daima5_naijiu", (true));
						} else {
							if (Math.random() < 0.5) {
								if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
									if ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getDuration() : 0) > 400) {
										sourceentity.getPersistentData().putDouble("zhushi_dengji",
												(sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0));
										sourceentity.getPersistentData().putDouble("zhushi_shijian",
												(sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getDuration() : 0));
										if (sourceentity instanceof LivingEntity _entity)
											_entity.removeEffect(MobEffects.DAMAGE_BOOST);
										if (sourceentity instanceof LivingEntity _entity)
											_entity.addEffect(
													new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) (sourceentity.getPersistentData().getDouble("zhushi_shijian") * 0.05), (int) (sourceentity.getPersistentData().getDouble("zhushi_dengji") + 1)));
										sourceentity.getPersistentData().putBoolean("zhushi_dengji", (false));
										sourceentity.getPersistentData().putBoolean("zhushi_shijian", (false));
									} else {
										if (sourceentity instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,
													sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getDuration() : 0,
													(int) ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1)));
									}
								} else {
									if (sourceentity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0));
								}
							}
						}
					}
				}
			}
		}
	}
}
