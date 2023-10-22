package com.primogemstudio.primogemcraft.gacha;

import com.primogemstudio.primogemcraft.database.GachaDatabase;
import com.primogemstudio.primogemcraft.gacha.packets.client.GachaTriggerClientPacket;
import com.primogemstudio.primogemcraft.gacha.serialize.GachaRecordModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;

import java.util.Random;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;

public class GachaServer {
    public static GachaDatabase database;
    private static GachaRecordModel.DataModel data = new GachaRecordModel.DataModel();

    private enum GachaProtocols {
        PROTOCOL_VER_0 {
            @Override
            public Long parse(CompoundTag tag) {
                long timest = tag.getLong("timestamp") / 3 + tag.getLong("mem_free") / 3 + tag.getLong("timestamp_nano") / 3;
                return new Random((long) (timest * new Random().nextDouble(-1, 1))).nextLong();
            }
        }, PROTOCOL_ALL {
            @Override
            public Long parse(CompoundTag tag) {
                return switch (tag.getInt("gacha_protocol_version")) {
                    case 0 -> PROTOCOL_VER_0.parse(tag);
                    default -> super.parse(tag);
                };
            }
        };

        public Long parse(CompoundTag tag) {
            return new Random().nextLong();
        }
    }

    public static void init() {
        GachaTriggerClientPacket.register((server, player, handler, buf, responseSender) -> {
            var nbtdata = buf.readNbt();
            server.execute(() -> triggered(nbtdata, player));
        });
    }

    private static void triggered(CompoundTag nbtdata, ServerPlayer player) {
        int level = 3;
        var star5pity = data.pity_5.increasePity(player.getGameProfile());
        var star4pity = data.pity_4.increasePity(player.getGameProfile());

        if (star5pity) {
            level = 5;
        } else if (star4pity) {
            level = 4;
        } else {
            var profed = data.pity_5.getPity(player.getGameProfile());
            var profed4 = data.pity_4.getPity(player.getGameProfile());
            double star5stacked = Math.min(1, profed <= 73 ? 0.006 : 0.006 + (profed - 73) * 0.06);
            double star4stacked = Math.min(1, profed4 <= 8 ? 0.051 : 0.051 + (profed4 - 8) * 0.51);
            double genNum = new Random(GachaProtocols.PROTOCOL_ALL.parse(nbtdata)).nextDouble(0, 1);
            if (genNum < star5stacked) {
                level = 5;
                data.pity_5.resetPity(player.getGameProfile());
            } else if (genNum < star4stacked) {
                level = 4;
                data.pity_4.resetPity(player.getGameProfile());
            }
        }
        var gac = new GachaRecordModel();
        gac.name = player.getGameProfile().getName();
        gac.uuid = player.getGameProfile().getId();
        gac.timestamp = System.currentTimeMillis();
        gac.level = level;
        // gac.item = BuiltInRegistries.ITEM.getKey(Items.STONE_SWORD);
        data.gachaRecord.add(gac);
        onDataChange();

        LOGGER.info("level: " + level);
    }

    public static void loadData() {
        try {
            data = database.read();
            LOGGER.info("Data read!");
        }
        catch (Exception e) {
            LOGGER.error("read failed", e);
        }
        finally {
            if (data == null) data = new GachaRecordModel.DataModel();
        }
    }

    public static void saveData() {
        try {
            database.stageChanges(data);
            // database.write(data);
            LOGGER.info("Data saved!");
        } catch (Exception e) {
            LOGGER.error("write failed", e);
        }
    }

    public static void onDataChange() {
        saveData();
    }
}
