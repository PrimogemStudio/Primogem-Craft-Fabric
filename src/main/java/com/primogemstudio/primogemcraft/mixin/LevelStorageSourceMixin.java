package com.primogemstudio.primogemcraft.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.level.storage.LevelStorageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LevelStorageSource.class)
public class LevelStorageSourceMixin {
    @WrapOperation(method = "method_29582", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundTag;getCompound(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", ordinal = 0))
    private static CompoundTag onGetDataTag(CompoundTag instance, String key, Operation<CompoundTag> original) {
        return GachaServer.loadData(original.call(instance, key));
    }

    @Mixin(LevelStorageSource.LevelStorageAccess.class)
    public static class LevelStorageAccessMixin {
        @ModifyArg(method = "saveDataTag(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/world/level/storage/WorldData;Lnet/minecraft/nbt/CompoundTag;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundTag;put(Ljava/lang/String;Lnet/minecraft/nbt/Tag;)Lnet/minecraft/nbt/Tag;"), index = 1)
        public Tag onSaveDataTag(Tag data) {
            GachaServer.saveData((CompoundTag) data);
            return data;
        }
    }
}
