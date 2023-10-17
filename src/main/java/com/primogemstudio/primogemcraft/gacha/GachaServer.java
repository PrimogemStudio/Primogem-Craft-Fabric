package com.primogemstudio.primogemcraft.gacha;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.CompoundTag;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;
import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(
                GACHA_TRIGGER,
                (server, player, handler, buf, responseSender) -> {
                    System.out.println(buf.readNbt());
                }
        );
    }

    public static CompoundTag loadData(CompoundTag data) {
        LOGGER.info("Data reading!");
        var test = data.getInt("TestData");
        LOGGER.info("TestData is: " + test);
        return data;
    }

    public static void saveData(CompoundTag data) {
        data.putInt("TestData", 32768);
        LOGGER.info("Data saving!");
    }
}
