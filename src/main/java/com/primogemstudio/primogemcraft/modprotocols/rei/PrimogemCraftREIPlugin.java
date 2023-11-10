package com.primogemstudio.primogemcraft.modprotocols.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.io.IOException;
import java.util.ArrayList;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.util.LootTableLoader.load;

public class PrimogemCraftREIPlugin implements REIClientPlugin {
    static final CategoryIdentifier<WishDisplay> WISH = CategoryIdentifier.of(MOD_ID, "wish");

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new WishCategory());
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        var hashset = new ArrayList<String>();
        try {
            hashset.addAll(load("star5"));
            hashset.addAll(load("star4"));
            hashset.addAll(load("star3"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        hashset.stream().distinct().map(a -> BuiltInRegistries.ITEM.get(new ResourceLocation(a))).map(ItemStack::new).forEach(a -> registry.add(new WishDisplay(a)));
    }
}
