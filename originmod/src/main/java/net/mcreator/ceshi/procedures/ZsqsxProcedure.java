package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

import java.util.Random;

public class ZsqsxProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt((int) ((itemstack).getMaxDamage() * 0.1), new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (itemstack.getOrCreateTag().getDouble("zsq_sx") * 20 * 1.5));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.GUOQU.get(), (int) (itemstack.getOrCreateTag().getDouble("zsq_sx") * 20), 0));
		}
		if (itemstack.getOrCreateTag().getDouble("zsq_sx") == 0) {
			itemstack.getOrCreateTag().putDouble("zsq_sx", 10);
		}
	}
}
