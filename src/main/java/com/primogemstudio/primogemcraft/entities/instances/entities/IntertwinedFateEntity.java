package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class IntertwinedFateEntity extends ThrowableItemProjectile {
    public IntertwinedFateEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public IntertwinedFateEntity(Level level, LivingEntity shooter) {
        super(PrimogemCraftEntities.INTERTWINED_FATE_ENTITY, shooter, level);
    }

    @Override
    @NotNull
    protected Item getDefaultItem() {
        return PrimogemCraftItems.INTERTWINED_FATE;
    }

    @SuppressWarnings("DataFlowIssue")
    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!level().isClientSide) {
            if (getOwner() instanceof ServerPlayer serverply) {
                GachaServer.triggered(serverply, blockPosition());
            }
            level().playSound(null, BlockPos.containing(result.getLocation()), PrimogemCraftSounds.PRE_GACHA, SoundSource.HOSTILE, 70, 1);
        }
        else {
            level().playLocalSound(BlockPos.containing(result.getLocation()), PrimogemCraftSounds.PRE_GACHA, SoundSource.HOSTILE, 70, 1, false);
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
