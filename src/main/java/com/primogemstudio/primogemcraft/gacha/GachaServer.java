package com.primogemstudio.primogemcraft.gacha;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(
                GACHA_TRIGGER,
                (server, player, handler, buf, responseSender) -> {

                }
        );
    }
}
