
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

public class GongsideguguzhongItem extends Item {
	public GongsideguguzhongItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(2233).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7c\u4E00\u4E2A\u6361\u5230\u5C31\u4F1A\u88AB\u538B\u69A8\u7684\u516C\u53F8\u7684\u5495\u5495\u949F"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u62FE\u53D6\u5230\u8BE5\u7269\u54C1\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7a-\u7ECF\u9A8C\u7B49\u7EA7\u00A72\u5927\u4E8E1\u5C0F\u4E8E10\u00A7f\u65F6\u00A74\u6263\u9664\u6240\u6709\u00A7a\u7ECF\u9A8C\u7B49\u7EA7"));
		list.add(new TextComponent("\u00A7a-\u7ECF\u9A8C\u7B49\u7EA7\u00A72\u5927\u4E8E10\u5C0F\u4E8E20\u00A7f\u65F6\uFF0C\u00A7c\u968F\u673A\u6263\u9664\u00A7d5~8\u7EA7\u00A7a\u7ECF\u9A8C\u7B49\u7EA7"));
		list.add(new TextComponent("\u00A7a-\u7ECF\u9A8C\u7B49\u7EA7\u00A72\u5927\u4E8E20\u5C0F\u4E8E30\u00A7f\u65F6\uFF0C\u00A7c\u968F\u673A\u6263\u9664\u00A7d3~6\u7EA7\u00A7a\u7ECF\u9A8C\u7B49\u7EA7"));
		list.add(new TextComponent("\u00A7a-\u7ECF\u9A8C\u7B49\u7EA7\u00A74\u5927\u4E8E\u00A7a30\u7EA7\u00A74\u65F6\u91CD\u7F6E\u00A7a\u7ECF\u9A8C\u7B49\u7EA7\u00A7f\u81F3\u00A7a27\u7EA7\u00A74\uFF01"));
	}
}
