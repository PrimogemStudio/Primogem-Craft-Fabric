
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

public class Mmola01Item extends Item {
	public Mmola01Item() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u636E\u8BF4\u662F\u67D0\u4E2A\u4E16\u754C\u7684\u901A\u7528\u8D27\u5E01"));
		list.add(new TextComponent("\u00A77\u4F46\u7EDD\u5BF9\u4E0D\u662F\u8FD9\u91CC"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A75[SHIFT+\u53F3\u952E]\u00A7d\u5B9E\u4F53\u00A7c\u00A7m\u6536\u4E70\u00A7d\u6DFB\u52A0\u961F\u53CB"));
	}
}
