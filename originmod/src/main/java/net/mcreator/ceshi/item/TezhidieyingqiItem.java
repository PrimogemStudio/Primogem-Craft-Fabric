
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class TezhidieyingqiItem extends Item {
	public TezhidieyingqiItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u611F\u6069\u6234\u5FB7\u5427\uFF01\u6211\u90FD\u66FF\u4F60\u8003\u8651\u597D\u4E86\uFF01"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7d\u9AD8\u9636\u5F3A\u5316\u6750\u6599"));
	}
}
