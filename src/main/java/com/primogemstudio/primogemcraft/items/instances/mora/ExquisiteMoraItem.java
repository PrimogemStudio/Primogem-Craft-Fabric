package com.primogemstudio.primogemcraft.items.instances.mora;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class ExquisiteMoraItem extends Item {
    public ExquisiteMoraItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.exquisite_mora.line1"));
    }
}
