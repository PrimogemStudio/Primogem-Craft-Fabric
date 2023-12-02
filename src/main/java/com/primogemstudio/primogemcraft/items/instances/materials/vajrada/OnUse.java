package com.primogemstudio.primogemcraft.items.instances.materials.vajrada;

import com.primogemstudio.primogemcraft.effects.PrimogemCraftMobEffects;
import com.primogemstudio.primogemcraft.items.PrimogemCraftItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class OnUse {
    public static void execute(Player entity, ItemStack itemstack) {
        if (entity.isShiftKeyDown()) {
            if (!entity.level().isClientSide()) {
                entity.addEffect(new MobEffectInstance(PrimogemCraftMobEffects.AMULATE, 200, itemstack.getItem() instanceof VajradaAmethystIronItem ? 0 : (itemstack.getItem() instanceof VajradaAmethystDiamondSwordItem ? 1 : 2)));
            }
            entity.getCooldowns().addCooldown(PrimogemCraftItems.VAJRADA_AMETHYST_IRON_SWORD_ITEM, 600);
            entity.getCooldowns().addCooldown(PrimogemCraftItems.VAJRADA_AMETHYST_DIAMOND_SWORD_ITEM, 800);
            entity.getCooldowns().addCooldown(PrimogemCraftItems.VAJRADA_AMETHYST_NETHERITE_SWORD_ITEM, 900);
        }
    }
}
