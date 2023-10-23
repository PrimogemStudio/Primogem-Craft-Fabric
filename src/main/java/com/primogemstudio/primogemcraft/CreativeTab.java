package com.primogemstudio.primogemcraft;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;
import static com.primogemstudio.primogemcraft.items.PrimogemCraftItems.*;

public class CreativeTab {
    public static final ResourceKey<CreativeModeTab> KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_blocks_tab"));
    public static final ResourceKey<CreativeModeTab> KEY_TOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "primogemcraft_tools_tab"));
    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft")).icon(() -> new ItemStack(PRIMOGEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(THE_ALL_BEGINNING);
            output.accept(PRIMOGEM);
            output.accept(INTERTWINED_FATE);
            output.accept(VAYUDA_TURQUOISE_GEMSTONE);
        }).build());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_BLOCKS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_blocks")).icon(() -> new ItemStack(PRIMOGEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(PRIMOGEM_BLOCK_ITEM);
            output.accept(DENDRO_CORE_BLOCK_ITEM);
        }).build());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, KEY_TOOLS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable("itemGroup.primogemcraft_weapon_tools")).icon(() -> new ItemStack(PRIMOGEM)).displayItems((itemDisplayParameters, output) -> {
            output.accept(DENDRO_PICKAXE);
        }).build());
    }
}
