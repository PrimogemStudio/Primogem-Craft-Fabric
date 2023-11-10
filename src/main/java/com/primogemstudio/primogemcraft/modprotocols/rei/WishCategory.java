package com.primogemstudio.primogemcraft.modprotocols.rei;

import com.google.common.collect.Lists;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.network.chat.Component;

import java.util.List;

import static com.primogemstudio.primogemcraft.modprotocols.rei.PrimogemCraftREIPlugin.WISH;

public class WishCategory implements DisplayCategory<WishDisplay> {
    @Override
    public CategoryIdentifier<? extends WishDisplay> getCategoryIdentifier() {
        return WISH;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("rei.primogemcraft.category.wish");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(PrimogemCraftItems.INTERTWINED_FATE);
    }

    @Override
    public int getDisplayHeight() {
        return 36;
    }

    @Override
    public List<Widget> setupDisplay(WishDisplay display, Rectangle bounds) {
        var widgets = Lists.<Widget>newArrayList();
        var sp = new Point(bounds.getCenterX() - 31, bounds.getCenterY() - 13);
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createArrow(new Point(sp.x + 23, sp.y + 4)));
        widgets.add(Widgets.createResultSlotBackground(new Point(sp.x + 57, sp.y + 5)));
        widgets.add(Widgets.createSlot(new Point(sp.x, sp.y + 5)).entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(sp.x + 57, sp.y + 5)).entries(display.getOutputEntries().get(0)).disableBackground().markOutput());
        return widgets;
    }
}
