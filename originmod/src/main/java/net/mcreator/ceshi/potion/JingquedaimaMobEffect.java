
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Daima_xiaoguoProcedure;

public class JingquedaimaMobEffect extends MobEffect {
	public JingquedaimaMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.jingquedaima";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Daima_xiaoguoProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
