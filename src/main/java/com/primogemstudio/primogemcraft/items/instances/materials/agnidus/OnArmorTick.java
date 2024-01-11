package com.primogemstudio.primogemcraft.items.instances.materials.agnidus;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.items.instances.materials.common.ArmorHelper;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class OnArmorTick {
    public static void execute(Player entity, ItemStack itemstack) {
        if (!entity.level().isClientSide) {
            var armor_value = ArmorHelper.getArmorValue(entity, itemstack);
            if (!entity.hasEffect(MobEffects.FIRE_RESISTANCE) && armor_value >= 2) {
                entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 80, 0, true, false));
            }
            if (armor_value >= 4 && (entity.isInLava() || entity.isOnFire()) && !entity.hasEffect(PrimogemCraftMobEffects.FLYING)) {
                entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.FLYING,
                                (int) (armor_value * 40),
                                0, false, false));
            }
            else {
                if (((ServerPlayer) entity).gameMode.isSurvival() || entity.hasEffect(PrimogemCraftMobEffects.FLYING)) {
                    entity.removeEffect(PrimogemCraftMobEffects.FLYING);
                }
            }
        }
    }
}
