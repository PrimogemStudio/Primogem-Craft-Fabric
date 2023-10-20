package com.primogemstudio.primogemcraft.gacha.serialize;

import net.minecraft.resources.ResourceLocation;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class GachaRecordModel implements Serializable {
    @Serial
    private static final long serialVersionUID = -6849794470754667721L;
    public String name;
    public UUID uuid;
    public int level;
    public ResourceLocation item;
    public long timestamp;
    public static class RecordList extends ArrayList<GachaRecordModel> implements Serializable {
        @Serial
        private static final long serialVersionUID = -6849794470754667723L;
    }
    public static class DataModel implements Serializable {
        @Serial
        private static final long serialVersionUID = -6849794470754667724L;
        public Map<UUID, Integer> pity_5;
        public Map<UUID, Integer> pity_4;
        public RecordList gachaRecord;
    }
}
