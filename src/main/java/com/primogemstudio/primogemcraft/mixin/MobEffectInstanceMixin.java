package com.primogemstudio.primogemcraft.mixin;

import com.primogemstudio.primogemcraft.blocks.PrimogemCraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects.ABNORMAL_DISEASE;

@Mixin(MobEffectInstance.class)
public class MobEffectInstanceMixin {
    @Unique
    private int tick = 0;

    @Inject(method = "applyEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/effect/MobEffect;applyEffectTick(Lnet/minecraft/world/entity/LivingEntity;I)V"))
    private void applyEffect(LivingEntity entity, CallbackInfo ci) {
        if (effect == ABNORMAL_DISEASE) {
            var level = entity.level();
            if (!level.isClientSide) {
                if (tick == 160) {
                    level.explode(null, entity.getX(), entity.getY(), entity.getZ(), 8.0F, Level.ExplosionInteraction.TNT);
                    level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), SoundEvents.GLASS_BREAK, SoundSource.NEUTRAL, 10.0F, 0.5F);
                    level.setBlock(entity.blockPosition(), PrimogemCraftBlocks.PRIMOGEM_ORE.defaultBlockState(), 3);
                    if (Math.random() < 0.5) {
                        level.setBlock(entity.blockPosition().above(), PrimogemCraftBlocks.PRIMOGEM_ORE.defaultBlockState(), 3);
                    }
                    entity.hurt(entity.damageSources().magic(), 20.0f);
                    entity.teleportTo(entity.getX(), -65, entity.getZ());
                }
            }
            tick++;
        }
    }

    @Shadow
    @Final
    private MobEffect effect;
}
