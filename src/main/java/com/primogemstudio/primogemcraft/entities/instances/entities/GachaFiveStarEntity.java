package com.primogemstudio.primogemcraft.entities.instances.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class GachaFiveStarEntity extends Entity {
    private int life;
    public long seed;
    private int flashes;

    public GachaFiveStarEntity(EntityType<? extends LightningBolt> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        List<Entity> list;
        super.tick();
        if (life == 2) {
            if (level().isClientSide()) {
                level().playLocalSound(getX(), getY(), getZ(), SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.WEATHER, 10000.0f, 0.8f + random.nextFloat() * 0.2f, false);
                level().playLocalSound(getX(), getY(), getZ(), SoundEvents.LIGHTNING_BOLT_IMPACT, SoundSource.WEATHER, 2.0f, 0.5f + random.nextFloat() * 0.2f, false);
            } else {
                powerLightningRod();
                var pos = position();
                LightningBolt.clearCopperOnLightningStrike(level(), BlockPos.containing(pos.x, pos.y - 1.0E-6, pos.z));
            }
        }
        --life;
        if (life < 0) {
            if (flashes == 0) {
                discard();
            } else if (life < -random.nextInt(10)) {
                --flashes;
                life = 1;
                seed = random.nextLong();
            }
        }
        if (life >= 0) {
            if (level().isClientSide) {
                level().setSkyFlashTime(2);
            } else {
                list = level().getEntities(this, new AABB(getX() - 3.0, getY() - 3.0, getZ() - 3.0, getX() + 3.0, getY() + 6.0 + 3.0, getZ() + 3.0), Entity::isAlive);
                for (Entity entity2 : list) {
                    entity2.hurt(damageSources().lightningBolt(), 5);
                }
            }
        }
    }

    private void powerLightningRod() {
        var pos = position();
        var blockPos = BlockPos.containing(pos.x, pos.y - 1.0E-6, pos.z);
        var blockState = level().getBlockState(blockPos);
        if (blockState.getBlock() instanceof LightningRodBlock block) {
            block.onLightningStrike(blockState, level(), blockPos);
        }
    }

    @Override
    protected void defineSynchedData() {
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound) {
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compound) {
    }
}
