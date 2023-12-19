package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class AThousandNightsDawnsongCooldownMobEffect extends MobEffect {
    public AThousandNightsDawnsongCooldownMobEffect() {
        super(MobEffectCategory.NEUTRAL, -65536);
    }

    @Override
    public String getDescriptionId() {
        return "effect.primogemcraft.a_thousand_nights_dawnsong_cooldown";
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        var level = entity.level();
        var x = entity.getX();
        var y = entity.getY();
        var z = entity.getZ();
        if (!level.isClientSide()) {
            level.playSound(null, BlockPos.containing(x, y, z), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS, (float) 0.5, 1);
        }
        else {
            level.playLocalSound(x, y, z, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS, (float) 0.5, 1, false);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
