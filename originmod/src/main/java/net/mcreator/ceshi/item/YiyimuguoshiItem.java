
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Yiyijieguoshi_shuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class YiyimuguoshiItem extends Item {
	public YiyimuguoshiItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(3).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u73A9\u5BB6\u6B7B\u4EA1\u65F6\uFF0C\u4E3A\u5176\u63D0\u4F9B\u4E00\u5206\u949F\u7684\u989D\u5916\u751F\u547D"));
		list.add(new TextComponent("\u671F\u95F4\u4E0D\u4F1A\u53D7\u5230\u4F24\u5BB3"));
		list.add(new TextComponent("\u00A7a\u4E0D\u80FD\u8FDE\u7EED\u89E6\u53D1"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Yiyijieguoshi_shuxingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
