package net.mcreator.ceshi.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class Jijishengdefennu01Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 12) {
			entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.8));
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(13);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 0) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u00A7c\u88AB\u00A74\u5543\u00A7c\u98DF\u00A74\u8FC7\u00A7c\u5EA6\u00A74~~"), (false));
			}
		} else {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 12) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PrimogemcraftModMobEffects.JIJISHENGCHONGDEFENNU.get());
			}
		}
	}
}
