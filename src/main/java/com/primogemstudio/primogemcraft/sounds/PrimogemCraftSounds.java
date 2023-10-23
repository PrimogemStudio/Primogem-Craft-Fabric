package com.primogemstudio.primogemcraft.sounds;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftSounds {
    public static final SoundEvent PRE_GACHA = register("pre_gacha", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "pre_gacha")));
    public static final SoundEvent A_NEW_DAY_WITH_HOPE_RECORD = register("a_new_day_with_hope", SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "music_disc.a_new_day_with_hope")));

    public static <T extends SoundEvent> T register(String name, T event) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(MOD_ID, name), event);
    }
}
