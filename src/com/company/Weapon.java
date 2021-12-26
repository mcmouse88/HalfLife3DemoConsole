package com.company;

public class Weapon {
    protected int damage;
    protected String name;

    public void shot() {
        System.out.println("Звук выстрела");
    }

    public int damagePlayer() {
        return damage;
    }

}
