
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

public class XiaodaimolaItem extends Item {
	public XiaodaimolaItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u88AB\u7CBE\u51C6\u5206\u914D\u7684\u7CBE\u81F4\u6469\u62C9\uFF0C\u6216\u8BB8\u6751\u6C11\u4F1A\u559C\u6B22"));
	}
}
