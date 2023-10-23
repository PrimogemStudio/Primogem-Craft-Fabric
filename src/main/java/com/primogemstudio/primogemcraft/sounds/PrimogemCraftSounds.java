package com.primogemstudio.primogemcraft.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftSounds {
    public static SoundEvent PRE_GACHA;
    public static void init() {
        PRE_GACHA = SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "pre_gacha"));
    }
}
