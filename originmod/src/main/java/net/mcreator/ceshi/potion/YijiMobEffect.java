
package net.mcreator.ceshi.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ceshi.procedures.YjsxProcedure;
import net.mcreator.ceshi.procedures.Yjsx2Procedure;

public class YijiMobEffect extends MobEffect {
	public YijiMobEffect() {
		super(MobEffectCategory.HARMFUL, -8123894);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.yiji";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		YjsxProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Yjsx2Procedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
