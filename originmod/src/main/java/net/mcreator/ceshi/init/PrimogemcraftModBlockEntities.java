
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ceshi.block.entity.MmolazhilajitongBlockEntity;
import net.mcreator.ceshi.block.entity.LajitongBlockEntity;
import net.mcreator.ceshi.block.entity.GanjinglajitongxiangziBlockEntity;
import net.mcreator.ceshi.block.entity.ChuangzaoxiaodengfasheqiBlockEntity;
import net.mcreator.ceshi.block.entity.CeshixiaodengfasheqiBlockEntity;
import net.mcreator.ceshi.PrimogemcraftMod;

public class PrimogemcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, PrimogemcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CESHIXIAODENGFASHEQI = register("ceshixiaodengfasheqi", PrimogemcraftModBlocks.CESHIXIAODENGFASHEQI, CeshixiaodengfasheqiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHUANGZAOXIAODENGFASHEQI = register("chuangzaoxiaodengfasheqi", PrimogemcraftModBlocks.CHUANGZAOXIAODENGFASHEQI, ChuangzaoxiaodengfasheqiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAJITONG = register("lajitong", PrimogemcraftModBlocks.LAJITONG, LajitongBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GANJINGLAJITONGXIANGZI = register("ganjinglajitongxiangzi", PrimogemcraftModBlocks.GANJINGLAJITONGXIANGZI, GanjinglajitongxiangziBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MMOLAZHILAJITONG = register("mmolazhilajitong", PrimogemcraftModBlocks.MMOLAZHILAJITONG, MmolazhilajitongBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
