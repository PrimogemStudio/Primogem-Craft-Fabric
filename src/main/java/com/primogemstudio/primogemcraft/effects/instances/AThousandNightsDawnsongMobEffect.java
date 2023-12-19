package com.primogemstudio.primogemcraft.effects.instances;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.interfaces.EntityExtension;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class AThousandNightsDawnsongMobEffect extends MobEffect {
    public AThousandNightsDawnsongMobEffect() {
        super(MobEffectCategory.HARMFUL, -5243565);
    }

    @Override
    public String getDescriptionId() {
        return "effect.primogemcraft.a_thousand_nights_dawnsong";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        var handle = (EntityExtension) entity;
        handle.setDawnsongValue(handle.getDawnsongValue() + 1);
        if (handle.getDawnsongValue() >= 40) {
            entity.hurt(new DamageSource(entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
                    entity.hasEffect(PrimogemCraftMobEffects.DAWNSONG) ? entity.getEffect(PrimogemCraftMobEffects.DAWNSONG).getAmplifier() : 0);
            handle.setDawnsongValue(0);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
