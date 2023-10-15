
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.GuoqukaishiProcedure;
import net.mcreator.ceshi.procedures.Guoqu_jieshuProcedure;

public class GuoquMobEffect extends MobEffect {
	public GuoquMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -479233);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.guoqu";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GuoqukaishiProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Guoqu_jieshuProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
