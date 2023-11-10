package com.primogemstudio.primogemcraft.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class LootTableLoader {
    public static ArrayList<String> load(String id) throws IOException {
        var lis = new ArrayList<String>();
        var rm = Objects.requireNonNull(Minecraft.getInstance().getSingleplayerServer()).getResourceManager();
        var res = rm.getResourceOrThrow(new ResourceLocation(MOD_ID, "loot_tables/gacha/" + id + ".json"));
        var root = new Gson().fromJson(res.openAsReader(), JsonObject.class);
        root.getAsJsonArray("pools").forEach(pool -> pool.getAsJsonObject().getAsJsonArray("entries").forEach(e -> lis.add(e.getAsJsonObject().get("name").getAsString())));
        return lis;
    }
}
