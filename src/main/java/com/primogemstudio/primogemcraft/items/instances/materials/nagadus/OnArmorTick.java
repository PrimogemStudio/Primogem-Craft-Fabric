package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.items.PrimogemCraftItemTags.*;

public class OnArmorTick {
    public static void execute(Player entity, ItemStack itemstack) {
        if (!itemstack.getOrCreateTag().getBoolean("armor_value")) {
            if (itemstack.is(ELEMENT_IRON)) itemstack.getOrCreateTag().putDouble("armor_value", 0.5);
            if (itemstack.is(ELEMENT_DIAMOND)) itemstack.getOrCreateTag().putDouble("armor_value", 1);
            if (itemstack.is(ELEMENT_NETHERITE)) itemstack.getOrCreateTag().putDouble("armor_value", 2);
        }
        double armor_value =
                entity.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getDouble("armor_value")
                        + entity.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getDouble("armor_value")
                        + entity.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getDouble("armor_value")
                        + entity.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getDouble("armor_value");
        if (armor_value >= 2 && Math.random() < 0.0005 && !entity.level().isClientSide()) {
            entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 10, 0, true, false));
        }
        if (!entity.hasEffect(MobEffects.HEALTH_BOOST) && armor_value >= 4 && !entity.level().isClientSide()) {
            entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200000,
                    (int) (armor_value * 0.5),
                    true, false));
        }
        if (entity.hasEffect(MobEffects.HEALTH_BOOST) && ((entity.hasEffect(MobEffects.HEALTH_BOOST)
                ? entity.getEffect(MobEffects.HEALTH_BOOST).getAmplifier()
                : 0) != armor_value * 0.5
                || armor_value < 4)) {
            entity.removeEffect(MobEffects.HEALTH_BOOST);
        }
    }
}
