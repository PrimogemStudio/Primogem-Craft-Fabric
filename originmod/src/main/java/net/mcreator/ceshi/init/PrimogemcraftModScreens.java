
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ceshi.client.gui.ZhangquanzhezhinangguiScreen;
import net.mcreator.ceshi.client.gui.YibangrenzhinangguiScreen;
import net.mcreator.ceshi.client.gui.SuijiqiwuScreen;
import net.mcreator.ceshi.client.gui.MolalajitongScreen;
import net.mcreator.ceshi.client.gui.MaoxianjiazhinangguiScreen;
import net.mcreator.ceshi.client.gui.LiulangzhezhinangguiScreen;
import net.mcreator.ceshi.client.gui.HeitayindaoyongguiScreen;
import net.mcreator.ceshi.client.gui.GanjinglajitongScreen;
import net.mcreator.ceshi.client.gui.CeshishijianxuanzejiemianScreen;
import net.mcreator.ceshi.client.gui.CeshiguiScreen;
import net.mcreator.ceshi.client.gui.CeshifumoguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PrimogemcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PrimogemcraftModMenus.CESHIGUI, CeshiguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.GANJINGLAJITONG, GanjinglajitongScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.MOLALAJITONG, MolalajitongScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.LIULANGZHEZHINANGGUI, LiulangzhezhinangguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.MAOXIANJIAZHINANGGUI, MaoxianjiazhinangguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.ZHANGQUANZHEZHINANGGUI, ZhangquanzhezhinangguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.YIBANGRENZHINANGGUI, YibangrenzhinangguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.CESHISHIJIANXUANZEJIEMIAN, CeshishijianxuanzejiemianScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.SUIJIQIWU, SuijiqiwuScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.CESHIFUMOGUI, CeshifumoguiScreen::new);
			MenuScreens.register(PrimogemcraftModMenus.HEITAYINDAOYONGGUI, HeitayindaoyongguiScreen::new);
		});
	}
}
