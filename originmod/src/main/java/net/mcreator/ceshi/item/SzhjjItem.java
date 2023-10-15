
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

import net.mcreator.ceshi.procedures.SzjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class SzhjjItem extends SwordItem {
	public SzhjjItem() {
		super(new Tier() {
			public int getUses() {
				return 2300;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT), new ItemStack(PrimogemcraftModItems.SHENGZHANGDUANPIAN.get()));
			}
		}, 3, -2f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SzjsxProcedure.execute(entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u653B\u51FB\u751F\u7269\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - \u4E3A\u76EE\u6807\u65BD\u52A0\u300E\u5343\u53F6\u300F\u6548\u679C III"));
		list.add(new TextComponent("\u00A77 - \u6301\u7EED\u65F6\u95F4\u53EF\u53E0\u52A0"));
		list.add(new TextComponent("\u00A77 - \u65BD\u52A0\u95F4\u9694 8\u79D2"));
	}
}
