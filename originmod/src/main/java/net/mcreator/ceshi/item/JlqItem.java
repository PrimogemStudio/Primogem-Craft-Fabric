
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.JjlcjlqsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class JlqItem extends ShovelItem {
	public JlqItem() {
		super(new Tier() {
			public int getUses() {
				return 1890;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.YUANSHI.get()), new ItemStack(PrimogemcraftModItems.JIANLAOKUAIWUPIN.get()));
			}
		}, 1, -2f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76[SHIFT+\u53F3\u952E]\u00A7d\u5730\u9762\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - \u6D88\u8017\u8010\u4E45\u4EA7\u751F\u7206\u70B8\uFF01"));
		list.add(new TextComponent("\u00A77 - \u5355\u6B21\u51B7\u53748~16\u79D2"));
		list.add(new TextComponent("\u00A7c - \u4E0D\u8981\u5728\u5BB6\u91CC\u4F7F\u7528"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		JjlcjlqsxProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
