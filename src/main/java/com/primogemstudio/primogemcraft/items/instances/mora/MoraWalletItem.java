package com.primogemstudio.primogemcraft.items.instances.mora;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MoraWalletItem extends Item {
    public MoraWalletItem() {
        super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
    }

    public void appendHoverText(ItemStack itemstack, @Nullable Level world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.primogemcraft.mora_wallet.line1"));
    }
}
