
package net.mcreator.ceshi.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;
import net.mcreator.ceshi.init.PrimogemcraftModSounds;

public class Ccangruimilinjian014Item extends RecordItem {
	public Ccangruimilinjian014Item() {
		super(0, PrimogemcraftModSounds.REGISTRY.get(new ResourceLocation("primogemcraft:xumimolazhuang")), new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(1).rarity(Rarity.RARE));
	}
}
