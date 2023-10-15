
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.GUIwupxianzhiProcedure;

import java.util.List;

public class Kaifaqiangzhi01Item extends Item {
	public Kaifaqiangzhi01Item() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7c-\u5F3A\u5236\u9000\u51FA\u754C\u9762\u540E"));
		list.add(new TextComponent("\u00A7c\u8FD4\u8FD8\u4E00\u4E2A\u968F\u673A\u7ED3\u679C"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GUIwupxianzhiProcedure.execute(entity, itemstack);
	}
}
