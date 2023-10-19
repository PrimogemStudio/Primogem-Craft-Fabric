package com.primogemstudio.primogemcraft.mixin;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.primogemstudio.primogemcraft.gacha.GachaServer;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.level.WorldDataConfiguration;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.minecraft.world.level.storage.LevelStorageSource;
import net.minecraft.world.level.storage.WorldData;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LevelStorageSource.class)
public class LevelStorageSourceMixin {
    @Mixin(LevelStorageSource.LevelStorageAccess.class)
    public static class LevelStorageAccessMixin {
        @Shadow
        @Final
        LevelStorageSource.LevelDirectory levelDirectory;

        @Inject(at = @At("HEAD"), method = "getDataTag")
        public void onGetDataTag(DynamicOps<Tag> ops, WorldDataConfiguration dataConfiguration, Registry<LevelStem> levelStemRegistry, Lifecycle lifecycle, CallbackInfoReturnable<@Nullable Pair<WorldData, WorldDimensions.Complete>> cir) {
            GachaServer.currentDir = levelDirectory.path();
            GachaServer.loadData();
        }

        @Inject(at = @At("HEAD"), method = "saveDataTag(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/world/level/storage/WorldData;Lnet/minecraft/nbt/CompoundTag;)V")
        public void onSaveDataTag(RegistryAccess registries, WorldData serverConfiguration, CompoundTag hostPlayerNBT, CallbackInfo ci) {
            GachaServer.currentDir = levelDirectory.path();
            GachaServer.saveData();
        }
    }
}
