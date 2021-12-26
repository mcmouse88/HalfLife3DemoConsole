package com.company;

import com.company.monster.Barnacle;
import com.company.monster.Gargantua;
import com.company.monster.HeadCrab;
import com.company.monster.Zombie;

public class Opponent {
    private Monster[] monsterSlots;

    public Opponent() {
        monsterSlots = new Monster[]{
                new HeadCrab(),
                new Barnacle(),
                new Zombie(),
                new Gargantua()
        };
    }

    public int getSlotCount(){
        return monsterSlots.length;
    }
    public String getMonsterName(int slot) {
        return monsterSlots[slot].name;
    }

    public void getDamageMonster (int slot) {
        Monster monster = monsterSlots[slot];
        monster.getDamage();
    }

    public int healthLowMonster(int slot) {
        return monsterSlots[slot].getHealth();
    }

    public int monsterStrikeBack(int slot) {
        return monsterSlots[slot].damageMonster(monsterSlots[slot]);
    }
}
