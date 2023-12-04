package com.primogemstudio.primogemcraft.gacha;

import com.primogemstudio.primogemcraft.advancements.PrimogemCraftAdvancements;
import com.primogemstudio.primogemcraft.database.GachaDatabase;
import com.primogemstudio.primogemcraft.entities.instances.entities.GachaFiveStarEntity;
import com.primogemstudio.primogemcraft.entities.instances.entities.GachaFourStarEntity;
import com.primogemstudio.primogemcraft.entities.instances.entities.GachaThreeStarEntity;
import com.primogemstudio.primogemcraft.gacha.serialize.GachaRecordModel;
import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.LOGGER;
import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.entities.PrimogemCraftEntities.*;

public class GachaServer {
    public static GachaDatabase database;
    public static GachaRecordModel.DataModel data = new GachaRecordModel.DataModel();

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

    private static CompoundTag createGachaSeed() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("gacha_protocol_version", 0);
        tag.putLong("timestamp", System.currentTimeMillis());
        tag.putLong("timestamp_nano", System.nanoTime());
        tag.putLong("mem_free", Runtime.getRuntime().freeMemory());
        return tag;
    }
    public static void triggered(ServerPlayer player, BlockPos pos) {
        triggered(player, pos, true);
    }
    public static void triggered(ServerPlayer player, BlockPos pos, boolean has5star) {
        var nbt = createGachaSeed();
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
            double genNum = new Random(GachaProtocols.PROTOCOL_ALL.parse(nbt)).nextDouble(0, 1);
            if (genNum < star5stacked) {
                level = 5;
                data.pity_5.resetPity(player.getGameProfile());
            } else if (genNum < star4stacked) {
                level = 4;
                data.pity_4.resetPity(player.getGameProfile());
            }
        }
        if (!has5star) level = 4;
        var li = switch (level) {
            case 4 -> new GachaFourStarEntity(PURPLE_LIGHT, player.level());
            case 5 -> new GachaFiveStarEntity(GOLDEN_LIGHT, player.level());
            default -> new GachaThreeStarEntity(BLUE_LIGHT, player.level());
        };
        li.setPos(new Vec3(pos.getX(), pos.getY(), pos.getZ()));
        player.level().addFreshEntity(li);

        AtomicReference<ResourceLocation> it = new AtomicReference<>();
        player.getServer().getLootData().getLootTable(new ResourceLocation(MOD_ID, switch (level) {
            case 5 -> "gacha/star5";
            case 4 -> "gacha/star4";
            default -> "gacha/star3";
        })).getRandomItems(
                new LootParams.Builder(player.serverLevel())
                        .withParameter(LootContextParams.THIS_ENTITY, player)
                        .withParameter(LootContextParams.DAMAGE_SOURCE, player.damageSources().fall())
                        .withParameter(LootContextParams.ORIGIN, player.position())
                        .create(LootContextParamSets.ENTITY)
        ).forEach(a -> {
            if (it.get() == null) it.set(BuiltInRegistries.ITEM.getKey(a.getItem()));
            player.level().addFreshEntity(new ItemEntity(player.level(), pos.getX(), pos.getY(), pos.getZ(), a));
        });

        if (level == 5) PrimogemCraftAdvancements.GACHA_FIVE_STAR_TRIGGERED.trigger(player);
        player.serverLevel().playSound(player, pos, switch (level) {
            case 4 -> PrimogemCraftSounds.GACHA_4STAR;
            case 5 -> PrimogemCraftSounds.GACHA_5STAR;
            default -> PrimogemCraftSounds.GACHA_3STAR;
        }, SoundSource.PLAYERS);

        var gac = new GachaRecordModel();
        gac.name = player.getGameProfile().getName();
        gac.uuid = player.getGameProfile().getId();
        gac.timestamp = System.currentTimeMillis();
        gac.level = level;
        gac.item = it.get();
        data.gachaRecord.add(gac);
        onDataChange();
    }

    public static void loadData() {
        try {
            if (database != null) data = database.read();
        } catch (Exception e) {
            LOGGER.error("read failed: ", e);
        } finally {
            if (data == null) data = new GachaRecordModel.DataModel();
        }
    }

    public static void saveData() {
        try {
            if (database != null) database.stageChanges(data);
        } catch (Exception e) {
            LOGGER.error("write failed: ", e);
        }
    }

    public static void onDataChange() {
        saveData();
    }
}
