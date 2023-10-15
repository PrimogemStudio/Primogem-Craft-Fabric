
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

public class ZhzhenyinhedaletouItem extends Item {
	public ZhzhenyinhedaletouItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A74\u4E00\u751F\u4E00\u6B21\u673A\u4F1A"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7a\u526F\u624B\u6301\u6709\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7d\u7834\u574F\u7F50\u5B50\uFF1A"));
		list.add(new TextComponent("\u00A7a - \u5C0F\u6982\u7387\u83B7\u5F97\u5947\u7269"));
		list.add(new TextComponent("\u00A7c - \u5927\u6982\u7387\u4F7F\u81EA\u8EAB\u751F\u547D\u503C\u4FDD\u6301\u81F31\u70B9"));
	}
}
