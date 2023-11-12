package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class AcquaintFateEntity extends ThrowableItemProjectile {
    public AcquaintFateEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public AcquaintFateEntity(Level level, LivingEntity shooter) {
        super(PrimogemCraftEntities.ACQUAINT_FATE_ENTITY, shooter, level);
    }

    @Override
    @NotNull
    protected Item getDefaultItem() {
        return PrimogemCraftItems.ACQUAINT_FATE;
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!level().isClientSide && getOwner() instanceof ServerPlayer player) {
            GachaServer.triggered(player, blockPosition(), false);
        }
        discard();
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            level().addParticle(ParticleTypes.CLOUD, true, getX(), getY(), getZ(), 0, 0, 0);
        }
    }
}