
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.SsanbamiantouxiaoguoProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class SsanbamiantouItem extends Item {
	public SsanbamiantouItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7a\u53F3\u952E\u4F7F\u7528\u540E\uFF1A"));
		list.add(new TextComponent("\u00A7d\u968F\u673A\u8F6C\u5316\u7269\u54C1\u680F\u4E2D\u5305\u62EC\u81EA\u8EAB\u6240\u5728"));
		list.add(new TextComponent("\u00A7d\u7684\u6240\u6709\u79CD\u7C7B\u5947\u7269"));
		list.add(new TextComponent("\u00A7d\u540C\u4E00\u79CD\u7C7B\u81F3\u591A\u8F6C\u53161\u4EF6"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7a\u8F6C\u5316\u9519\u8BEF\u4EE3\u7801\u5947\u7269\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77\u8F6C\u5316\u5931\u8D25\u738750%"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SsanbamiantouxiaoguoProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
