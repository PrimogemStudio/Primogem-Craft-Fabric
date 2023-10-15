
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.XiantiaoqiangjixuxiaoguoProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class XiantiaoqiangItem extends Item {
	public XiantiaoqiangItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(8).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(8).saturationMod(10f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7c\u522B\u628A\u7897\u5403\u4E86\uFF01\uFF01\uFF01"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A75\u5F53\u98DF\u7528\u540E\uFF1A"));
		list.add(new TextComponent("\u00A79+1 \u529B\u91CF\u7B49\u7EA7\uFF085:00\uFF09"));
		list.add(new TextComponent("\u00A79>\u7EE7\u627F\u6301\u7EED\u65F6\u95F4"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		XiantiaoqiangjixuxiaoguoProcedure.execute(entity);
		return retval;
	}
}
