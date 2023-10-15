
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

import net.mcreator.ceshi.procedures.CcebuzhunxiashuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class CebuzhunxiaItem extends Item {
	public CebuzhunxiaItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A70\u00A7m\u9644\u4E0D\u51C6\u5323"));
		list.add(new TextComponent("\u00A7b\u53F3\u952E\u4F7F\u7528\u00A7f\u540E\u5BF9\u00A7b\u526F\u624B\u00A7c\u672A\u9644\u9B54\u00A7e\u7269\u54C1"));
		list.add(new TextComponent("\u00A7f\u6DFB\u52A0\u00A7d1~30\u00A7f\u7EA7\u00A7a\u968F\u673A\u00A75\u9644\u9B54"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CcebuzhunxiashuxingProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
