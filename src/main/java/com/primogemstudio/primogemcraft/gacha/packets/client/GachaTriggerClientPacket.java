package com.primogemstudio.primogemcraft.gacha.packets.client;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaTriggerClientPacket {
    public static void send() {
        ClientPlayNetworking.send(GACHA_TRIGGER, PacketByteBufs.create().writeNbt(createGachaSeed()));
    }
    public static void register(ServerPlayNetworking.PlayChannelHandler handler) {
        ServerPlayNetworking.registerGlobalReceiver(GACHA_TRIGGER, handler);
    }
    private static CompoundTag createGachaSeed() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("gacha_protocol_version", 0);
        tag.putLong("timestamp", System.currentTimeMillis());
        tag.putLong("timestamp_nano", System.nanoTime());
        tag.putLong("mem_free", Runtime.getRuntime().freeMemory());
        return tag;
    }
}
