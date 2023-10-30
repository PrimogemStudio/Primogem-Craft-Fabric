package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

public class AbnormalDiseaseMobEffect extends MobEffect {
    public AbnormalDiseaseMobEffect() {
        super(MobEffectCategory.HARMFUL, 0xff840a0a);
    }

    @Override
    @NotNull
    public String getDescriptionId() {
        return "effect.primogemcraft.abnormal_disease";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        if (!entity.level().isClientSide()) {
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 127, false, false));
        }
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.level() instanceof ServerLevel serverLevel) {
            var random = serverLevel.random;
            var x = entity.getX();
            var y = entity.getY();
            var z = entity.getZ();
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(200.0f, 0.0f, 0.0f), 3), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 1.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(200.0f, 0.0f, 0.0f), 3), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 2.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(100.0f, 0.0f, 0.0f), 1), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 1.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(100.0f, 0.0f, 0.0f), 1), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 2.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(150.0f, 0.0f, 0.0f), 2), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 1.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
            serverLevel.sendParticles(new DustParticleOptions(new Vector3f(150.0f, 0.0f, 0.0f), 2), x + random.nextGaussian() * 2, y + random.nextGaussian() * 1.5 + 2.5, z + random.nextGaussian() * 2, 0, 0, 0, 0, 0);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
