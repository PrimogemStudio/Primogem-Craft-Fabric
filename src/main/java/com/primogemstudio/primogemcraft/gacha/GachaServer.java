package com.primogemstudio.primogemcraft.gacha;

import com.google.gson.Gson;
import com.primogemstudio.primogemcraft.gacha.serialize.TestData;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

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
        var file = currentDir.resolve("1.json").toFile();
        if (file.exists()) {
            var gson = new Gson();
            try (var fr = new FileReader(file)) {
                var data = gson.fromJson(fr, TestData.class);
                LOGGER.info("Data read!");
                LOGGER.error(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void saveData() {
        var file = currentDir.resolve("1.json").toFile();
        var gson = new Gson();
        try (var fo = new FileOutputStream(file)) {
            var data = new TestData("abc", 10);
            data.inner = new TestData.Inner();
            data.inner.num = 0.1231234f;
            data.inner.array = new int[]{5, 66, 7, 8, 9, 1, 2, 3};
            fo.write(gson.toJson(data).getBytes());
            LOGGER.info("Data saved!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void onDataChange() {
        saveData();
    }
}
