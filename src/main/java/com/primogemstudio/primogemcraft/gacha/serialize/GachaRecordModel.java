package com.primogemstudio.primogemcraft.gacha.serialize;

import com.mojang.authlib.GameProfile;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class GachaRecordModel {
    public String name;
    public UUID uuid;
    public int level;
    public ResourceLocation item;
    public long timestamp;
    public static class RecordList extends ArrayList<GachaRecordModel> {}
    public static class PityMap extends HashMap<UUID, Integer> {
        private final int pityMax;
        public PityMap(int pityMax) {
            this.pityMax = pityMax;
        }
        public int getPity(GameProfile profile) {
            if (!containsKey(profile.getId())) {
                resetPity(profile);
                return 1;
            }
            else return get(profile.getId());
        }

        public boolean increasePity(GameProfile profile) {
            put(profile.getId(), getPity(profile) + 1);
            if (getPity(profile) > pityMax) {
                resetPity(profile);
                return true;
            }
            return false;
        }

        public void resetPity(GameProfile profile) {
            put(profile.getId(), 1);
        }
    }
    public static class PityMap5Star extends PityMap {

        public PityMap5Star() {
            super(90);
        }
    }
    public static class PityMap4Star extends PityMap {

        public PityMap4Star() {
            super(10);
        }
    }
    public static class DataModel {
        public PityMap5Star pity_5 = new PityMap5Star();
        public PityMap4Star pity_4 = new PityMap4Star();
        public RecordList gachaRecord;
    }
}
