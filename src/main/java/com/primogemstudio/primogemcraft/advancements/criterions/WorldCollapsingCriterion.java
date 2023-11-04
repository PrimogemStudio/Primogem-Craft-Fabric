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

public class WorldCollapsingCriterion extends SimpleCriterionTrigger<WorldCollapsingCriterion.WorldCollapsingCriterionTrigger> {
    public static final ResourceLocation ID = new ResourceLocation(MOD_ID, "world_collapsing");
    protected @NotNull WorldCollapsingCriterionTrigger createInstance(JsonObject json, ContextAwarePredicate predicate, DeserializationContext deserializationContext) {
        return new WorldCollapsingCriterionTrigger();
    }

    public @NotNull ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer player) {
        trigger(player, tr -> true);
    }

    public static class WorldCollapsingCriterionTrigger extends AbstractCriterionTriggerInstance {

        public WorldCollapsingCriterionTrigger() {
            super(ID, ContextAwarePredicate.ANY);
        }
    }
}
