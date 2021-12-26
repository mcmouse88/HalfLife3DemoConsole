package com.company.monster;

import com.company.Monster;

public class HeadCrab extends Monster {
    private final int PROB_HEADCRAB = 50;
    public HeadCrab() {
        super(50, 50, "ХэдКраб");
        probMonster = PROB_HEADCRAB;
    }

    @Override
    public void getDamage() {
        super.getDamage();
        System.out.println("хррррррр");
    }

    /*@Override
    public int damageMonster() {
        return attack;
    }*/
}
