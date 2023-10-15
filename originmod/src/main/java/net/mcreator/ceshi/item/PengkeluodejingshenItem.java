
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Luodejingshe_shuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class PengkeluodejingshenItem extends Item {
	public PengkeluodejingshenItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(10).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u5B58\u5728\u7269\u54C1\u680F\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7c-\u7F13\u6162\u635F\u574F"));
		list.add(new TextComponent("\u00A77\u653B\u51FB\u76EE\u6807\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A7a-\u6218\u6597\u72B6\u6001\uFF080:05\uFF09"));
		list.add(new TextComponent("\u00A77\u6218\u6597\u72B6\u6001\u4E0B\uFF1A"));
		list.add(new TextComponent("\u00A7d-\u65E0\u5DEE\u522B\u5BF9\u9644\u8FD1\u751F\u7269\u65BD\u52A0\u5927\u91CF\u8D1F\u9762\u6548\u679C"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A79\u751F\u7269\u53D7\u5F71\u54CD\u95F4\u9694\uFF1A60s"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Luodejingshe_shuxingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
