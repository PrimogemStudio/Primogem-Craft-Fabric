
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.potion.ZhuoshaoMobEffect;
import net.mcreator.ceshi.potion.ZhongguizhongjuxiaoguoMobEffect;
import net.mcreator.ceshi.potion.ZhengchangdaimaMobEffect;
import net.mcreator.ceshi.potion.ZhandouzhuangtaiMobEffect;
import net.mcreator.ceshi.potion.YijiMobEffect;
import net.mcreator.ceshi.potion.RuodianlengqueMobEffect;
import net.mcreator.ceshi.potion.RuodianMobEffect;
import net.mcreator.ceshi.potion.QuezhushixiaoguoMobEffect;
import net.mcreator.ceshi.potion.QiqiaodaimaxiufuMobEffect;
import net.mcreator.ceshi.potion.QianyelengqueMobEffect;
import net.mcreator.ceshi.potion.QianyeMobEffect;
import net.mcreator.ceshi.potion.LinzhongMobEffect;
import net.mcreator.ceshi.potion.LetoudechengfaMobEffect;
import net.mcreator.ceshi.potion.LengquezhongguizhongjuMobEffect;
import net.mcreator.ceshi.potion.JishengMobEffect;
import net.mcreator.ceshi.potion.JingquedaimaMobEffect;
import net.mcreator.ceshi.potion.JijishengchongdefennuMobEffect;
import net.mcreator.ceshi.potion.GuoquMobEffect;
import net.mcreator.ceshi.potion.GouyuMobEffect;
import net.mcreator.ceshi.potion.GongjitishengMobEffect;
import net.mcreator.ceshi.potion.FengraoMobEffect;
import net.mcreator.ceshi.potion.FeixingMobEffect;
import net.mcreator.ceshi.potion.DjppMobEffect;
import net.mcreator.ceshi.potion.DiguixiaoguoMobEffect;
import net.mcreator.ceshi.PrimogemcraftMod;

public class PrimogemcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PrimogemcraftMod.MODID);
	public static final RegistryObject<MobEffect> JISHENG = REGISTRY.register("jisheng", () -> new JishengMobEffect());
	public static final RegistryObject<MobEffect> JIJISHENGCHONGDEFENNU = REGISTRY.register("jijishengchongdefennu", () -> new JijishengchongdefennuMobEffect());
	public static final RegistryObject<MobEffect> GONGJITISHENG = REGISTRY.register("gongjitisheng", () -> new GongjitishengMobEffect());
	public static final RegistryObject<MobEffect> LETOUDECHENGFA = REGISTRY.register("letoudechengfa", () -> new LetoudechengfaMobEffect());
	public static final RegistryObject<MobEffect> GOUYU = REGISTRY.register("gouyu", () -> new GouyuMobEffect());
	public static final RegistryObject<MobEffect> GUOQU = REGISTRY.register("guoqu", () -> new GuoquMobEffect());
	public static final RegistryObject<MobEffect> RUODIAN = REGISTRY.register("ruodian", () -> new RuodianMobEffect());
	public static final RegistryObject<MobEffect> RUODIANLENGQUE = REGISTRY.register("ruodianlengque", () -> new RuodianlengqueMobEffect());
	public static final RegistryObject<MobEffect> ZHANDOUZHUANGTAI = REGISTRY.register("zhandouzhuangtai", () -> new ZhandouzhuangtaiMobEffect());
	public static final RegistryObject<MobEffect> FENGRAO = REGISTRY.register("fengrao", () -> new FengraoMobEffect());
	public static final RegistryObject<MobEffect> ZHENGCHANGDAIMA = REGISTRY.register("zhengchangdaima", () -> new ZhengchangdaimaMobEffect());
	public static final RegistryObject<MobEffect> QIQIAODAIMAXIUFU = REGISTRY.register("qiqiaodaimaxiufu", () -> new QiqiaodaimaxiufuMobEffect());
	public static final RegistryObject<MobEffect> ZHONGGUIZHONGJUXIAOGUO = REGISTRY.register("zhongguizhongjuxiaoguo", () -> new ZhongguizhongjuxiaoguoMobEffect());
	public static final RegistryObject<MobEffect> LENGQUEZHONGGUIZHONGJU = REGISTRY.register("lengquezhongguizhongju", () -> new LengquezhongguizhongjuMobEffect());
	public static final RegistryObject<MobEffect> JINGQUEDAIMA = REGISTRY.register("jingquedaima", () -> new JingquedaimaMobEffect());
	public static final RegistryObject<MobEffect> QUEZHUSHIXIAOGUO = REGISTRY.register("quezhushixiaoguo", () -> new QuezhushixiaoguoMobEffect());
	public static final RegistryObject<MobEffect> DIGUIXIAOGUO = REGISTRY.register("diguixiaoguo", () -> new DiguixiaoguoMobEffect());
	public static final RegistryObject<MobEffect> LINZHONG = REGISTRY.register("linzhong", () -> new LinzhongMobEffect());
	public static final RegistryObject<MobEffect> QIANYE = REGISTRY.register("qianye", () -> new QianyeMobEffect());
	public static final RegistryObject<MobEffect> QIANYELENGQUE = REGISTRY.register("qianyelengque", () -> new QianyelengqueMobEffect());
	public static final RegistryObject<MobEffect> DJPP = REGISTRY.register("djpp", () -> new DjppMobEffect());
	public static final RegistryObject<MobEffect> YIJI = REGISTRY.register("yiji", () -> new YijiMobEffect());
	public static final RegistryObject<MobEffect> ZHUOSHAO = REGISTRY.register("zhuoshao", () -> new ZhuoshaoMobEffect());
	public static final RegistryObject<MobEffect> FEIXING = REGISTRY.register("feixing", () -> new FeixingMobEffect());
}
