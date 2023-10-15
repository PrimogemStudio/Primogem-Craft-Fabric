
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.ZLetouchengfahenshuxingProcedure;

public class LetoudechengfaMobEffect extends MobEffect {
	public LetoudechengfaMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39169);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.letoudechengfa";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ZLetouchengfahenshuxingProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
