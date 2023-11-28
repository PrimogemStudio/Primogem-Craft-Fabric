package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class BalladofManyWatersRecordItem extends RecordItem {
    public BalladofManyWatersRecordItem() {
        super(4, PrimogemCraftSounds.BALLAD_OF_MANY_WATERS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 124);
    }
}