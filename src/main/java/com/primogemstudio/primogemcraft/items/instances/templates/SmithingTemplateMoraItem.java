package com.primogemstudio.primogemcraft.items.instances.templates;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SmithingTemplateMoraItem extends Item {
    public SmithingTemplateMoraItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line5"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_mora.line6"));
    }
}