package com.company;

public class Monster {
    protected int health;
    protected int attack;
    protected String name;
    protected int probMonster;

    public Monster(int health, int attack, String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }

    public void getDamage() {
        System.out.print(name + ": ");
    }
    public int damageMonster (Monster monster) {
        if (probablyMonster(probMonster)) {
            return attack;
        }
        else {
            System.out.println(monster.getName() + " промахивается");
            return 0;
        }
    }

    public String getName() {
        return name;
    }
    public int getHealth(){
        return health;
    }
    public boolean probablyMonster(int percents) {
        return (Math.random() < percents / 100.);
    }
}
