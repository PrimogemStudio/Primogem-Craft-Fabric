package com.primogemstudio.primogemcraft.items.instances.materials.common;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.items.PrimogemCraftItemTags.*;

public class ArmorHelper {
    public static double getArmorValue(LivingEntity entity, ItemStack itemstack) {
        setArmorValue(itemstack);
        return entity.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getDouble("armor_value") + entity.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getDouble("armor_value") + entity.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getDouble("armor_value") + entity.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getDouble("armor_value");
    }

    public static void setArmorValue(ItemStack itemstack) {
        if (!itemstack.getOrCreateTag().getBoolean("armor_value")) {
            if (itemstack.is(ELEMENT_IRON)) itemstack.getOrCreateTag().putDouble("armor_value", 0.5);
            if (itemstack.is(ELEMENT_DIAMOND)) itemstack.getOrCreateTag().putDouble("armor_value", 1);
            if (itemstack.is(ELEMENT_NETHERITE)) itemstack.getOrCreateTag().putDouble("armor_value", 2);
        }
    }
}
