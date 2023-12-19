package com.primogemstudio.primogemcraft.interfaces;

import com.primogemstudio.primogemcraft.effects.instances.PastMobEffect;

public interface EntityExtension {
    void setPastInfo(PastMobEffect.PastInfo info);

    PastMobEffect.PastInfo getPastInfo();

    void setDawnsongValue(int value);
    int getDawnsongValue();
}
