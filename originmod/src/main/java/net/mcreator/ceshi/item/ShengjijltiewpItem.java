
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

public class ShengjijltiewpItem extends Item {
	public ShengjijltiewpItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u53EF\u5728\u953B\u9020\u53F0\u5347\u7EA7\u94C1\u8D28\u88C5\u5907"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u53EF\u5E94\u7528\u4E8E\uFF1A"));
		list.add(new TextComponent("\u00A79 \u94C1\u5251"));
		list.add(new TextComponent("\u00A79 \u94C1\u8D28\u76D4\u7532"));
	}
}
