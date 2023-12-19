package com.primogemstudio.primogemcraft.modprotocols.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import net.minecraft.network.chat.Component;

public class PrimogemCraftModMenuCompat implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return a -> {
            var bld = ConfigBuilder.create().setParentScreen(a).setTransparentBackground(true)
                    .setTitle(Component.translatable("itemGroup.primogemcraft"));
            bld.getOrCreateCategory(Component.translatable("itemGroup.primogemcraft"));
            return bld.build();
        };
    }
}
