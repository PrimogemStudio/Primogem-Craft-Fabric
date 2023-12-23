package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.items.instances.materials.common.ArmorHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class OnArmorTick {
    public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
        if (!entity.level().isClientSide) {
            var le = (LivingEntity) entity;
            var armor_value = ArmorHelper.getArmorValue(le, itemstack);
            if (le.hasEffect(PrimogemCraftMobEffects.AMULATE) && armor_value >= 2) {
                le.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, (int) (armor_value - 6), true, false));
            }
            if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && armor_value >= 4) {
                le.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, (int) (armor_value * 0.5 - 2), true, false));
                le.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, (int) (armor_value * 0.5 - 3), true, false));
            }
        }
    }
}
