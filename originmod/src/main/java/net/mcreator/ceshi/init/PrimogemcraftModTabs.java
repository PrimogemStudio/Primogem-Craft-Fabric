
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PrimogemcraftModTabs {
	public static CreativeModeTab TAB_ZHENGHUO;
	public static CreativeModeTab TAB_YUANSHIGONGJUXUANXIANGKA;
	public static CreativeModeTab TAB_YUANSHIFANGKUAIKA;

	public static void load() {
		TAB_ZHENGHUO = new CreativeModeTab("tabzhenghuo") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PrimogemcraftModItems.YUANSHI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_YUANSHIGONGJUXUANXIANGKA = new CreativeModeTab("tabyuanshigongjuxuanxiangka") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PrimogemcraftModItems.WUFENGJIAN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_YUANSHIFANGKUAIKA = new CreativeModeTab("tabyuanshifangkuaika") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PrimogemcraftModBlocks.YUANSHIKUANGSHI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
