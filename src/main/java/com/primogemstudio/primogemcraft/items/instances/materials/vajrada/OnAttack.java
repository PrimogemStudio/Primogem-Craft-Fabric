package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class OnAttack {
    public static void execute(LevelAccessor world, LivingEntity entity, LivingEntity sourceentity, ItemStack itemstack) {
        if (!sourceentity.hasEffect(PrimogemCraftMobEffects.AMULATE)) {
            var rate = itemstack.getItem() instanceof VajradaAmethystIronItem ? 0.05 : (itemstack.getItem() instanceof VajradaAmethystDiamondSwordItem ? 0.07 : 0.1);
            if (Math.random() < rate) {
                if (world instanceof ServerLevel _level) {
                    LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                    entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())));
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }
    }
}
