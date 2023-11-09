package com.primogemstudio.primogemcraft.mixin;

import net.minecraft.network.Connection;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

@Mixin(PlayerList.class)
public class PlayerListMixin {
    @Inject(at = @At("RETURN"), method = "placeNewPlayer")
    public void onPlaceNewPlayer(Connection netManager, ServerPlayer player, CallbackInfo ci) {
        var root = player.server.getAdvancements().getAdvancement(new ResourceLocation(MOD_ID, MOD_ID));
        var progress = player.getAdvancements().getOrStartProgress(root);
        progress.getRemainingCriteria().forEach(c -> player.getAdvancements().award(root, c));
    }
}
