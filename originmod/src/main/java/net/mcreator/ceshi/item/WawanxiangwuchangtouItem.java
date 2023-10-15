
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.WawanxiangwuchangtoushuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class WawanxiangwuchangtouItem extends Item {
	public WawanxiangwuchangtouItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7b\u53F3\u952E\u4F7F\u7528\u00A7f\u540E\u4F9D\u636E\u00A7b\u526F\u624B\u6301\u6709\u00A7a\u5DE5\u5177\u00A7f\u7684\u00A7b\u7C7B\u578B"));
		list.add(new TextComponent("\u00A7f\u5BF9\u00A7c\u5DF2\u9644\u9B54\u00A7f\u7684\u00A7b\u5DE5\u5177\u7C7B\u00A7e\u7269\u54C1\u00A7f\u63D0\u4F9B"));
		list.add(new TextComponent("\u00A7d2\u6761\u00A7e\u968F\u673A\u5C5E\u6027\u00A7b\u968F\u673A\u7B49\u7EA7\u00A7f\u7684\u00A75\u9644\u9B54\u00A7f\u6548\u679C\uFF01"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WawanxiangwuchangtoushuxingProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
