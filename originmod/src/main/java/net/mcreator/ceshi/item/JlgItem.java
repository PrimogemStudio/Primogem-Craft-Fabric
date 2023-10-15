
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.JlgsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class JlgItem extends PickaxeItem {
	public JlgItem() {
		super(new Tier() {
			public int getUses() {
				return 1861;
			}

			public float getSpeed() {
				return 12.5f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.JIANRANSUIXIE.get()), new ItemStack(PrimogemcraftModItems.YUANSHI.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76 [SHIFT]\u00A7d\u53F3\u952E\u65B9\u5757\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - \u6D88\u8017\u8010\u4E45\u540E50%\u8F6C\u5316\u77F3\u5934\u4E3A\u91D1\u77FF\u77F3"));
		list.add(new TextComponent("\u00A77 - \u6709\u6982\u7387\u8F6C\u5316\u65B9\u5757\u4E3A\u00A7k\u5B57\u5B57\u5B57\u00A7r\u00A77\uFF01"));
		list.add(new TextComponent("\u00A77 - \u51B7\u5374\u65F6\u95F420\u79D2"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		JlgsxProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
