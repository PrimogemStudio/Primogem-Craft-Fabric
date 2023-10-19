package com.primogemstudio.primogemcraft.gacha;

import com.google.gson.Gson;
import com.primogemstudio.primogemcraft.gacha.serialize.TestData;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtIo;

import java.io.*;
import java.nio.file.Path;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;
import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static Path currentDir;

    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(GACHA_TRIGGER, (server, player, handler, buf, responseSender) -> {
            LOGGER.warn(buf.readNbt());
        });
    }

    public static void loadData() {
        LOGGER.info("Data reading!");
    }

    public static void saveData() {
        LOGGER.info("Data saving!");
    }

    public static void onDataChange() {
        saveData();
    }
}
