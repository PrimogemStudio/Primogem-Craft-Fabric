package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class NaijiuxianzhiProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("naijiu_xianzhi", ((itemstack).getMaxDamage() - (itemstack).getDamageValue()));
	}
}
