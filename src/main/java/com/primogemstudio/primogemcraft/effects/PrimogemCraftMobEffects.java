package com.primogemstudio.primogemcraft.effects;

import com.primogemstudio.primogemcraft.effects.instances.SpecialHurtMobEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftMobEffects {
    public static final SpecialHurtMobEffect SPECIAL_HURT = register("special_hurt", new SpecialHurtMobEffect());
    public static <T extends MobEffect> T register(String id, T effect) {
        return Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(MOD_ID, id), effect);
    }
}
