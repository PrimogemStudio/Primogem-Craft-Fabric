
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Zhapianding_tuozhan_1Procedure;
import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModSounds;

import java.util.List;

public class ZhapiandingzhengshiItem extends RecordItem {
	public ZhapiandingzhengshiItem() {
		super(0, PrimogemcraftModSounds.REGISTRY.get(new ResourceLocation("primogemcraft:zhapian")), new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77\u8868\u9762\u7559\u6709\u7EC6\u7EB9"));
		list.add(new TextComponent("\u00A77\u6216\u8BB8\u53EF\u4EE5\u653E\u8FDB\u5531\u7247\u673A...."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Zhapianding_tuozhan_1Procedure.execute(

		);
		return InteractionResult.SUCCESS;
	}
}
