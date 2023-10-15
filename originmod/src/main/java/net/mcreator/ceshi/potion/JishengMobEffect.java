
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.JijishengxiaoguoProcedure;
import net.mcreator.ceshi.procedures.ChongwangjueshanhaiProcedure;

public class JishengMobEffect extends MobEffect {
	public JishengMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4756225);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.jisheng";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JijishengxiaoguoProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ChongwangjueshanhaiProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
