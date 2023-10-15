
package net.mcreator.ceshi.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LengquezhongguizhongjuMobEffect extends MobEffect {
	public LengquezhongguizhongjuMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.lengquezhongguizhongju";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
