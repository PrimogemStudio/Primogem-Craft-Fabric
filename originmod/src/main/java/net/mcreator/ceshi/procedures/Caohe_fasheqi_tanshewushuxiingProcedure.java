package net.mcreator.ceshi.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.entity.CaoyuanheshengwuEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Caohe_fasheqi_tanshewushuxiingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("primogemcraft:huoyuansu")))
				|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("primogemcraft:huoyuansu")))) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entity instanceof CaoyuanheshengwuEntity) {
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, 0, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, 0, z, _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
	}
}
