package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModBlocks;

public class Shiti_cao_beileipiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (y - 20), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (y - 20), z, _ent.getYRot(), _ent.getXRot());
		}
		world.setBlock(new BlockPos(x, y, z), PrimogemcraftModBlocks.CAOYUANHEKUAI.get().defaultBlockState(), 3);
	}
}
