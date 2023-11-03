package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class OldStoneItem extends Item {
    public OldStoneItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.translatable("tooltip.primogemcraft.old_stone.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.old_stone.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.old_stone.line3"));
    }
}
