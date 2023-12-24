package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class AgnidusAgateIronItem extends Item {
    public AgnidusAgateIronItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.agnidus_agate_iron.line5"));
    }
}
