package com.company.weapon;

import com.company.Weapon;

public class Shotgun extends Weapon {
    public Shotgun() {
        damage = 150;
        name = "Дробовик";
    }

    @Override
    public void shot() {
        System.out.println("Бах-Бах");
    }
}
