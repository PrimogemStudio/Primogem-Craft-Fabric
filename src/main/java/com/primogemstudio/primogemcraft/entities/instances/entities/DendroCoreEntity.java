package com.primogemstudio.primogemcraft.entities.instances.entities;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.util.BlockUtil.findAir;
import static com.primogemstudio.primogemcraft.util.BlockUtil.isAir;

public class DendroCoreEntity extends PathfinderMob {
    private int age = 0;

    public DendroCoreEntity(EntityType<DendroCoreEntity> type, Level world) {
        super(type, world);
        xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        return new ClientboundAddEntityPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

    }

    @Override
    public @NotNull MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation(MOD_ID, "muted"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.firework_rocket.twinkle_far"));
    }

    @Override
    public void thunderHit(ServerLevel serverWorld, LightningBolt lightningBolt) {
        var posit = BlockPos.containing(getX(), getY(), getZ());
        if (isAir(serverWorld, posit)) {
            serverWorld.setBlock(posit, PrimogemCraftBlocks.DENDRO_CORE_BLOCK.defaultBlockState(), 3);
        } else if ((posit = findAir(serverWorld, posit)) != null) {
            serverWorld.setBlock(posit, PrimogemCraftBlocks.DENDRO_CORE_BLOCK.defaultBlockState(), 3);
        } else {
            serverWorld.addFreshEntity(new ItemEntity(serverWorld, getX(), getY(), getZ(), new ItemStack(PrimogemCraftItems.DENDRO_CORE_BLOCK_ITEM)));
        }
        discard();
    }

    @Override
    public void baseTick() {
        super.baseTick();
        double x = getX(), y = getY(), z = getZ();
        if (++age >= 200) {
            dropFromLootTable(damageSources().generic(), false);
            discard();
        }
        if (isOnFire()) {
            var level = level();
            if (!level.isClientSide()) {
                level.explode(null, x, y, z, 4.0F, Level.ExplosionInteraction.TNT);
            }
            discard();
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0).add(Attributes.MAX_HEALTH, 1).add(Attributes.ARMOR, 0.1).add(Attributes.ATTACK_DAMAGE, 1).add(Attributes.FOLLOW_RANGE, 1).add(Attributes.KNOCKBACK_RESISTANCE, 10).add(Attributes.ATTACK_KNOCKBACK, 0.1);
    }
}
