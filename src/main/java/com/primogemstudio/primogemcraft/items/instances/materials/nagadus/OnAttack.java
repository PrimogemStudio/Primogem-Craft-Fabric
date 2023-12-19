package com.primogemstudio.primogemcraft.items.instances.materials.nagadus;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class OnAttack {
    public static void execute(LivingEntity entity, LivingEntity sourceentity, ItemStack itemstack) {
        boolean isIron = itemstack.getItem() instanceof NagadusEmeraldIronSwordItem;
        boolean isDiamond = itemstack.getItem() instanceof NagadusEmeraldDiamondSwordItem;
        int val1 = isIron ? 100 : (isDiamond ? 160 : 200);
        int val2 = isIron ? 60 : (isDiamond ? 100 : 120);
        int val3 = isIron ? 40 : (isDiamond ? 80 : 150);
        if (!sourceentity.hasEffect(PrimogemCraftMobEffects.DAWNSONG_COOLDOWN)) {
            if (entity instanceof Player) {
                if (entity.hasEffect(MobEffects.CONFUSION)) {
                    if (entity.level().isClientSide())
                        entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (entity.hasEffect(MobEffects.CONFUSION) ? entity.getEffect(MobEffects.CONFUSION).getDuration() : 0) + val1,
                                (entity.hasEffect(MobEffects.CONFUSION) ? entity.getEffect(MobEffects.CONFUSION).getAmplifier() : 0) - 1));
                } else {
                    if (!entity.level().isClientSide())
                        entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, val1, 0));
                }
            } else {
                if (entity.hasEffect(PrimogemCraftMobEffects.DAWNSONG)) {
                    if (!entity.level().isClientSide())
                        entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.DAWNSONG,
                                (entity.hasEffect(PrimogemCraftMobEffects.DAWNSONG) ? entity.getEffect(PrimogemCraftMobEffects.DAWNSONG).getDuration() : 0) + val2,
                                (entity.hasEffect(PrimogemCraftMobEffects.DAWNSONG) ? entity.getEffect(PrimogemCraftMobEffects.DAWNSONG).getAmplifier() : 0) - 1));
                } else if (!entity.level().isClientSide()) {
                    entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.DAWNSONG, val2, 0));
                }
            }
            if (!entity.level().isClientSide())
                entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.DAWNSONG_COOLDOWN, val3, 0, false, false));
        }
    }
}
