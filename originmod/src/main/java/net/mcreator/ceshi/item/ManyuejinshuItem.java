
package net.mcreator.ceshi.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

public class ManyuejinshuItem extends Item {
	public ManyuejinshuItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_ZHENGHUO).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
