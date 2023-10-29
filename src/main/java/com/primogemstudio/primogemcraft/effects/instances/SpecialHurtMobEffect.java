package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import org.jetbrains.annotations.NotNull;

public class SpecialHurtMobEffect extends MobEffect {
    public SpecialHurtMobEffect() {
        super(MobEffectCategory.HARMFUL, -8123894);
    }

    @Override
    public @NotNull String getDescriptionId() {
        return "effect.primogemcraft.yiji";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        // TODO port YjsxProcedure
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // TODO port Yjsx2Procedure
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
