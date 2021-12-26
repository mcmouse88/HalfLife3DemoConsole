package com.company.weapon;

import com.company.Weapon;

public class HandGun extends Weapon {
    public HandGun() {
        damage = 50;
        name = "Пистолет";
    }

    @Override
    public void shot() {
        System.out.println("Пиф-Паф");
    }
}

