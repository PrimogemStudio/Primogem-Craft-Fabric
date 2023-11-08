package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MasterLessStarDustItem extends Item {
    public MasterLessStarDustItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
