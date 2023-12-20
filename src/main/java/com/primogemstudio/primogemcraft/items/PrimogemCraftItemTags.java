package com.primogemstudio.primogemcraft.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class PrimogemCraftItemTags {
    public static final TagKey<Item> ELEMENT_IRON = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_iron"));
    public static final TagKey<Item> ELEMENT_DIAMOND = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_diamond"));
    public static final TagKey<Item> ELEMENT_NETHERITE = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "element_netherite"));
}
