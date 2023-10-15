
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class BufengpingItem extends Item {
	public BufengpingItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.GLASS_BOTTLE);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7b\u7A7A\u74F6\u00A7a\u6F5C\u884C+\u53F3\u952E\u00A7b\u7A7A\u6C14\u00A7a\u83B7\u5F97"));
		list.add(new TextComponent("\u4E5F\u53EF\u4EE5\u5408\u6210"));
	}
}
