
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.HhaokanlajishuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class HhaokandelajiItem extends Item {
	public HhaokandelajiItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u4E00\u4E2A\u4EBA\u7684\u5783\u573E...."));
		list.add(new TextComponent("\u00A79\u751F\u547D\u6062\u590DII\uFF081:00\uFF09"));
		list.add(new TextComponent("\u00A79\u77AC\u95F4\u6CBB\u7597II"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A75\u5F53\u98DF\u7528\u540E\uFF1A"));
		list.add(new TextComponent("\u00A79\u89E3\u9664\u00A7c\u4E50\u900F\u7684\u60E9\u7F5A\u00A79\u6548\u679C"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HhaokanlajishuxingProcedure.execute(entity);
		return retval;
	}
}
