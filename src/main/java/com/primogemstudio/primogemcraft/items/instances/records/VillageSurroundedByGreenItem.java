package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class VillageSurroundedByGreenItem extends RecordItem {
    public VillageSurroundedByGreenItem() {
        super(15, PrimogemCraftSounds.VILLAGE_SURROUNDED_BY_GREEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 152);
    }
}
