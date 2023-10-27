package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class HakushinLullabyItem extends RecordItem {
    public HakushinLullabyItem() {
        super(15, PrimogemCraftSounds.HAKUSHIN_LULLABY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 128);
    }
}
