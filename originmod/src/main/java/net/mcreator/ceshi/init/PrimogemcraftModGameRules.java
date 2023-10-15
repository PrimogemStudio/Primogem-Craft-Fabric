
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimogemcraftModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> GUIZEMOYINSHENSHENGCHENGBEILV = GameRules.register("guizemoyinshenshengchengbeilv", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> GUIZEMOYINSHENSHENGMINGZHI = GameRules.register("guizemoyinshenshengmingzhi", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(256));
	public static final GameRules.Key<GameRules.BooleanValue> GUIZEYUANSHISHENGCHENG = GameRules.register("guizeyuanshishengcheng", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
}
