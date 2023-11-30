package com.primogemstudio.primogemcraft.mixin;

import com.primogemstudio.primogemcraft.effects.instances.PastMobEffect;
import com.primogemstudio.primogemcraft.interfaces.ItemExtension;
import com.primogemstudio.primogemcraft.interfaces.PastAble;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin implements PastAble {
    @Shadow
    public abstract ItemStack getItemInHand(InteractionHand hand);

    @Unique
    private PastMobEffect.PastInfo pastInfo;

    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;Z)V", cancellable = true)
    public void onSwing(InteractionHand hand, boolean updateSelf, CallbackInfo ci) {
        var item = getItemInHand(hand);
        if (item.getItem() instanceof ItemExtension ie) {
            if (!item.isEmpty() && ie.onEntitySwing(item, (LivingEntity) (Object) this)) ci.cancel();
        }
    }

    @Inject(method = "readAdditionalSaveData", at = @At("RETURN"))
    private void readAdditionalSaveData(CompoundTag compound, CallbackInfo ci) {
        if (compound.contains("PastInfo")) {
            var info = compound.getCompound("PastInfo");
            pastInfo = new PastMobEffect.PastInfo(info.getDouble("x"), info.getDouble("y"), info.getDouble("z"), info.getFloat("health"));
        }
    }

    @Inject(method = "addAdditionalSaveData", at = @At("HEAD"))
    private void addAdditionalSaveData(CompoundTag compound, CallbackInfo ci) {
        if (pastInfo != null) {
            var info = new CompoundTag();
            compound.put("PastInfo", info);
            info.putDouble("x", pastInfo.x());
            info.putDouble("y", pastInfo.y());
            info.putDouble("z", pastInfo.z());
            info.putFloat("health", pastInfo.health());
        }
    }

    public void setPastInfo(PastMobEffect.PastInfo info) {
        pastInfo = info;
    }

    @Override
    public PastMobEffect.PastInfo getPastInfo() {
        return pastInfo;
    }
}
