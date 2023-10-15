package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;

public class Ceoyuanhe_gengxinProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("cao_chixu", (entity.getPersistentData().getDouble("cao_chixu") + 1));
		if (entity.getPersistentData().getDouble("cao_chixu") >= 200) {
			entity.hurt(DamageSource.GENERIC, entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (-64), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (-64), z, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (entity.isOnFire()) {
			entity.getPersistentData().putDouble("cao_baozha", (entity.getPersistentData().getDouble("cao_baozha") + 1));
			if (!(entity.getPersistentData().getDouble("cao_baozha") > 1)) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (-64), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (-64), z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
