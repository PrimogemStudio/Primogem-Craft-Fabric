package com.primogemstudio.primogemcraft.gacha.serialize;

import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.UUID;

public class GachaRecordModel {
    public String name;
    public UUID uuid;
    public int level;
    public ResourceLocation item;
    public long timestamp;
    public static class RecordList extends ArrayList<GachaRecordModel> {}
}
