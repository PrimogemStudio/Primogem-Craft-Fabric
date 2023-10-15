
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.GouyukaishiProcedure;
import net.mcreator.ceshi.procedures.Gouyu_shuxingProcedure;

public class GouyuMobEffect extends MobEffect {
	public GouyuMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1878800);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.gouyu";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GouyukaishiProcedure.execute(entity.level, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Gouyu_shuxingProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
