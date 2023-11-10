package com.primogemstudio.primogemcraft.mixin;

import com.primogemstudio.primogemcraft.util.Events;
import net.minecraft.network.Connection;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerList.class)
public class PlayerListMixin {
    @Inject(at = @At("RETURN"), method = "placeNewPlayer")
    public void onPlaceNewPlayer(Connection netManager, ServerPlayer player, CallbackInfo ci) {
        Events.ON_PLAYER_JOIN.invoker().onConnect(netManager, player);
    }
}
