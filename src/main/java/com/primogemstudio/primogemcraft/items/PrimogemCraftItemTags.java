package com.primogemstudio.primogemcraft.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftItemTags {
    public static final TagKey<Item> ELEMENT_IRON = createItemTagKey("element_iron");
    public static final TagKey<Item> ELEMENT_DIAMOND = createItemTagKey("element_diamond");
    public static final TagKey<Item> ELEMENT_NETHERITE = createItemTagKey("element_netherite");
    public static final TagKey<Item> VAJRADA_AMETHYST_SWORDS = createItemTagKey("vajrada_amethyst_swords");

    private static TagKey<Item> createItemTagKey(String id) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, id));
    }
}
