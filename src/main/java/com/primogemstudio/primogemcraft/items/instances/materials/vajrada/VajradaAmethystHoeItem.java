package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.minecraft.server.level.ServerLevel.*;

public class VajradaAmethystHoeItem extends HoeItem {
    public VajradaAmethystHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 1561;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 10;
            }

            @NotNull
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(PrimogemCraftItems.PRIMOGEM_ITEM), new ItemStack(PrimogemCraftItems.VAJRADA_AMETHYST_SLIVER_ITEM));
            }
        }, 0, -3f, new Item.Properties().fireResistant());
    }

    @Override
    @NotNull
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        var ret = super.use(level, player, hand);
        if (!level.isClientSide) {
            changWeather((ServerLevel) level);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BEACON_ACTIVATE, SoundSource.PLAYERS, (float) 0.5, 1);
            player.swing(hand);
            var stack = player.getItemInHand(hand);
            stack.hurtAndBreak(100, player, p -> p.broadcastBreakEvent(hand));
            player.getCooldowns().addCooldown(stack.getItem(), 1200);
        }
        return ret;
    }

    private void changWeather(ServerLevel level) {
        if (Math.random() < 0.4) {
            var thunder = Math.random() < 0.4;
            level.setWeatherParameters(0, (thunder ? THUNDER_DURATION : RAIN_DURATION).sample(level.random), true, thunder);
            return;
        }
        level.setWeatherParameters(RAIN_DELAY.sample(level.random), 0, false, false);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_hoe.line1"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_hoe.line2"));
        list.add(Component.translatable("tooltip.primogemcraft.vajrada_amethyst_hoe.line3"));
    }
}