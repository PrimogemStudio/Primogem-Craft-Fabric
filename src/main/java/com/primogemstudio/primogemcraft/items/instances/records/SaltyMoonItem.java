package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class SaltyMoonItem extends RecordItem {
    public SaltyMoonItem() {
        super(15, PrimogemCraftSounds.SALTY_MOON, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 43);
    }
}
