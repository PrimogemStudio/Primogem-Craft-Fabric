package com.primogemstudio.primogemcraft.gacha;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.primogemstudio.primogemcraft.gacha.serialize.GachaRecordModel;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;
import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static Path currentDir;
    private static GachaRecordModel.DataModel data = new GachaRecordModel.DataModel();
    static {
        data.gachaRecord = new GachaRecordModel.RecordList();
        var gac = new GachaRecordModel();
        gac.name = "Coder2";
        gac.uuid = UUID.randomUUID();
        gac.timestamp = System.currentTimeMillis();
        gac.level = 3;
        gac.item = BuiltInRegistries.ITEM.getKey(Items.STONE_SWORD);
        data.gachaRecord.add(gac);
    }
    private enum GachaProtocols {
        PROTOCOL_VER_0 {
            @Override
            public Long parse(CompoundTag tag) {
                long timest = tag.getLong("timestamp") / 3 + tag.getLong("mem_free") / 3 + tag.getLong("timestamp_nano") / 3;
                return new Random((long) (timest * new Random().nextDouble(-1, 1))).nextLong();
            }
        },
        PROTOCOL_ALL {
            @Override
            public Long parse(CompoundTag tag) {
                switch (tag.getInt("gacha_protocol_version")) {
                    case 0:
                        System.out.println(tag);
                        return PROTOCOL_VER_0.parse(tag);
                    default:
                        return super.parse(tag);
                }
            }
        };
        public Long parse(CompoundTag tag) {
            return new Random().nextLong();
        }
    }
    private static final Gson parser = new GsonBuilder().registerTypeAdapter(ResourceLocation.class, new TypeAdapter<ResourceLocation>() {
        public void write(JsonWriter jsonWriter, ResourceLocation resourceLocation) throws IOException {
            jsonWriter.value(resourceLocation.toString());
        }

        public ResourceLocation read(JsonReader jsonReader) throws IOException {
            return new ResourceLocation(jsonReader.nextString());
        }
    }).registerTypeAdapter(UUID.class, new TypeAdapter<UUID>() {
        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid.toString());
        }

        public UUID read(JsonReader jsonReader) throws IOException {
            return UUID.fromString(jsonReader.nextString());
        }
    }).create();

    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(GACHA_TRIGGER, (server, player, handler, buf, responseSender) -> {
            double genNum = new Random(GachaProtocols.PROTOCOL_ALL.parse(buf.readNbt())).nextDouble(0, 1);
            System.out.println(genNum);
        });
    }


    public static void loadData() {
        var file = currentDir.resolve("gacha_data.json").toFile();
        if (file.exists()) {
            try (var fr = new FileReader(file)) {
                data = parser.fromJson(fr, GachaRecordModel.DataModel.class);
                LOGGER.info("Data read!");
            } catch (IOException e) {
                LOGGER.error("read failed", e);
            }
        }
    }

    public static void saveData() {
        var file = currentDir.resolve("gacha_data.json").toFile();
        try (var fo = new FileOutputStream(file)) {
            fo.write(parser.toJson(data).getBytes());
            LOGGER.info("Data saved!");
        } catch (IOException e) {
            LOGGER.error("write failed", e);
        }
    }

    public static void onDataChange() {
        saveData();
    }
}
