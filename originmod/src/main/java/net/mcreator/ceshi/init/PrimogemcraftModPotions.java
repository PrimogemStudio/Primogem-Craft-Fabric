
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.PrimogemcraftMod;

public class PrimogemcraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PrimogemcraftMod.MODID);
	public static final RegistryObject<Potion> FENGRAOQIONGJIANG = REGISTRY.register("fengraoqiongjiang",
			() -> new Potion(new MobEffectInstance(PrimogemcraftModMobEffects.FENGRAO.get(), 1200, 0, false, true), new MobEffectInstance(MobEffects.CONFUSION, 1200, 2, false, false),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1200, 0, false, false), new MobEffectInstance(MobEffects.WEAKNESS, 1200, 0, false, false), new MobEffectInstance(MobEffects.UNLUCK, 1200, 0, false, false)));
}
