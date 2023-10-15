
package net.mcreator.ceshi.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class FeiqiupingzhengItem extends Item {
	public FeiqiupingzhengItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u4F7F\u7528\u94F6\u6CB3\u5927\u4E50\u900F\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77-\u63D0\u9AD8\u4F18\u8D28\u5956\u52B1\u7684\u51FA\u73B0\u6982\u7387"));
		list.add(new TextComponent("\u00A77-\u51CF\u5C11\u635F\u574F\u65F6\u7684\u60E9\u7F5A"));
	}
}
