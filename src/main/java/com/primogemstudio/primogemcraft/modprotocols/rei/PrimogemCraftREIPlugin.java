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
        try {
            var nonstar5 = new ArrayList<String>();
            var star5 = load("star5");
            nonstar5.addAll(load("star4"));
            nonstar5.addAll(load("star3"));
            nonstar5.stream()
                    .distinct()
                    .map(a -> BuiltInRegistries.ITEM.get(new ResourceLocation(a)))
                    .map(ItemStack::new)
                    .forEach(a -> registry.add(new WishDisplay(a, false)));

            star5.removeAll(nonstar5.stream().distinct().toList());
            star5.stream()
                    .map(a -> BuiltInRegistries.ITEM.get(new ResourceLocation(a)))
                    .map(ItemStack::new)
                    .forEach(a -> registry.add(new WishDisplay(a, true)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
