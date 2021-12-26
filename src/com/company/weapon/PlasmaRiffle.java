package com.company.weapon;

import com.company.Weapon;

public class PlasmaRiffle extends Weapon {
    public PlasmaRiffle() {
        damage = 300;
        name = "Плазменная пушка";
    }

    @Override
    public void shot() {
        System.out.println("Птиу-Птиу");
    }
}
