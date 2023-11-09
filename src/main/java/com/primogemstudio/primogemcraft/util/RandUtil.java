package com.primogemstudio.primogemcraft.util;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.levelgen.ThreadSafeLegacyRandomSource;

import java.util.Random;

public class RandUtil {
    private static final RandomSource rand = new ThreadSafeLegacyRandomSource(new Random().nextLong());
    public static int rndInt(int base, int top) {
        return rand.nextInt(base, top + 1);
    }
    public static ItemStack enchantItem(ItemStack stack, boolean treasure, int level) {
        return EnchantmentHelper.enchantItem(rand, stack, level, treasure);
    }
}
