
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ceshi.entity.XiaoheitaEntity;
import net.mcreator.ceshi.entity.XiaodengEntity;
import net.mcreator.ceshi.entity.QqiyuanJinGuangEntity;
import net.mcreator.ceshi.entity.QqiwuzhanlipinshitiEntity;
import net.mcreator.ceshi.entity.QQyuanchuzi01Entity;
import net.mcreator.ceshi.entity.QQQyuanchulan01Entity;
import net.mcreator.ceshi.entity.CaoyuanheshengwuEntity;
import net.mcreator.ceshi.entity.BaiguangguodushengwuEntity;
import net.mcreator.ceshi.PrimogemcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimogemcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PrimogemcraftMod.MODID);
	public static final RegistryObject<EntityType<QqiyuanJinGuangEntity>> QQIYUAN_JIN_GUANG = register("qqiyuan_jin_guang", EntityType.Builder.<QqiyuanJinGuangEntity>of(QqiyuanJinGuangEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(QqiyuanJinGuangEntity::new).fireImmune().sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<QQyuanchuzi01Entity>> Q_QYUANCHUZI_01 = register("q_qyuanchuzi_01", EntityType.Builder.<QQyuanchuzi01Entity>of(QQyuanchuzi01Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(QQyuanchuzi01Entity::new).fireImmune().sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<QQQyuanchulan01Entity>> QQ_QYUANCHULAN_01 = register("qq_qyuanchulan_01", EntityType.Builder.<QQQyuanchulan01Entity>of(QQQyuanchulan01Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(QQQyuanchulan01Entity::new).fireImmune().sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<CaoyuanheshengwuEntity>> CAOYUANHESHENGWU = register("caoyuanheshengwu",
			EntityType.Builder.<CaoyuanheshengwuEntity>of(CaoyuanheshengwuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(CaoyuanheshengwuEntity::new)

					.sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<XiaodengEntity>> XIAODENG = register("xiaodeng",
			EntityType.Builder.<XiaodengEntity>of(XiaodengEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(XiaodengEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XiaoheitaEntity>> XIAOHEITA = register("xiaoheita", EntityType.Builder.<XiaoheitaEntity>of(XiaoheitaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(XiaoheitaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QqiwuzhanlipinshitiEntity>> QQIWUZHANLIPINSHITI = register("qqiwuzhanlipinshiti",
			EntityType.Builder.<QqiwuzhanlipinshitiEntity>of(QqiwuzhanlipinshitiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(QqiwuzhanlipinshitiEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<BaiguangguodushengwuEntity>> BAIGUANGGUODUSHENGWU = register("baiguangguodushengwu",
			EntityType.Builder.<BaiguangguodushengwuEntity>of(BaiguangguodushengwuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(BaiguangguodushengwuEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			QqiyuanJinGuangEntity.init();
			QQyuanchuzi01Entity.init();
			QQQyuanchulan01Entity.init();
			CaoyuanheshengwuEntity.init();
			XiaodengEntity.init();
			XiaoheitaEntity.init();
			QqiwuzhanlipinshitiEntity.init();
			BaiguangguodushengwuEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(QQIYUAN_JIN_GUANG.get(), QqiyuanJinGuangEntity.createAttributes().build());
		event.put(Q_QYUANCHUZI_01.get(), QQyuanchuzi01Entity.createAttributes().build());
		event.put(QQ_QYUANCHULAN_01.get(), QQQyuanchulan01Entity.createAttributes().build());
		event.put(CAOYUANHESHENGWU.get(), CaoyuanheshengwuEntity.createAttributes().build());
		event.put(XIAODENG.get(), XiaodengEntity.createAttributes().build());
		event.put(XIAOHEITA.get(), XiaoheitaEntity.createAttributes().build());
		event.put(QQIWUZHANLIPINSHITI.get(), QqiwuzhanlipinshitiEntity.createAttributes().build());
		event.put(BAIGUANGGUODUSHENGWU.get(), BaiguangguodushengwuEntity.createAttributes().build());
	}
}
