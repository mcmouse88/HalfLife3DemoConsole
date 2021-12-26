package com.company.monster;

import com.company.Monster;

public class Barnacle extends Monster {
    private final int PROB_BARNACLE = 60;
    public Barnacle() {
        super(100, 100, "Барнакл");
        probMonster = PROB_BARNACLE;
    }

    @Override
    public void getDamage() {
        super.getDamage();
        System.out.println("Грррррр");
    }

    /*@Override
    public int damageMonster() {
        return attack;
    }*/
}
