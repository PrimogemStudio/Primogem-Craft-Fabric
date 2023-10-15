
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

import net.mcreator.ceshi.procedures.LetouchaxunProcedure;
import net.mcreator.ceshi.procedures.DadaletoushibiezhuangtaiProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class YiyinhedaletouItem extends Item {
	public YiyinhedaletouItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(2).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7a\u526F\u624B\u6301\u6709\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A72\u7834\u574F\u65B9\u5757\uFF1A"));
		list.add(new TextComponent("\u00A7a - \u5C0F\u6982\u7387\u83B7\u5F97\u94BB\u77F3"));
		list.add(new TextComponent("\u00A7a - \u5C0F\u6982\u7387\u83B7\u5F97\u00A75\u5947\u7269"));
		list.add(new TextComponent("\u00A7a - \u5927\u6982\u7387\u89E6\u53D1\u00A7c\u00A7m\u60CA\u559C"));
		list.add(new TextComponent("\u00A7a\u5E76\u00A7c\u6467\u6BC1\u00A7a\u7269\u54C1"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A77\u4E3B\u624B\u6301\u53F3\u952E\u7A7A\u6C14\u67E5\u8BE2\u5F53\u524D"));
		list.add(new TextComponent("\u00A77\u635F\u574F\u94F6\u6CB3\u5927\u4E50\u900F\u7684\u6570\u91CF"));
		list.add(new TextComponent("\u00A79\u5168\u5458\u900F\u9732\u7ED3\u679C\u51B7\u53741\u5206\u949F"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LetouchaxunProcedure.execute(world, entity, itemstack);
		return ar;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		DadaletoushibiezhuangtaiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
