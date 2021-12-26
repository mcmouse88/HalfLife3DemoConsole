package com.company.monster;

import com.company.Monster;

public class Gargantua extends Monster {
    private final int PROB_GARGANTUA = 80;

    public Gargantua() {
        super(800, 300, "Гаркантюа");
        probMonster = PROB_GARGANTUA;
    }

    @Override
    public void getDamage() {
        super.getDamage();
        System.out.println("Уууууууу");
    }

    /*@Override
    public int damageMonster() {
        return attack;
    }*/
}
