package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class FumianqiwufaguangProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getItem() == PrimogemcraftModItems.LUANQIBAZAODEDAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima1_yixiufu");
		}
		if (itemstack.getItem() == PrimogemcraftModItems.YOUDIANQIQIAODEDAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima2_yixiufu");
		}
		if (itemstack.getItem() == PrimogemcraftModItems.ZHONGGUIZHONGJUDEDAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima3_yixiufu");
		}
		if (itemstack.getItem() == PrimogemcraftModItems.JINGQUEYOUYADAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima4_yixiufu");
		}
		if (itemstack.getItem() == PrimogemcraftModItems.MEIYOUZHUSHIDAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima5_yixiufu");
		}
		if (itemstack.getItem() == PrimogemcraftModItems.WUXIANDIGUIDEDAIMA.get()) {
			return itemstack.getOrCreateTag().getBoolean("daima6_yixiufu");
		}
		return itemstack.getItem() == PrimogemcraftModItems.CESHIYONGWUPIN.get();
	}
}
