package com.primogemstudio.primogemcraft.modprotocols;

import net.hacker.genshincraft.element.shadow.Element;
import net.hacker.genshincraft.element.shadow.ElementDamageSource;
import net.minecraft.world.entity.Entity;

public final class GenshinCraftProtocol implements AbstractModProtocol {
    GenshinCraftProtocol() {
    }

    public void onGachaLightningBolt(Entity entity) {
        var element = Element.fromType(Element.Type.Electro, 1, Element.getDelta(1));
        var es = new ElementDamageSource(entity.damageSources().lightningBolt(), element).setCooldown(true);
        entity.hurt(es, 162);
    }
}
