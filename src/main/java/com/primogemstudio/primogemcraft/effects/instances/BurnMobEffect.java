package com.primogemstudio.primogemcraft.effects.instances;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.interfaces.EntityExtension;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BurnMobEffect extends MobEffect {
    public BurnMobEffect() {
        super(MobEffectCategory.HARMFUL, -21961);
    }

    @Override
    public String getDescriptionId() {
        return "effect.primogemcraft.burn";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof EntityExtension ee) {
            ee.setBurnValue(ee.getBurnValue() + 1);
            if (entity.level() instanceof ServerLevel sl) {
                sl.sendParticles(ParticleTypes.LAVA, entity.getX(), entity.getY() + 1, entity.getZ(), 1, 0, 0, 0, 0);
            }
            if (ee.getBurnValue() >= 40) {
                entity.hurt(new DamageSource(entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LAVA)),
                        (float) ((entity.hasEffect(PrimogemCraftMobEffects.BURN) ?
                                entity.getEffect(PrimogemCraftMobEffects.BURN).getAmplifier() : 0) + 1));
                ee.setBurnValue(0);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}