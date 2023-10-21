package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
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

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!level().isClientSide) {
            var li = new GachaFiveStarEntity(PrimogemCraftEntities.GOLDEN_LIGHT, level());
            li.setPos(result.getLocation());
            level().addFreshEntity(li);
            discard();
        }
    }
}
