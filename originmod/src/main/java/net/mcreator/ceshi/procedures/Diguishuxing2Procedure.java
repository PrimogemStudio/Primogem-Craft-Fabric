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
import net.minecraft.util.Mth;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;

@Mod.EventBusSubscriber
public class Diguishuxing2Procedure {
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
					if (itemstackiterator.getItem() == PrimogemcraftModItems.WUXIANDIGUIDEDAIMA.get()) {
						if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.DIGUIXIAOGUO.get()) : false)) {
							sourceentity.getPersistentData().putBoolean("daima6_naijiu", (true));
						} else {
							if (Math.random() < 0.5) {
								if (sourceentity instanceof Player _player)
									_player.giveExperiencePoints((int) ((sourceentity instanceof Player _plr ? _plr.getXpNeededForNextLevel() : 0) * Mth.nextDouble(new Random(), 0.005, 0.05)));
							}
						}
					}
				}
			}
		}
	}
}
