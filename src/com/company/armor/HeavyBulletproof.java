package com.company.armor;

import com.company.Armor;

public class HeavyBulletproof extends Armor {
    private final int PERCENT_GUARD = 25;

    public HeavyBulletproof() {
        super("Тяжелый бронежилет");
        percentGuard = PERCENT_GUARD;
    }
}
