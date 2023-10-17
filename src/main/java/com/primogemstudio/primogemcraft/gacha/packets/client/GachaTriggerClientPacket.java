package com.primogemstudio.primogemcraft.gacha.packets.client;

import io.netty.buffer.ByteBuf;
import net.fabricmc.fabric.api.networking.v1.FabricPacket;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;

import java.util.Random;
import java.util.function.Function;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaTriggerClientPacket extends ServerboundCustomPayloadPacket implements FabricPacket {
    private static CompoundTag createGachaSeed() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("gacha_protocol_version", 0);
        tag.putLong("timestamp", System.currentTimeMillis());
        tag.putLong("timestamp_nano", System.nanoTime());
        tag.putLong("mem_free", Runtime.getRuntime().freeMemory());
        tag.putLongArray("randlongs", new Random().longs().limit(64).toArray());
        tag.putIntArray("randints", new Random().ints().limit(64).toArray());
        return tag;
    }
    public GachaTriggerClientPacket() {
        super(GACHA_TRIGGER, PacketByteBufs.create());
    }

    public PacketType<GachaTriggerClientPacket> getType() {
        return PacketType.create(GACHA_TRIGGER, a -> new GachaTriggerClientPacket());
    }

    @Override
    public void write(FriendlyByteBuf buffer) {
        buffer.writeNbt(createGachaSeed());
    }
}
