package com.primogemstudio.primogemcraft.gacha;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.primogemstudio.primogemcraft.gacha.serialize.GachaRecordModel;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;
import static com.primogemstudio.primogemcraft.gacha.GachaNetworkConstants.GACHA_TRIGGER;

public class GachaServer {
    public static Path currentDir;
    private static final Gson parser = new GsonBuilder()
            .registerTypeAdapter(ResourceLocation.class, new TypeAdapter<ResourceLocation>() {
                public void write(JsonWriter jsonWriter, ResourceLocation resourceLocation) throws IOException {
                    jsonWriter.value(resourceLocation.toString());
                }

                public ResourceLocation read(JsonReader jsonReader) throws IOException {
                    return new ResourceLocation(jsonReader.nextString());
                }
            })
            .registerTypeAdapter(UUID.class, new TypeAdapter<UUID>() {
                public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                    jsonWriter.value(uuid.toString());
                }

                public UUID read(JsonReader jsonReader) throws IOException {
                    return UUID.fromString(jsonReader.nextString());
                }
            })
            .create();
    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(GACHA_TRIGGER, (server, player, handler, buf, responseSender) -> LOGGER.warn(buf.readNbt()));
    }

    public static void loadData() {
        var file = currentDir.resolve("2.json").toFile();
        if (file.exists()) {
            try (var fr = new FileReader(file)) {
                var data = parser.fromJson(fr, GachaRecordModel.RecordList.class);
                LOGGER.info("Data read!");
                LOGGER.error(data);
            } catch (IOException e) {
                LOGGER.error("read failed", e);
            }
        }
    }

    public static void saveData() {
        var file = currentDir.resolve("2.json").toFile();
        try (var fo = new FileOutputStream(file)) {
            var list = new GachaRecordModel.RecordList();
            var data = new GachaRecordModel();
            data.uuid = UUID.randomUUID();
            data.level = 3;
            data.name = "Coder2";
            data.item = BuiltInRegistries.ITEM.getKey(Items.STONE_SWORD);
            list.add(data);
            fo.write(parser.toJson(list).getBytes());
            LOGGER.info("Data saved!");
        } catch (IOException e) {
            LOGGER.error("write failed", e);
        }
    }

    public static void onDataChange() {
        saveData();
    }
}
