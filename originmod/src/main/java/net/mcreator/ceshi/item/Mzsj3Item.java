
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

public class Mzsj3Item extends Item {
	public Mzsj3Item() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A79\u62B9\u9664\u5143\u7D20\u6676\u4F53\u9644\u7740"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u53EF\u5E94\u7528\u4E8E\uFF1A"));
		list.add(new TextComponent("\u00A7d\u300E\u5143\u7D20\u6676\u4F53\u300F\u00A79\u4E0B\u754C\u5408\u91D1\u5251"));
		list.add(new TextComponent("\u00A7d\u300E\u5143\u7D20\u6676\u4F53\u300F\u00A79\u4E0B\u754C\u5408\u91D1\u76D4\u7532"));
	}
}
