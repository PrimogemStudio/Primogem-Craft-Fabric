package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public class FlyingMobEffect extends MobEffect {
    public FlyingMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public @NotNull String getDescriptionId() {
        return "effect.primogemcraft.flying";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player ply) {
            ply.getAbilities().mayfly = true;
            ply.onUpdateAbilities();
        }
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        if (entity instanceof ServerPlayer ply && ply.gameMode.isSurvival()) {
            ply.getAbilities().mayfly = false;
            ply.getAbilities().flying = false;
            ply.onUpdateAbilities();
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}