
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ceshi.procedures.GongzhuxinghuacaidanchufaProcedure;
import net.mcreator.ceshi.procedures.GongzhuxinghuacaidanProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModSounds;

public class GongzhuxinghuaItem extends RecordItem {
	public GongzhuxinghuaItem() {
		super(1, PrimogemcraftModSounds.REGISTRY.get(new ResourceLocation("primogemcraft:gongzhuxinghua")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		GongzhuxinghuacaidanchufaProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GongzhuxinghuacaidanProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
