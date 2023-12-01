package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class VajradaAmethystNetheriteItem extends Item {
    public VajradaAmethystNetheriteItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.element_material_netherite.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.element_material_netherite.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.element_material_netherite.line3"));
        list.add(Component.translatable("tooltip.primogemcraft.element_material_netherite.line4"));
        list.add(Component.translatable("tooltip.primogemcraft.element_material_netherite.line5"));
    }
}
