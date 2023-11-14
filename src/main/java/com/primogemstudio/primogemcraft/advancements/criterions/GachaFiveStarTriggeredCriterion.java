package com.primogemstudio.primogemcraft.advancements.criterions;

import com.google.gson.JsonObject;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

import static com.primogemstudio.primogemcraft.PrimogemCraftFabric.MOD_ID;

public class GachaFiveStarTriggeredCriterion extends SimpleCriterionTrigger<GachaFiveStarTriggeredCriterion.GachaFiveStarTriggeredCriterionTrigger> {
    public static final ResourceLocation ID = new ResourceLocation(MOD_ID, "gahca_five_star_trigger");

    protected @NotNull GachaFiveStarTriggeredCriterion.GachaFiveStarTriggeredCriterionTrigger createInstance(JsonObject json, ContextAwarePredicate predicate, DeserializationContext deserializationContext) {
        return new GachaFiveStarTriggeredCriterionTrigger();
    }

    public @NotNull ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer player) {
        trigger(player, a -> true);
    }

    public static class GachaFiveStarTriggeredCriterionTrigger extends AbstractCriterionTriggerInstance {
        public GachaFiveStarTriggeredCriterionTrigger() {
            super(ID, ContextAwarePredicate.ANY);
        }
    }
}
