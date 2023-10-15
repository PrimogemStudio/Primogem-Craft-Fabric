package net.mcreator.ceshi.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.Util;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;
import net.mcreator.ceshi.init.PrimogemcraftModEntities;
import net.mcreator.ceshi.init.PrimogemcraftModBlocks;
import net.mcreator.ceshi.entity.QqiwuzhanlipinshitiEntity;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class XxiaoguanziletoshuxingProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PrimogemcraftModBlocks.XIAOGUANZI.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PrimogemcraftModBlocks.DAGUANZI.get()) {
			if (Math.random() < 0.3 && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == PrimogemcraftModItems.ZHZHENYINHEDALETOU.get()) {
				if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity) || !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PrimogemcraftModMobEffects.LETOUDECHENGFA.get()) : false)) {
					if (Math.random() < 0.4) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new QqiwuzhanlipinshitiEntity(PrimogemcraftModEntities.QQIWUZHANLIPINSHITI.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF;\u00A7a\u83B7\u5F97\u5947\u7269"), (false));
					} else {
						{
							ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
							if (_ist.hurt(10, new Random(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.LETOUDECHENGFA.get(), 20000000, 0));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u00A75\u7CFB\u7EDF\uFF1A\u300E\u771F\u300F\u00A7b\u94F6\u6CB3\u5927\u4E50\u900F\u00A7c\u5DF2\u635F\u574F"), (false));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.NEUTRAL, 5, 1, false);
							}
						}
					}
				} else {
					entity.hurt(DamageSource.GENERIC, 1000);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent((entity.getDisplayName().getString() + "\u00A7c\u8F93\u5F97\u4E00\u584C\u7CCA\u6D82\uFF0C\u670B\u53CB")), ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
		}
	}
}
