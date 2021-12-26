package com.company;

import com.company.armor.*;
import com.company.weapon.*;

public class Player {
    private static final int SHOT_PROBABILITY = 70;
    private final String NAME = "Gordon Freeman";
    private Weapon[] weaponSlots;
    private Armor[] armorSlots;

    private int health;
    private int[] treatment = {1, 1, 1, 1, 1};

    public Player() {
        health = 500;
        weaponSlots = new Weapon[]{
                new Mount(),
                new HandGun(),
                new Crossbow(),
                new Shotgun(),
                new PlasmaRiffle(),
                new Bazooka()
        };

        armorSlots = new Armor[] {
                new LightBulletproof(),
                new Bulletproof(),
                new HeavyBulletproof(),
                new ArmorOfThousandTrue(),
                new NoArmor()
        };
    }

    public String getName() {
        return NAME;
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }
    public int getSlotsArmor() {
        return armorSlots.length - 1;
    }
    public String getWeaponName(int slot) {
        return weaponSlots[slot].name;
    }
    public String getArmorName(int slot) {
        return armorSlots[slot].name;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
    public int damageGordon(int slot) {
        if (probablyGordon(SHOT_PROBABILITY)) {
            System.out.println("Выстрел был точный");
            return weaponSlots[slot].damagePlayer();
        } else {
            System.out.println(NAME + " промахивается");
            return 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public int[] getTreatment() {
        return treatment;
    }

    public int healthRecovery(int[] treatment) {
        for (int i = 0; i < treatment.length; i++) {
            if (treatment[i] != 0) {
                treatment[i] = 0;
                return 300;
            }
            if(treatment[treatment.length - 1] == 0) {
                return 0;
            }
        }
        return healthRecovery(treatment);
    }
    public int countTreatment(int[] treatment) {
        int count = 0;
        for (int i : treatment) {
            if (i != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean probablyGordon(int percents) {
        return (Math.random() < percents / 100.);
    }

    public double armorGordon(int slot) {
        return armorSlots[slot].lowDamagePercent();
    }
}
