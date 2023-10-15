
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.AxfsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class AxfItem extends AxeItem {
	public AxfItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.YUANSHI.get()), new ItemStack(PrimogemcraftModItems.AIXUBINGYUSUIXIE.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AxfsxProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u53F3\u952E\u7A7A\u6C14\u65F6\uFF1A"));
		list.add(new TextComponent("\u00A77 - 50%\u6982\u7387\u6D88\u8017\u4E00\u4E2A\u00A7d\u00A7n\u6700\u80DC\u7D2B\u6676 \u788E\u5C51"));
		list.add(new TextComponent("\u00A77 - \u5BF9\u5468\u56F4\u975E\u961F\u53CB\u751F\u7269"));
		list.add(new TextComponent("\u00A77    \u9020\u6210\u4E00\u6B21\u00A7b\u00A7o [3d8] \u00A77\u771F\u5B9E\u4F24\u5BB3"));
		list.add(new TextComponent("\u00A77 - \u51B7\u537410\u79D2"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7d\u4F7F\u7528\u6469\u62C9\u53EF\u6DFB\u52A0\u961F\u53CB"));
	}
}
