package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class DjjsxProcedure {
	public static void execute(Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.DJPP.get()) : false)) {
			if (itemstack.getItem() == PrimogemcraftModItems.DJTJ.get()) {
				if (Math.random() < 0.05) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.DJPP.get(), 120, 0));
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.DDJZSJ.get()) {
				if (Math.random() < 0.1) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.DJPP.get(), 200, 1));
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.DJHJJ.get()) {
				if (Math.random() < 0.1) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.DJPP.get(), 320, 2));
				}
			}
		}
	}
}
