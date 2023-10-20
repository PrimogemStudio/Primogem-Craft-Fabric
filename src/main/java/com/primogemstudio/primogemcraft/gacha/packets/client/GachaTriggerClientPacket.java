package com.primogemstudio.primogemcraft.gacha.packets.client;

import net.fabricmc.fabric.api.networking.v1.FabricPacket;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;

import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaTriggerClientPacket extends ServerboundCustomPayloadPacket implements FabricPacket {
    private static CompoundTag createGachaSeed() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("gacha_protocol_version", 0);
        tag.putLong("timestamp", System.currentTimeMillis());
        tag.putLong("timestamp_nano", System.nanoTime());
        tag.putLong("mem_free", Runtime.getRuntime().freeMemory());
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
