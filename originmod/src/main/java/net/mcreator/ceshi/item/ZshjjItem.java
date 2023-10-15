
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Zsjsx2Procedure;
import net.mcreator.ceshi.procedures.ZsjgjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class ZshjjItem extends SwordItem {
	public ZshjjItem() {
		super(new Tier() {
			public int getUses() {
				return 2460;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.ZUISHENGDUANPIAN.get()), new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -2f, new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ZsjgjsxProcedure.execute(entity.level, entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Zsjsx2Procedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76[SHIFT+\u53F3\u952E]\uFF1A"));
		list.add(new TextComponent("\u00A75 - \u83B7\u5F97\u52FE\u7389\u6548\u679C III"));
		list.add(new TextComponent("\u00A77 - \u6301\u7EED\u65F6\u95F410\u79D2"));
		list.add(new TextComponent("\u00A77 - \u51B7\u537445\u79D2"));
		list.add(new TextComponent("\u00A76\u975E\u52FE\u7389\u72B6\u6001\u4E0B"));
		list.add(new TextComponent("\u00A77 - \u653B\u51FB\u76EE\u6807\u6982\u7387\u91CA\u653E\u95EA\u7535"));
		list.add(new TextComponent("\u00A77 - \u89E6\u53D1\u6982\u738710%"));
	}
}
