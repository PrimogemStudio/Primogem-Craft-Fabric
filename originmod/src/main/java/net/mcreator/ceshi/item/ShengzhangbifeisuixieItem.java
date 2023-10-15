
package net.mcreator.ceshi.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.ceshi.init.PrimogemcraftModTabs;

public class ShengzhangbifeisuixieItem extends Item {
	public ShengzhangbifeisuixieItem() {
		super(new Item.Properties().tab(PrimogemcraftModTabs.TAB_YUANSHIGONGJUXUANXIANGKA).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
