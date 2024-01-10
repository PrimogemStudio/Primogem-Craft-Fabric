package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class OnAttack {
    public static void execute(LivingEntity entity, ItemStack itemstack) {
        if (!entity.hasEffect(PrimogemCraftMobEffects.BURN) && !entity.level().isClientSide) {
            boolean isIron = itemstack.getItem() instanceof AgnidusAgateIronSwordItem;
            boolean isDiamond = itemstack.getItem() instanceof AgnidusAgateDiamondSwordItem;
            int lev = isIron ? 0 : (isDiamond ? 1 : 2);
            if (Math.random() < 0.25 * (lev + 1)) entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.BURN, 120, lev));
        }
    }
}
