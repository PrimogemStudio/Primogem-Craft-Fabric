package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class Primogem extends Item {
    public Primogem() {
        super(new Item.Properties().stacksTo(160).fireResistant().rarity(Rarity.EPIC));
    }

    public int getUseDuration(ItemStack itemstack) {
        return 40;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.primogem.line1"));
    }
}
