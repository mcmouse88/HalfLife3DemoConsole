package com.company.weapon;

import com.company.Weapon;

public class Bazooka extends Weapon {
    public Bazooka() {
        damage = 500;
        name = "Базука";
    }

    @Override
    public void shot() {
        System.out.println("Ба-Бах");
    }
}
