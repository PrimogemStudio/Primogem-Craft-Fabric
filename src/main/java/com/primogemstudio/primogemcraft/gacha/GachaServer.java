package com.primogemstudio.primogemcraft.gacha;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.mixin.registry.sync.LevelStorageSessionMixin;
import net.minecraft.nbt.NbtAccounter;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.LevelStorageSource;

import java.util.Arrays;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(
                GACHA_TRIGGER,
                (server, player, handler, buf, responseSender) -> {
                    System.out.println(buf.readResourceLocation());
                    System.out.println(buf.readNbt());
                }
        );
    }

    public static void loadData() {

    }
    public static void saveData() {

    }
}
