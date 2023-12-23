package com.primogemstudio.primogemcraft.items.instances.materials.vayuda;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VayudaTurquoiseGemstonePickaxeItem extends PickaxeItem {
    public VayudaTurquoiseGemstonePickaxeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8.5f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.VAYUDA_TURQUOISE_GEMSTONE_SLIVER_ITEM), new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM));
            }
        }, 1, -2.8f, new Item.Properties().fireResistant());
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        var ar = super.use(level, entity, hand);
        if (entity.isShiftKeyDown()) {
            var x = entity.getX();
            var y = entity.getY();
            var z = entity.getZ();
            entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 127, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 2, false, false));
            entity.getCooldowns().addCooldown(ar.getObject().getItem(), 800);
            if (!level.isClientSide()) {
                level.playSound(null, x, y, z, SoundEvents.TRIDENT_RIPTIDE_2, SoundSource.PLAYERS, (float) 0.3, (float) Mth.nextDouble(RandomSource.create(), 1.2, 5));
            }
            if (ar.getObject().getItem() == entity.getMainHandItem().getItem()) {
                entity.swing(InteractionHand.MAIN_HAND, true);
            }
            if (ar.getObject().getItem() == entity.getOffhandItem().getItem()) {
                entity.swing(InteractionHand.OFF_HAND, true);
            }
            if (level instanceof ServerLevel sl) {
                sl.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 30, 0, 4, 0, 0.8);
            }
            var stack = ar.getObject();
            if (stack.hurt(1, RandomSource.create(), null)) {
                stack.shrink(1);
                stack.setDamageValue(0);
            }
        }
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_pickaxe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vayuda_turquoise_gemstone_pickaxe.line2"));
    }
}