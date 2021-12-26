package com.company.monster;

import com.company.Monster;

public class Zombie extends Monster {
    private final int PROB_ZOMBIE = 70;
    public Zombie() {
        super(400, 150, "Зомби");
        probMonster = PROB_ZOMBIE;
    }

    @Override
    public void getDamage() {
        super.getDamage();
        System.out.println("Аааааааа");
    }
}
