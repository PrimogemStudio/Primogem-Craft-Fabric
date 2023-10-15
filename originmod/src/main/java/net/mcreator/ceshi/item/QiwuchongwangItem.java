
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.ZchongwangzengyiProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class QiwuchongwangItem extends Item {
	public QiwuchongwangItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u5B58\u5728\u7269\u54C1\u680F\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A79\u00B7\u5BC4\u751F\uFF08\u221E\uFF09"));
		list.add(new TextComponent("\u00A77\u5BC4\u751F\u6301\u7EED\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7c\u00B7\u751F\u547D\u503C\u8FBE\u5230\u4E0A\u9650\u540E\u9020\u6210\u968F\u673A\u4F24\u5BB3"));
		list.add(new TextComponent("\u00A7a\u00B7\u529B\u91CF\uFF08\u221E\uFF09"));
		list.add(new TextComponent("\u00A77\u5BC4\u751F\u7ED3\u675F\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7c\u00B7\u9020\u6210\u5927\u91CF\u4F24\u5BB3"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u9971\u98DF\u5EA6\u5C0F\u4E8E12\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7c\u00B7-80%\u751F\u547D\u503C\u4E0A\u9650\u751F\u547D\u503C"));
		list.add(new TextComponent("\u00A7a\u00B7\u8BBE\u7F6E\u9971\u98DF\u5EA6\u81F313"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ZchongwangzengyiProcedure.execute(entity);
	}
}
