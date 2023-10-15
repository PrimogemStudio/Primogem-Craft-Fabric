
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Gongjixiangzengyi_shuxingProcedure;

public class GongjitishengMobEffect extends MobEffect {
	public GongjitishengMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1266889);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.gongjitisheng";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Gongjixiangzengyi_shuxingProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
