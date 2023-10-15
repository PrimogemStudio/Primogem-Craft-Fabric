package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class Yuanshijian_qiguaide_huodeProcedure {
	public static void execute(ItemStack itemstack) {
		if (Math.random() < 0.01) {
			itemstack.getOrCreateTag().putBoolean("qiguaideyuanshijian", (true));
		}
	}
}
