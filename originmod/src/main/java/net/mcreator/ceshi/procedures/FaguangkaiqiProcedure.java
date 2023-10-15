package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class FaguangkaiqiProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("kaiqi");
	}
}
