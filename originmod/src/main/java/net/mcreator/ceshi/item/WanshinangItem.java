
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Wanshinang_shuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class WanshinangItem extends Item {
	public WanshinangItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(32).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u7834\u574F\u7F50\u5B50\u65F6\u6389\u843D\u53CC\u500D\u7269\u54C1"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Wanshinang_shuxingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
