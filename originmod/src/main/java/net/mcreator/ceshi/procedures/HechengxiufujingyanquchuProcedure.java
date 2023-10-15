package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class HechengxiufujingyanquchuProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("jingyanshu_naijiu", (true));
	}
}
