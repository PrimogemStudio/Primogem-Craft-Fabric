package com.primogemstudio.primogemcraft.client;

import com.primogemstudio.primogemcraft.gacha.GachaClient;
import com.primogemstudio.primogemcraft.gacha.packets.client.GachaTriggerClientPacket;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import static net.minecraft.commands.Commands.literal;


public class PrimogemCraftFabricClient implements ClientModInitializer {
    public void onInitializeClient() {
        GachaClient.init();
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("primogem_craft_gacha_test").executes(context -> {
            ClientPlayNetworking.send(new GachaTriggerClientPacket());
            Minecraft.getInstance().gui.getChat().addMessage(Component.literal("祈愿数据包已发送"));
            return 0;
        })));
    }
}
