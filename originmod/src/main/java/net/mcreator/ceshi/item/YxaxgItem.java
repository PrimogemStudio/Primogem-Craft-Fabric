
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

import net.mcreator.ceshi.procedures.YxaxgsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class YxaxgItem extends PickaxeItem {
	public YxaxgItem() {
		super(new Tier() {
			public int getUses() {
				return 2561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.YSFC.get()), new ItemStack(PrimogemcraftModItems.AIXUBINGYUSUIXIE.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u53F3\u952E\u65B9\u5757\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - 95%\u6982\u7387\u8F6C\u5316\u00A7f\u00A7n\u901A\u7528\u5143\u7D20\u6676\u4F53\u5757\u00A77\u4E3A\u968F\u673A\u5143\u7D20\u6676\u4F53\u5757"));
		list.add(new TextComponent("\u00A7c - 5%\u6982\u7387\u9500\u6BC1\u65B9\u5757"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		YxaxgsxProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()), context.getPlayer(),
				context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
