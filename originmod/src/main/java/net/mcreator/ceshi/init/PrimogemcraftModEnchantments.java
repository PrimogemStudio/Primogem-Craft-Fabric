
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.ceshi.enchantment.Ceshifumo01Enchantment;
import net.mcreator.ceshi.PrimogemcraftMod;

public class PrimogemcraftModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PrimogemcraftMod.MODID);
	public static final RegistryObject<Enchantment> CESHIFUMO_01 = REGISTRY.register("ceshifumo_01", () -> new Ceshifumo01Enchantment());
}
