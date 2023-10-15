
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Ceshi_3Procedure;

import java.util.List;

public class CeshiyongwupinItem extends Item {
	public CeshiyongwupinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u8FD9\u662F\u5F00\u53D1\u8005\u7528\u7684"));
		list.add(new TextComponent("\u4F60\u62FF\u7740\u9664\u4E86\u80FD\u770B\u539F\u77F3\u7684\u521D\u7248\u6750\u8D28\u4EE5\u5916"));
		list.add(new TextComponent("\u6CA1\u6709\u4EFB\u4F55\u7528\u9014"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Ceshi_3Procedure.execute(entity);
		return ar;
	}
}
