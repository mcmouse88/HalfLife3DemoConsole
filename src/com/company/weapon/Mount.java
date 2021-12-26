package com.company.weapon;

import com.company.Weapon;

public class Mount extends Weapon {
    public Mount() {
        damage = 30;
        name = "Монтировка";
    }
    @Override
    public void shot() {
        System.out.println("Клац-Клац");
    }
}
