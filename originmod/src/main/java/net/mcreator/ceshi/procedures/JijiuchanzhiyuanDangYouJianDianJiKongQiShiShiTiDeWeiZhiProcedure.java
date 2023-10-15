package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class JijiuchanzhiyuanDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get())) : false) {
			(new ItemStack(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get())).shrink(1);
		}
	}
}
