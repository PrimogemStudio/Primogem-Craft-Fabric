package com.primogemstudio.primogemcraft.items.instances;

import com.primogemstudio.primogemcraft.gacha.packets.client.GachaTriggerClientPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class IntertwinedFate extends BowItem implements Vanishable {
    public IntertwinedFate() {
        super(new Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    @NotNull
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        //TODO
        var itemstack = super.finishUsingItem(stack, level, livingEntity);
        ClientPlayNetworking.send(new GachaTriggerClientPacket());
        return itemstack;
    }
}
