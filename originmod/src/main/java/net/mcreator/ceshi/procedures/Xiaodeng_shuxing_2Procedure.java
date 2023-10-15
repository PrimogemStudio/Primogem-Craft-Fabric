package net.mcreator.ceshi.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class Xiaodeng_shuxing_2Procedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() >= 256) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y + 1000), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 1000), z, _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
		}
	}
}
