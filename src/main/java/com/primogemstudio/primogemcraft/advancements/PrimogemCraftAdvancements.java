package com.primogemstudio.primogemcraft.advancements;

import com.primogemstudio.primogemcraft.advancements.criterions.GachaFiveStarTriggeredCriterion;
import com.primogemstudio.primogemcraft.advancements.criterions.WorldCollapsingCriterion;
import net.minecraft.advancements.CriteriaTriggers;

public class PrimogemCraftAdvancements {
    public static final WorldCollapsingCriterion WORLD_COLLAPSING = CriteriaTriggers.register(new WorldCollapsingCriterion());
    public static final GachaFiveStarTriggeredCriterion GACHA_FIVE_STAR_TRIGGERED = CriteriaTriggers.register(new GachaFiveStarTriggeredCriterion());
    public static void init() {
    }
}
