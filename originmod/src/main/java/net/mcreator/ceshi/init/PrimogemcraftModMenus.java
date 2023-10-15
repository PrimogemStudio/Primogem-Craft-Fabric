
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.ceshi.world.inventory.ZhangquanzhezhinangguiMenu;
import net.mcreator.ceshi.world.inventory.YibangrenzhinangguiMenu;
import net.mcreator.ceshi.world.inventory.SuijiqiwuMenu;
import net.mcreator.ceshi.world.inventory.MolalajitongMenu;
import net.mcreator.ceshi.world.inventory.MaoxianjiazhinangguiMenu;
import net.mcreator.ceshi.world.inventory.LiulangzhezhinangguiMenu;
import net.mcreator.ceshi.world.inventory.HeitayindaoyongguiMenu;
import net.mcreator.ceshi.world.inventory.GanjinglajitongMenu;
import net.mcreator.ceshi.world.inventory.CeshishijianxuanzejiemianMenu;
import net.mcreator.ceshi.world.inventory.CeshiguiMenu;
import net.mcreator.ceshi.world.inventory.CeshifumoguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimogemcraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CeshiguiMenu> CESHIGUI = register("ceshigui", (id, inv, extraData) -> new CeshiguiMenu(id, inv, extraData));
	public static final MenuType<GanjinglajitongMenu> GANJINGLAJITONG = register("ganjinglajitong", (id, inv, extraData) -> new GanjinglajitongMenu(id, inv, extraData));
	public static final MenuType<MolalajitongMenu> MOLALAJITONG = register("molalajitong", (id, inv, extraData) -> new MolalajitongMenu(id, inv, extraData));
	public static final MenuType<LiulangzhezhinangguiMenu> LIULANGZHEZHINANGGUI = register("liulangzhezhinanggui", (id, inv, extraData) -> new LiulangzhezhinangguiMenu(id, inv, extraData));
	public static final MenuType<MaoxianjiazhinangguiMenu> MAOXIANJIAZHINANGGUI = register("maoxianjiazhinanggui", (id, inv, extraData) -> new MaoxianjiazhinangguiMenu(id, inv, extraData));
	public static final MenuType<ZhangquanzhezhinangguiMenu> ZHANGQUANZHEZHINANGGUI = register("zhangquanzhezhinanggui", (id, inv, extraData) -> new ZhangquanzhezhinangguiMenu(id, inv, extraData));
	public static final MenuType<YibangrenzhinangguiMenu> YIBANGRENZHINANGGUI = register("yibangrenzhinanggui", (id, inv, extraData) -> new YibangrenzhinangguiMenu(id, inv, extraData));
	public static final MenuType<CeshishijianxuanzejiemianMenu> CESHISHIJIANXUANZEJIEMIAN = register("ceshishijianxuanzejiemian", (id, inv, extraData) -> new CeshishijianxuanzejiemianMenu(id, inv, extraData));
	public static final MenuType<SuijiqiwuMenu> SUIJIQIWU = register("suijiqiwu", (id, inv, extraData) -> new SuijiqiwuMenu(id, inv, extraData));
	public static final MenuType<CeshifumoguiMenu> CESHIFUMOGUI = register("ceshifumogui", (id, inv, extraData) -> new CeshifumoguiMenu(id, inv, extraData));
	public static final MenuType<HeitayindaoyongguiMenu> HEITAYINDAOYONGGUI = register("heitayindaoyonggui", (id, inv, extraData) -> new HeitayindaoyongguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
