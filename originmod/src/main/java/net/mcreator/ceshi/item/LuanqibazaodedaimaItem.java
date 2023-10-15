
package net.mcreator.ceshi.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.FumianqiwufaguangProcedure;
import net.mcreator.ceshi.procedures.Daima_1_shuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class LuanqibazaodedaimaItem extends Item {
	public LuanqibazaodedaimaItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(31).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return FumianqiwufaguangProcedure.execute(itemstack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u5C06\u8FD9\u6BB5\u4EE3\u7801\u4FEE\u590D\u6210\u6B63\u5E38\u7684\u5947\u7269\u9700\u8981"));
		list.add(new TextComponent("\u00A77\u51FB\u674030\u53EA\u751F\u7269"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u4FEE\u590D\u671F\u95F4\uFF1A"));
		list.add(new TextComponent("\u00A72\u51FB\u6740\u751F\u7269\u65F6\u670950%\u7684\u6982\u7387\u6D88\u8017"));
		list.add(new TextComponent("\u00A722\u70B9\u9971\u98DF\u5EA6"));
		list.add(new TextComponent("\u00A77\u4EE3\u7801\u4FEE\u590D\u540E\uFF1A"));
		list.add(new TextComponent("\u00A72\u51FB\u6740\u751F\u7269100%\u6062\u590D\u9971\u98DF\u5EA6"));
		list.add(new TextComponent("\u00A72\u6301\u7EED\u5230\u589E\u76CA\u7ED3\u675F"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Daima_1_shuxingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
