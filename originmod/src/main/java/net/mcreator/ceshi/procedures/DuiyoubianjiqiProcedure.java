package net.mcreator.ceshi.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DuiyoubianjiqiProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getTarget(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.isShiftKeyDown() && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:kebianjiduiyou")))) {
			if (entity.getPersistentData().getBoolean((sourceentity.getDisplayName().getString() + "ceshi_duiyou"))) {
				entity.getPersistentData().putBoolean((sourceentity.getDisplayName().getString() + "ceshi_duiyou"), (false));
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent((("\u73A9\u5BB6<" + sourceentity.getDisplayName().getString() + ">") + "\u5BF9" + entity.getDisplayName().getString() + "\u00A7c\u53D6\u6D88\u4E86\u961F\u53CB")),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
			} else {
				entity.getPersistentData().putBoolean((sourceentity.getDisplayName().getString() + "ceshi_duiyou"), (true));
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent((("\u73A9\u5BB6<" + sourceentity.getDisplayName().getString() + ">") + "\u5BF9" + entity.getDisplayName().getString() + "\u00A7a\u6DFB\u52A0\u4E86\u961F\u53CB")),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
			}
		}
	}
}
