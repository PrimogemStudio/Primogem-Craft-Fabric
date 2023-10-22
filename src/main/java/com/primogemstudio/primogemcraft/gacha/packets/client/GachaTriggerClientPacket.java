package com.primogemstudio.primogemcraft.gacha.packets.client;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;
import net.minecraft.world.phys.Vec3;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaTriggerClientPacket {
    public static void send() {
        send(new Vec3(0, 220, 0));
    }
    public static void send(Vec3 vec3) {
        ClientPlayNetworking.send(GACHA_TRIGGER, PacketByteBufs.create().writeNbt(createGachaSeed()).writeBlockPos(BlockPos.containing(vec3)));
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
