package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import java.util.Map;

public class GongzhuxinghuacaidanchufaProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrCreateTag().getBoolean("yanhuaxiaocaidan")) {
				itemstack.getOrCreateTag().putBoolean("yanhuaxiaocaidan", (false));
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FLAMING_ARROWS)) {
						_enchantments.remove(Enchantments.FLAMING_ARROWS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("yanhuaxiaocaidan", (true));
				(itemstack).enchant(Enchantments.FLAMING_ARROWS, 1);
			}
			if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
			}
		}
	}
}
