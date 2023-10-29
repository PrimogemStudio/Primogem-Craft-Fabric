package com.primogemstudio.primogemcraft.effects.instances;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import org.jetbrains.annotations.NotNull;

public class SpecialHurtMobEffect extends MobEffect {
    public SpecialHurtMobEffect() {
        super(MobEffectCategory.HARMFUL, -8123894);
    }

    @Override
    public @NotNull String getDescriptionId() {
        return "effect.primogemcraft.yiji";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        /*if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 127, (false), (false)));
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
                if (entity.isAlive()) {
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 8, Explosion.BlockInteraction.BREAK);
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 10, (float) 0.5);
                        } else {
                            _level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 10, (float) 0.5, false);
                        }
                    }
                    world.setBlock(new BlockPos(x, y, z), PrimogemcraftModBlocks.YUANSHIKUANGSHI.get().defaultBlockState(), 3);
                    if (Math.random() < 0.5) {
                        world.setBlock(new BlockPos(x, y + 1, z), PrimogemcraftModBlocks.YUANSHIKUANGSHI.get().defaultBlockState(), 3);
                    }
                    entity.hurt(DamageSource.MAGIC, 20);
                    if (!(entity instanceof Player)) {
                        {
                            Entity _ent = entity;
                            _ent.teleportTo(x, (-63), z);
                            if (_ent instanceof ServerPlayer _serverPlayer)
                                _serverPlayer.connection.teleport(x, (-63), z, _ent.getYRot(), _ent.getXRot());
                        }
                    } else {
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
                                if (entity.isAlive()) {
                                    entity.hurt(DamageSource.MAGIC, 20);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 20);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 160);*/
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.level() instanceof ServerLevel _level) {
            /*_level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 0, 3)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 200.0 0.0 0.0 3.0");
            _level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 1, 4)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 200.0 0.0 0.0 3.0");
            _level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 0, 3)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 100.0 0.0 0.0 1.0");
            _level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 1, 4)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 100.0 0.0 0.0 1.0");
            _level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 0, 3)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 150.0 0.0 0.0 2.0");
            _level.getServer().getCommands().performCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + Mth.nextDouble(RD, -2, 2)), (entity.getY() + Mth.nextDouble(RD, 1, 4)), (entity.getZ() + Mth.nextDouble(RD, -2, 2))), Vec2.ZERO,
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                    "/particle dust 150.0 0.0 0.0 2.0");*/
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
