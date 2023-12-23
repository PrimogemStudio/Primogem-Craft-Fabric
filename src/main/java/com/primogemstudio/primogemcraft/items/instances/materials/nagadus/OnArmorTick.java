package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.items.instances.materials.common.ArmorHelper.getArmorValue;

public class OnArmorTick {
    public static void execute(Player entity, ItemStack itemstack) {
        var armor_value = getArmorValue(entity, itemstack);
        if (!entity.level().isClientSide) {
            if (armor_value >= 2 && Math.random() < 0.0005) {
                entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 10, 0, true, false));
            }
            if (!entity.hasEffect(MobEffects.HEALTH_BOOST) && armor_value >= 4) {
                entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200000, (int) (armor_value * 0.5), true, false));
            }
            var effect = entity.getEffect(MobEffects.HEALTH_BOOST);
            if (effect != null && (effect.getAmplifier() != armor_value * 0.5 || armor_value < 4)) {
                entity.removeEffect(MobEffects.HEALTH_BOOST);
            }
        }
    }
}
