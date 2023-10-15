
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Yimuguo_shuxingProcedure;

public class LinzhongMobEffect extends MobEffect {
	public LinzhongMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.linzhong";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Yimuguo_shuxingProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
