
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Jijishengdefennu01Procedure;

public class JijishengchongdefennuMobEffect extends MobEffect {
	public JijishengchongdefennuMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2943466);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.jijishengchongdefennu";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Jijishengdefennu01Procedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
