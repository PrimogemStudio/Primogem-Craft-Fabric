package com.primogemstudio.primogemcraft.effects;

import com.primogemstudio.primogemcraft.effects.instances.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftMobEffects {
    public static final AbnormalDiseaseMobEffect ABNORMAL_DISEASE = register("abnormal_disease", new AbnormalDiseaseMobEffect());
    public static final PastMobEffect PAST = register("past", new PastMobEffect());
    public static final AmulateMobEffect AMULATE = register("amulate", new AmulateMobEffect());
    public static final AThousandNightsDawnsongMobEffect DAWNSONG = register("a_thousand_nights_dawnsong", new AThousandNightsDawnsongMobEffect());
    public static final AThousandNightsDawnsongCooldownMobEffect DAWNSONG_COOLDOWN = register("a_thousand_nights_dawnsong_cooldown", new AThousandNightsDawnsongCooldownMobEffect());
    public static final BurnMobEffect BURN = register("burn", new BurnMobEffect());
    public static void init() {
    }

    public static <T extends MobEffect> T register(String id, T effect) {
        return Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(MOD_ID, id), effect);
    }
}
