package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class Kongyuezhufu_shuxingProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.KONGYUEZHUFU.get()) {
			if (!itemstack.getOrCreateTag().getBoolean("yueka_lengque")) {
				itemstack.getOrCreateTag().putBoolean("yueka_lengque", (true));
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
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PrimogemcraftModItems.YUANSHI.get());
							_setstack.setCount(Mth.nextInt(new Random(), 1, 9));
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world.isClientSide())
							Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.PLAYERS, (float) 0.3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.PLAYERS, (float) 0.3, 1, false);
							}
						}
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 24000);
						{
							ItemStack _ist = itemstack;
							if (_ist.hurt(1, new Random(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.OFF_HAND, true);
						}
						itemstack.getOrCreateTag().putBoolean("yueka_lengque", (false));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 32);
			}
		}
	}
}
