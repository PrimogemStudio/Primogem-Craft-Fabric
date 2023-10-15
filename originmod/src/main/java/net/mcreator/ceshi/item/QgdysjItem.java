
package net.mcreator.ceshi.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.QgysjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class QgdysjItem extends SwordItem {
	public QgdysjItem() {
		super(new Tier() {
			public int getUses() {
				return 20;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return -1.7f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BEDROCK));
			}
		}, 3, -2.8f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		QgysjsxProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u00A7o\u300E\u5F69\u86CB\u6B66\u5668\u300F"));
		list.add(new TextComponent("\u00A77 \u2022 \u653B\u51FB\u751F\u547D\u503C\u5C0F\u4E8E10\u70B9\u7684\u751F\u7269\u4F7F\u5176\u89E6\u53D1\u4E00"));
		list.add(new TextComponent("\u00A77   \u4E2A\u795E\u5947\u7684\u6548\u679C"));
		list.add(new TextComponent("\u00A77 \u2022 \u4F7F\u7528\u65F6\u670910%\u6982\u7387\u76F4\u63A5\u635F\u574F"));
		list.add(new TextComponent("\u00A7c \u2022 \u522B\u5728\u5BB6\u91CC\u4F7F\u7528"));
	}
}
