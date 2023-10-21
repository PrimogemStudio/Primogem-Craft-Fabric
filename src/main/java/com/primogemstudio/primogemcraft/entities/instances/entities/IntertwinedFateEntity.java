package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.google.common.collect.ImmutableList;
import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities.*;

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

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!level().isClientSide) {
            final var ls = ImmutableList.of(BLUE_LIGHT, PURPLE_LIGHT, GOLDEN_LIGHT);
            var li = ls.get(random.nextInt(3)).create(level());
            li.setPos(result.getLocation());
            level().addFreshEntity(li);
            discard();
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            level().addParticle(ParticleTypes.CLOUD, true, getX(), getY(), getZ(), 0, 0, 0);
        }
    }
}
