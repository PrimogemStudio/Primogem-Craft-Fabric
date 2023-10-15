
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.JljsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class JljzsItem extends SwordItem {
	public JljzsItem() {
		super(new Tier() {
			public int getUses() {
				return 1920;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 4.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.JIANRANSUIXIE.get()), new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.2f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		JljsxProcedure.execute(entity.level, entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u653B\u51FB\u76EE\u6807\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - \u524A\u5F31\u76EE\u6807\u653B\u51FB\u4F24\u5BB3"));
		list.add(new TextComponent("\u00A77 - \u89E6\u53D1\u51E0\u7387100%"));
		list.add(new TextComponent("\u00A77 - \u5B58\u50A8\u7684\u89E6\u53D1\u6B21\u6570 5"));
		list.add(new TextComponent("\u00A77 - \u89E6\u53D1\u51B7\u53746\u79D2 \u6BCF\u6B21\u5355\u72EC\u8BA1\u7B97"));
		list.add(new TextComponent("\u00A77 - \u5355\u6B21\u89E6\u53D1\u6301\u7EED\u65F6\u95F4 5\u79D2"));
	}
}
