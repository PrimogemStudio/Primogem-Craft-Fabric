package net.mcreator.ceshi.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.ceshi.network.PrimogemcraftModVariables;

public class LetouchaxunProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (!entity.getPersistentData().getBoolean("letouchaxun_lengque")) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList()
								.broadcastMessage(new TextComponent(("\u00A7d\u5168\u5458\u6D88\u606F\uFF1A\u00A77\u73A9\u5BB6\u00A7f<" + entity.getDisplayName().getString() + ">\u00A77\u73B0\u603B\u5171\u00A7c\u635F\u574F\u8FC7\u00A7a"
										+ new java.text.DecimalFormat("##.##").format((entity.getCapability(PrimogemcraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PrimogemcraftModVariables.PlayerVariables())).daletou_jishu)
										+ "\u00A7c\u5F20 \u00A7b\u94F6\u6CB3\u5927\u4E50\u900F\uFF01")), ChatType.SYSTEM, Util.NIL_UUID);
				}
				entity.getPersistentData().putBoolean("letouchaxun_lengque", (true));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						entity.getPersistentData().putBoolean("letouchaxun_lengque", (false));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1200);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(("\u00A77\u73B0\u603B\u5171\u00A7c\u635F\u574F\u8FC7\u00A7a"
							+ new java.text.DecimalFormat("##.##").format((entity.getCapability(PrimogemcraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PrimogemcraftModVariables.PlayerVariables())).daletou_jishu)
							+ "\u00A7c\u5F20 \u00A7b\u94F6\u6CB3\u5927\u4E50\u900F\uFF01")), (false));
			}
		}
	}
}
