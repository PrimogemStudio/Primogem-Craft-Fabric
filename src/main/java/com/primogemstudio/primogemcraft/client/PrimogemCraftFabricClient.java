package com.primogemstudio.primogemcraft.client;

import com.primogemstudio.primogemcraft.entities.PrimogemCraftEntityRenderers;
import com.primogemstudio.primogemcraft.gacha.GachaClient;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.Minecraft;

import static net.minecraft.commands.Commands.literal;


public class PrimogemCraftFabricClient implements ClientModInitializer {
    public void onInitializeClient() {
        PrimogemCraftEntityRenderers.init();
        GachaClient.init();
    }
}
