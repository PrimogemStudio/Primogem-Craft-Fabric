package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

public class NaijiuxianzhishuchuProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - itemstack.getOrCreateTag().getDouble("naijiu_xianzhi")));
	}
}
