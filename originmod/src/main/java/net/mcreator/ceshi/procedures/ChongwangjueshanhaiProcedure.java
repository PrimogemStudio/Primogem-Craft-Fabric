package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class ChongwangjueshanhaiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PrimogemcraftModItems.QIWUCHONGWANG.get())) : false)) {
			if (Math.random() < 0.3) {
				entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.7));
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A74\u5BC4\u751F\u8FC7\u6DF1"), (false));
				}
			} else {
				if (Math.random() < 0.4) {
					entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.75));
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u00A74\u5BC4\u751F\u8FC7\u6DF1"), (false));
					}
				} else {
					if (Math.random() < 0.5) {
						entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.85));
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u00A74\u5BC4\u751F\u8FC7\u6DF1"), (false));
						}
					} else {
						entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.95));
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u00A74\u5BC4\u751F\u8FC7\u6DF1"), (false));
						}
					}
				}
			}
		}
	}
}
