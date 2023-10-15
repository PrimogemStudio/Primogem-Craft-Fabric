
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.Fengrao_shuxing_4Procedure;
import net.mcreator.ceshi.procedures.Fengrao_lizishuxingProcedure;

public class FengraoMobEffect extends MobEffect {
	public FengraoMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751046);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.fengrao";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Fengrao_lizishuxingProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Fengrao_shuxing_4Procedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
