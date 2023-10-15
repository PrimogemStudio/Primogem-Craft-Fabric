package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class Luandaima_shuxingProcedure {
	public static void execute(ItemStack itemstack) {
		if (!itemstack.getOrCreateTag().getBoolean("daima_tiaojian")) {
			(itemstack).setDamageValue(30);
			NaijiuxianzhiProcedure.execute(itemstack);
			itemstack.getOrCreateTag().putBoolean("daima_tiaojian", (true));
		}
	}
}
