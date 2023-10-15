package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class Liulang_jingyan_shuxingProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double jingyan = 0;
		if (entity.isShiftKeyDown()) {
			if ((itemstack).getDamageValue() == (itemstack).getMaxDamage() - 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u00A7a\u7ECF\u9A8C\u503C\u00A7c\u4E3A\u7A7A\uFF01"), (false));
			} else {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints((int) (((itemstack).getMaxDamage() - 1) - (itemstack).getDamageValue()));
				if ((itemstack).getMaxDamage() - (itemstack).getDamageValue() != 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A7a\u7ECF\u9A8C\u503C\u00A7e\u5DF2\u53D6\u51FA\uFF01"), (false));
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					}
					YouhuayoujianfangfangzhiProcedure.execute(world, entity);
				}
				(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - (itemstack).getDamageValue() + ((itemstack).getMaxDamage() - 1) - ((itemstack).getMaxDamage() - (itemstack).getDamageValue())));
				itemstack.getOrCreateTag().putDouble("naijiu_xianzhi", ((itemstack).getMaxDamage() - (itemstack).getDamageValue()));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			}
		} else {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) != 0) {
				if (!((itemstack).getDamageValue() == 0)) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) < 17) {
						jingyan = (entity instanceof Player _plr ? _plr.experienceLevel : 0) * (entity instanceof Player _plr ? _plr.experienceLevel : 0) + 6 * (entity instanceof Player _plr ? _plr.experienceLevel : 0);
					}
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 16 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 31) {
						jingyan = 2.5 * (entity instanceof Player _plr ? _plr.experienceLevel : 0) * (entity instanceof Player _plr ? _plr.experienceLevel : 0) - 40.5 * (entity instanceof Player _plr ? _plr.experienceLevel : 0) + 360;
					}
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 32) {
						jingyan = 4.5 * (entity instanceof Player _plr ? _plr.experienceLevel : 0) * (entity instanceof Player _plr ? _plr.experienceLevel : 0) - 162.5 * (entity instanceof Player _plr ? _plr.experienceLevel : 0) + 2220;
					}
					if ((itemstack.getItem() == PrimogemcraftModItems.DAYINGXIONGDEJINGYAN.get() || itemstack.getItem() == PrimogemcraftModItems.JIANGLIDAYINXIONGJINGYAN.get()) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 30) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-((itemstack).getDamageValue()));
					} else {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-((int) ((itemstack).getDamageValue() - 1)));
					}
					(itemstack).setDamageValue((int) (((itemstack).getMaxDamage() - jingyan) - ((itemstack).getMaxDamage() - (itemstack).getDamageValue())));
					itemstack.getOrCreateTag().putDouble("naijiu_xianzhi", ((itemstack).getMaxDamage() - (itemstack).getDamageValue()));
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
					jingyan = 0;
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A7a\u7ECF\u9A8C\u503C\u00A7b\u5DF2\u5B58\u5165\uFF01"), (false));
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.OFF_HAND, true);
					}
					YouhuayoujianfangfangzhiProcedure.execute(world, entity);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A7a\u7ECF\u9A8C\u4E66\u00A7c\u5DF2\u5B58\u6EE1\uFF01"), (false));
				}
			}
		}
	}
}
