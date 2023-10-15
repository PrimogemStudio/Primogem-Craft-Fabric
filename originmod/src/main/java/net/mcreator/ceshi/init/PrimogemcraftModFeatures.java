
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.ceshi.world.features.ores.ZuishengkuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ZiyousongshikuangshiFeature;
import net.mcreator.ceshi.world.features.ores.YuanshikuangshiFeature;
import net.mcreator.ceshi.world.features.ores.XinyuekuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ShengzhangkuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ShenbanyanyuanshikuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ShenbanjianlaohuangyukuangshiFeature;
import net.mcreator.ceshi.world.features.ores.RanyuanmanaokuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ManyuejinshukuangshiFeature;
import net.mcreator.ceshi.world.features.ores.JianlaokuangshiFeature;
import net.mcreator.ceshi.world.features.ores.Disuikuai1Feature;
import net.mcreator.ceshi.world.features.ores.DijingqinjingkuangshiFeature;
import net.mcreator.ceshi.world.features.ores.ChiyuejinshukuangFeature;
import net.mcreator.ceshi.world.features.ores.AixubingyukuangshiFeature;
import net.mcreator.ceshi.world.features.Zhzhongguanzi01Feature;
import net.mcreator.ceshi.world.features.Xxiaoguanzi02Feature;
import net.mcreator.ceshi.world.features.Xxiaoguanzi01Feature;
import net.mcreator.ceshi.world.features.ShamoguanziFeature;
import net.mcreator.ceshi.world.features.PinyuanguanziFeature;
import net.mcreator.ceshi.world.features.Molayiji01Feature;
import net.mcreator.ceshi.world.features.LajiyijiFeature;
import net.mcreator.ceshi.world.features.Dibiaomola01Feature;
import net.mcreator.ceshi.world.features.Ddaguanzi01Feature;
import net.mcreator.ceshi.PrimogemcraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PrimogemcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PrimogemcraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> YUANSHIKUANGSHI = register("yuanshikuangshi", YuanshikuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, YuanshikuangshiFeature.GENERATE_BIOMES, YuanshikuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHENBANYANYUANSHIKUANGSHI = register("shenbanyanyuanshikuangshi", ShenbanyanyuanshikuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ShenbanyanyuanshikuangshiFeature.GENERATE_BIOMES, ShenbanyanyuanshikuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZIYOUSONGSHIKUANGSHI = register("ziyousongshikuangshi", ZiyousongshikuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZiyousongshikuangshiFeature.GENERATE_BIOMES, ZiyousongshikuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JIANLAOKUANGSHI = register("jianlaokuangshi", JianlaokuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JianlaokuangshiFeature.GENERATE_BIOMES, JianlaokuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHENBANJIANLAOHUANGYUKUANGSHI = register("shenbanjianlaohuangyukuangshi", ShenbanjianlaohuangyukuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ShenbanjianlaohuangyukuangshiFeature.GENERATE_BIOMES, ShenbanjianlaohuangyukuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZUISHENGKUANGSHI = register("zuishengkuangshi", ZuishengkuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZuishengkuangshiFeature.GENERATE_BIOMES, ZuishengkuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHENGZHANGKUANGSHI = register("shengzhangkuangshi", ShengzhangkuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ShengzhangkuangshiFeature.GENERATE_BIOMES, ShengzhangkuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIJINGQINJINGKUANGSHI = register("dijingqinjingkuangshi", DijingqinjingkuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DijingqinjingkuangshiFeature.GENERATE_BIOMES, DijingqinjingkuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RANYUANMANAOKUANGSHI = register("ranyuanmanaokuangshi", RanyuanmanaokuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RanyuanmanaokuangshiFeature.GENERATE_BIOMES, RanyuanmanaokuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AIXUBINGYUKUANGSHI = register("aixubingyukuangshi", AixubingyukuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AixubingyukuangshiFeature.GENERATE_BIOMES, AixubingyukuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> XINYUEKUANGSHI = register("xinyuekuangshi", XinyuekuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, XinyuekuangshiFeature.GENERATE_BIOMES, XinyuekuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHIYUEJINSHUKUANG = register("chiyuejinshukuang", ChiyuejinshukuangFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ChiyuejinshukuangFeature.GENERATE_BIOMES, ChiyuejinshukuangFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MANYUEJINSHUKUANGSHI = register("manyuejinshukuangshi", ManyuejinshukuangshiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ManyuejinshukuangshiFeature.GENERATE_BIOMES, ManyuejinshukuangshiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DISUIKUAI_1 = register("disuikuai_1", Disuikuai1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Disuikuai1Feature.GENERATE_BIOMES, Disuikuai1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MOLAYIJI_01 = register("molayiji_01", Molayiji01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Molayiji01Feature.GENERATE_BIOMES, Molayiji01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> DIBIAOMOLA_01 = register("dibiaomola_01", Dibiaomola01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Dibiaomola01Feature.GENERATE_BIOMES, Dibiaomola01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PINYUANGUANZI = register("pinyuanguanzi", PinyuanguanziFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PinyuanguanziFeature.GENERATE_BIOMES, PinyuanguanziFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHAMOGUANZI = register("shamoguanzi", ShamoguanziFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ShamoguanziFeature.GENERATE_BIOMES, ShamoguanziFeature::placedFeature));
	public static final RegistryObject<Feature<?>> XXIAOGUANZI_01 = register("xxiaoguanzi_01", Xxiaoguanzi01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Xxiaoguanzi01Feature.GENERATE_BIOMES, Xxiaoguanzi01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> XXIAOGUANZI_02 = register("xxiaoguanzi_02", Xxiaoguanzi02Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Xxiaoguanzi02Feature.GENERATE_BIOMES, Xxiaoguanzi02Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ZHZHONGGUANZI_01 = register("zhzhongguanzi_01", Zhzhongguanzi01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Zhzhongguanzi01Feature.GENERATE_BIOMES, Zhzhongguanzi01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> DDAGUANZI_01 = register("ddaguanzi_01", Ddaguanzi01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Ddaguanzi01Feature.GENERATE_BIOMES, Ddaguanzi01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> LAJIYIJI = register("lajiyiji", LajiyijiFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LajiyijiFeature.GENERATE_BIOMES, LajiyijiFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
