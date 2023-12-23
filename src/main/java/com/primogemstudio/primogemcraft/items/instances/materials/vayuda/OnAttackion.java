package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OnAttackion {
    public static void execute(Level level, double x, double y, double z, LivingEntity entity, ItemStack itemstack) {
        if (itemstack.getItem() instanceof VayudaTurquoiseGemstoneIronSwordItem) {
            if (Math.random() < 0.25) {
                entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 20, false, false));
                post(level, x, y, z, entity);
            }
        }
        if (itemstack.getItem() instanceof VayudaTurquoiseGemstoneDiamondSwordItem) {
            if (Math.random() < 0.5) {
                entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 45, false, false));
                post(level, x, y, z, entity);
            }
        }
        if (itemstack.getItem() instanceof VayudaTurquoiseGemstoneNetheriteSwordItem) {
            if (Math.random() < 0.75) {
                entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 60, false, false));
                post(level, x, y, z, entity);
            }
        }
    }

    private static void post(Level level, double x, double y, double z, LivingEntity entity) {
        entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, false, false));
        if (!level.isClientSide()) {
            level.playSound(null, x, y, z, SoundEvents.TRIDENT_RIPTIDE_2, SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(RandomSource.create(), 1.5, 3));
        }
    }
}
