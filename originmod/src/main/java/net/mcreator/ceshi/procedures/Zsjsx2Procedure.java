package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class Zsjsx2Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getItem() == PrimogemcraftModItems.ZSTJ.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.GOUYU.get(), 200, 0));
			}
			if (itemstack.getItem() == PrimogemcraftModItems.ZSZSJ.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.GOUYU.get(), 200, 1));
			}
			if (itemstack.getItem() == PrimogemcraftModItems.ZSHJJ.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.GOUYU.get(), 200, 2));
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(PrimogemcraftModItems.ZSTJ.get(), 600);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(PrimogemcraftModItems.ZSZSJ.get(), 800);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(PrimogemcraftModItems.ZSHJJ.get(), 900);
		}
	}
}
