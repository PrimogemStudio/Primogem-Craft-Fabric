package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.items.instances.materials.common.ArmorHelper.getArmorValue;

public class OnArmorTick {
    public static void execute(LivingEntity entity, ItemStack itemstack) {
        var armor_value = getArmorValue(entity, itemstack);
        if (!entity.hasEffect(MobEffects.SLOW_FALLING) && armor_value >= 2) {
            entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, (int) (armor_value * 0.5 - 1), true, false));
        }
        if (!entity.hasEffect(MobEffects.JUMP) && armor_value >= 4) {
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, (int) (armor_value * 0.5 - 1), true, false));
        }
    }
}
