
package net.mcreator.ceshi.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Shenmihuaban_shuxingProcedure;
import net.mcreator.ceshi.procedures.FaguangkaiqiProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;

import java.util.List;

public class ShenshenghuabanItem extends Item {
	public ShenshenghuabanItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).durability(100).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return FaguangkaiqiProcedure.execute(itemstack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5B83\u771F\u597D\u770B"));
		list.add(new TextComponent("\u00A7"));
		list.add(new TextComponent("\u00A7d\u53F3\u952E\u5730\u9762\u53EC\u5524\u4E00\u53EA\u9ED1\u5854"));
		list.add(new TextComponent("\u00A7d\u624B\u6301\u53F3\u952E\u56DE\u6536\u4E00\u53EA\u9ED1\u5854"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Shenmihuaban_shuxingProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
