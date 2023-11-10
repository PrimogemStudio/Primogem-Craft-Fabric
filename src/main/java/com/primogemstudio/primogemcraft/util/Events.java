package com.primogemstudio.primogemcraft.util;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.network.Connection;
import net.minecraft.server.level.ServerPlayer;

public class Events {
    public static final Event<NewPlayerJoinEvent> ON_PLAYER_JOIN = EventFactory.createArrayBacked(NewPlayerJoinEvent.class, arr -> (netManager, player) -> {
        for (var event : arr) event.onConnect(netManager, player);
    });
    public interface NewPlayerJoinEvent {
        void onConnect(Connection netManager, ServerPlayer player);
    }
}
