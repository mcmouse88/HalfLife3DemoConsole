package com.company.armor;

import com.company.Armor;

public class NoArmor extends Armor {
    private final int PERCENT_GUARD = 0;

    public NoArmor() {
        super("без брони");
        percentGuard = PERCENT_GUARD;
    }
}
