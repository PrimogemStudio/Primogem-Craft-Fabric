package com.primogemstudio.primogemcraft.interfaces;

import com.primogemstudio.primogemcraft.effects.instances.PastMobEffect;

public interface PastAble {
    void setPastInfo(PastMobEffect.PastInfo info);

    PastMobEffect.PastInfo getPastInfo();
}
