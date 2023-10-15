
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

import net.mcreator.ceshi.procedures.Suiji_shuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class Suiji1shijianItem extends Item {
	public Suiji1shijianItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u53F3\u952E\u83B7\u5F97\u9519\u8BEF\u4EE3\u7801"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Suiji_shuxingProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
