package com.primogemstudio.primogemcraft.interfaces;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public interface ItemExtension {
    default boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        return false;
    }
}
