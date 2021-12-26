package com.company.weapon;

import com.company.Weapon;

public class Crossbow extends Weapon {
    public Crossbow() {
        damage = 80;
        name = "Арбалет";
    }

    @Override
    public void shot() {
        System.out.println("Жжжик");
    }
}
