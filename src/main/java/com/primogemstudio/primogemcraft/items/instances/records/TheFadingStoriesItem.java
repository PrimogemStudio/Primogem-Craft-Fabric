package com.primogemstudio.primogemcraft.items.instances.records;

import com.primogemstudio.primogemcraft.sounds.PrimogemCraftSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class TheFadingStoriesItem extends RecordItem {
    public TheFadingStoriesItem() {
        super(15, PrimogemCraftSounds.THE_FADING_STORIES, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 129);
    }
}
