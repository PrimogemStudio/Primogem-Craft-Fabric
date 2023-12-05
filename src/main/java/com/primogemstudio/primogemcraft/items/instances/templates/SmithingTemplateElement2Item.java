package com.primogemstudio.primogemcraft.items.instances.templates;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SmithingTemplateElement2Item  extends Item {
    public SmithingTemplateElement2Item() {
        super(new Item.Properties().durability(2).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line5"));
        list.add(Component.translatable("tooltip.primogemcraft.smithing_template_element2.line6"));
    }
}
