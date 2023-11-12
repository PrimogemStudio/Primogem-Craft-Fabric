package com.primogemstudio.primogemcraft.modprotocols.rei;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.world.item.ItemStack;

import java.util.List;

import static com.primogemstudio.primogemcraft.modprotocols.rei.PrimogemCraftREIPlugin.WISH;

public class WishDisplay extends BasicDisplay {
    public WishDisplay(ItemStack output, boolean isFiveStar) {
        super(List.of(
                isFiveStar ? EntryIngredient.of(
                        EntryStacks.of(PrimogemCraftItems.INTERTWINED_FATE),
                        EntryStacks.of(PrimogemCraftItems.INTERTWINED_FATE_TEN)
                ) : EntryIngredient.of(
                        EntryStacks.of(PrimogemCraftItems.INTERTWINED_FATE),
                        EntryStacks.of(PrimogemCraftItems.INTERTWINED_FATE_TEN),
                        EntryStacks.of(PrimogemCraftItems.ACQUAINT_FATE)
                )
        ), List.of(EntryIngredient.of(EntryStacks.of(output))));
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return WISH;
    }
}