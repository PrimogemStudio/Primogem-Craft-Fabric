package net.mcreator.ceshi.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class JljsxProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.JLJTIE.get()) {
			if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") < 4 && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.WEAKNESS) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 0, (false), (false)));
				itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") + 1));
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
						if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") > 0) {
							itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") - 1));
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 100);
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.JLJZS.get()) {
			if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") < 6 && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.WEAKNESS) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0, (false), (false)));
				itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") + 1));
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
						if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") > 0) {
							itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") - 1));
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 120);
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.JJLJXJHJ.get()) {
			if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") < 11 && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.WEAKNESS) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 1, (false), (false)));
				itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") + 1));
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
						if (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") > 0) {
							itemstack.getOrCreateTag().putDouble("jl_j_sx_01", (itemstack.getOrCreateTag().getDouble("jl_j_sx_01") - 1));
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 160);
			}
		}
	}
}
