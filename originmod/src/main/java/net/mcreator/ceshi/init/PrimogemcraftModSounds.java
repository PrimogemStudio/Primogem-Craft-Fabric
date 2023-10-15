
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimogemcraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("primogemcraft", "choukaqianxi01"), new SoundEvent(new ResourceLocation("primogemcraft", "choukaqianxi01")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "choukatiaoguo.1"), new SoundEvent(new ResourceLocation("primogemcraft", "choukatiaoguo.1")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "dashengchulan01"), new SoundEvent(new ResourceLocation("primogemcraft", "dashengchulan01")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "dashengchuzi01"), new SoundEvent(new ResourceLocation("primogemcraft", "dashengchuzi01")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "dashengchujin"), new SoundEvent(new ResourceLocation("primogemcraft", "dashengchujin")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "liyueqincezhuang012"), new SoundEvent(new ResourceLocation("primogemcraft", "liyueqincezhuang012")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "mengdeyewai011"), new SoundEvent(new ResourceLocation("primogemcraft", "mengdeyewai011")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "daoqigantiancun013"), new SoundEvent(new ResourceLocation("primogemcraft", "daoqigantiancun013")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "xumimolazhuang"), new SoundEvent(new ResourceLocation("primogemcraft", "xumimolazhuang")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "sanyuehee"), new SoundEvent(new ResourceLocation("primogemcraft", "sanyuehee")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "sanyueennnn"), new SoundEvent(new ResourceLocation("primogemcraft", "sanyueennnn")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "sanyueexixi"), new SoundEvent(new ResourceLocation("primogemcraft", "sanyueexixi")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "qiwusunhuai066"), new SoundEvent(new ResourceLocation("primogemcraft", "qiwusunhuai066")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "taikongmanbuyinpin"), new SoundEvent(new ResourceLocation("primogemcraft", "taikongmanbuyinpin")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "yanziyueliang"), new SoundEvent(new ResourceLocation("primogemcraft", "yanziyueliang")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "xiaoguanzi"), new SoundEvent(new ResourceLocation("primogemcraft", "xiaoguanzi")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "shilianyinpin"), new SoundEvent(new ResourceLocation("primogemcraft", "shilianyinpin")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "kaixiang"), new SoundEvent(new ResourceLocation("primogemcraft", "kaixiang")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "qianye_shijia"), new SoundEvent(new ResourceLocation("primogemcraft", "qianye_shijia")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "qianye_chufa"), new SoundEvent(new ResourceLocation("primogemcraft", "qianye_chufa")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "zhapian"), new SoundEvent(new ResourceLocation("primogemcraft", "zhapian")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "gongzhuxinghua"), new SoundEvent(new ResourceLocation("primogemcraft", "gongzhuxinghua")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "tashanglvtu"), new SoundEvent(new ResourceLocation("primogemcraft", "tashanglvtu")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "djpp1"), new SoundEvent(new ResourceLocation("primogemcraft", "djpp1")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "djpp02"), new SoundEvent(new ResourceLocation("primogemcraft", "djpp02")));
		REGISTRY.put(new ResourceLocation("primogemcraft", "wu_sheng"), new SoundEvent(new ResourceLocation("primogemcraft", "wu_sheng")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
