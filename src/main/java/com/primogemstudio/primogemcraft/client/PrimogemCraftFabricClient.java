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
        GachaClient.init();
        PrimogemCraftEntityRenderers.init();
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("playsound_test").executes(context -> {
            if (Minecraft.getInstance().player != null) {
                Minecraft.getInstance().player.playSound(PrimogemCraftSounds.A_NEW_DAY_WITH_HOPE_RECORD);
            }
            return 0;
        })));
    }
}
