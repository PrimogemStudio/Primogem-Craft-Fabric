package com.primogemstudio.primogemcraft.items.instances;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MasterLessStargLitterItem extends Item {
    public MasterLessStargLitterItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
    }
}
