package com.company;

public class Armor {
    protected int percentGuard;
    protected String name;
    public Armor(String name) {
        this.name = name;
    }

    public double lowDamagePercent() {
        return (double)percentGuard / 100;
    }

    public String getName() {
        return name;
    }
}
