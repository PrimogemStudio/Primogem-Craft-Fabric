
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Feixing_shuxinG_2Procedure;
import net.mcreator.ceshi.procedures.Feixing_kaishiProcedure;

public class FeixingMobEffect extends MobEffect {
	public FeixingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.feixing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Feixing_kaishiProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Feixing_shuxinG_2Procedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
