package com.company.armor;

import com.company.Armor;

public class LightBulletproof extends Armor {
    private final int PERCENT_GUARD = 10;

    public LightBulletproof() {
        super("Легкий бронежилет");
        percentGuard = PERCENT_GUARD;
    }

}
