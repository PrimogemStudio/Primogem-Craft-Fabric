package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class VayudaTurquoiseGemstoneDiamondItem extends Item {
    public VayudaTurquoiseGemstoneDiamondItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_diamond.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_diamond.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_diamond.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_diamond.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_diamond.line5"));
    }
}
