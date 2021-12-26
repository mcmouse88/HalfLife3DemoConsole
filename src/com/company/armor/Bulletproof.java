package com.company.armor;

import com.company.Armor;

public class Bulletproof extends Armor {
    private final int PERCENT_GUARD = 20;

    public Bulletproof() {
        super("Бронежилет");
        percentGuard = PERCENT_GUARD;
    }
}
