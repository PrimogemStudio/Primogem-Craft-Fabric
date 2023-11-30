package com.primogemstudio.primogemcraft.effects.instances;

import com.primogemstudio.primogemcraft.interfaces.PastAble;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public class PastMobEffect extends MobEffect {
    public record PastInfo(double x, double y, double z, float health) {
        public PastInfo(LivingEntity entity) {
            this(entity.getX(), entity.getY(), entity.getZ(), entity.getHealth());
        }
    }

    public PastMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -479233);
    }

    @Override
    @NotNull
    public String getDescriptionId() {
        return "effect.primogemcraft.past";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        if (!entity.level().isClientSide()) {
            ((PastAble) entity).setPastInfo(new PastInfo(entity));
            if (entity instanceof Player) {
                entity.level().playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), SoundEvents.UI_TOAST_CHALLENGE_COMPLETE, SoundSource.PLAYERS, 0.5f, 0.2f);
            } else {
                entity.level().playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), SoundEvents.UI_TOAST_CHALLENGE_COMPLETE, SoundSource.NEUTRAL, 0.1f, 0.2f);
            }
        }
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        var info = ((PastAble) entity).getPastInfo();
        entity.teleportTo(info.x, info.y, info.z);
        entity.setHealth(info.health);
        if (entity instanceof ServerPlayer player) {
            player.connection.teleport(info.x, info.y, info.z, entity.getYRot(), entity.getXRot());
            player.closeContainer();
            entity.level().playSound(null, info.x, info.y, info.z, SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 4, (float) 0.5);
        } else {
            entity.level().playSound(null, info.x, info.y, info.z, SoundEvents.PLAYER_LEVELUP, SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}