package com.primogemstudio.primogemcraft.effects;

import com.primogemstudio.primogemcraft.effects.instances.AbnormalDiseaseMobEffect;
import com.primogemstudio.primogemcraft.effects.instances.PastMobEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftMobEffects {
    public static final AbnormalDiseaseMobEffect ABNORMAL_DISEASE = register("abnormal_disease", new AbnormalDiseaseMobEffect());
    public static final PastMobEffect PAST = register("past", new PastMobEffect());

    public static void init() {
    }

    public static <T extends MobEffect> T register(String id, T effect) {
        return Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(MOD_ID, id), effect);
    }
}
