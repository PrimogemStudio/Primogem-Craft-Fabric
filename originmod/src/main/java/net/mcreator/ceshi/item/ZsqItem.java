
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.ZsqsxProcedure;
import net.mcreator.ceshi.procedures.Zsqsx2Procedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class ZsqItem extends ShovelItem {
	public ZsqItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.YUANSHI.get()), new ItemStack(PrimogemcraftModItems.ZUISHENGSUIXIE.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ZsqsxProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7d\u624B\u6301\u00A76[SHIFT\u53F3\u952E]\uFF1A"));
		list.add(new TextComponent("\u00A77 - \u8BB0\u5F55\u5F53\u524D\u5750\u6807"));
		list.add(new TextComponent("\u00A7d - \u300E\u8FC7\u53BB\u300F\u6548\u679C\u7ED3\u675F\u65F6\u56DE\u5230\u8FD9\u91CC"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7a[SHIFT+\u5DE6\u952E]\u8C03\u6574\u6548\u679C\u5EF6\u8FDF\uFF01"));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Zsqsx2Procedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}
}
