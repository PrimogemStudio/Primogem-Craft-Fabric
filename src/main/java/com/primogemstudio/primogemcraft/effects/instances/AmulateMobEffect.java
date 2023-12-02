package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class AmulateMobEffect extends MobEffect {
    public AmulateMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -1878800);
    }

    @Override
    public @NotNull String getDescriptionId() {
        return "effect.primogemcraft.amulate";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        if (entity.level() instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (!entity.level().isClientSide()) {
            entity.level().playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), SoundEvents.TRIDENT_THUNDER, SoundSource.PLAYERS, 3, 0.5F);
        }
        else {
            entity.level().playLocalSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.TRIDENT_THUNDER, SoundSource.PLAYERS, 3, 0.5F, false);
        }
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity == null)
            return;
        if (entity.getMainHandItem().is(TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "vajrada_amethyst_swords")))) {
            if (!entity.level().isClientSide()) {
                entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60,
                        (entity.hasEffect(this) ? entity.getEffect(this).getAmplifier() : 0) * 2, false, false));
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60,
                        (entity.hasEffect(this) ? entity.getEffect(this).getAmplifier() : 0) * 3, false, false));
                entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 60,
                        entity.hasEffect(this) ? entity.getEffect(this).getAmplifier() : 0, false, false));
                entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, false, false));
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}