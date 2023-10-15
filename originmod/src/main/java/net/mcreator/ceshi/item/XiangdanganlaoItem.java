
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.XxiangdangaolaozaibeibaoshiProcedure;
import net.mcreator.ceshi.procedures.XixiangdanganlaoshiyongxiaoguoProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class XiangdanganlaoItem extends Item {
	public XiangdanganlaoItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(1).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u5B58\u5728\u7269\u54C1\u680F\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7a\u62FE\u53D6\u7ECF\u9A8C\u7403\u65F6\u6062\u590D\u5C11\u91CF\u751F\u547D\u503C"));
		list.add(new TextComponent("\u00A7a\u5C0F\u6982\u7387\u00A7c\u635F\u574F\uFF01"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A75\u5F53\u98DF\u7528\u540E\uFF1A"));
		list.add(new TextComponent("\u00A79\u6062\u590D\u5DE8\u989D\u751F\u547D\u503C"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		XixiangdanganlaoshiyongxiaoguoProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		XxiangdangaolaozaibeibaoshiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
