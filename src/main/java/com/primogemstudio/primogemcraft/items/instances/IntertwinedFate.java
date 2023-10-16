package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class IntertwinedFate extends Item {
    public IntertwinedFate() {
        super(new Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        //TODO
        return super.finishUsingItem(stack, level, livingEntity);
    }
}
