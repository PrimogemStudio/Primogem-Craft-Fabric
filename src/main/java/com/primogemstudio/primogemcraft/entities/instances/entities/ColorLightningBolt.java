package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.primogemstudio.primogemcraft.modprotocols.AbstractModProtocol;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.phys.AABB;
import org.joml.Vector3f;

public abstract class ColorLightningBolt extends Entity {
    protected int life;
    public long seed;
    protected int flashes;

    public ColorLightningBolt(EntityType<?> entityType, Level level) {
        super(entityType, level);
        noCulling = true;
        life = 2;
        seed = random.nextLong();
        flashes = random.nextInt(3) + 1;
    }

    public abstract Vector3f getRenderColor();

    @Override
    public void tick() {
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
                var list = level().getEntities(this, new AABB(getX() - 3.0, getY() - 3.0, getZ() - 3.0, getX() + 3.0, getY() + 6.0 + 3.0, getZ() + 3.0), Entity::isAlive);
                for (var entity : list) {
                    if (entity instanceof ItemEntity || entity instanceof ExperienceOrb) continue;
                    AbstractModProtocol.GENSHIN_CRAFT_PROTOCOL.onGachaLightningBolt(
                            entity,
                            () -> entity.hurt(damageSources().lightningBolt(), 5)
                    );
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
    public boolean shouldRenderAtSqrDistance(double distance) {
        double d = 64.0 * getViewScale();
        return distance < d * d;
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
