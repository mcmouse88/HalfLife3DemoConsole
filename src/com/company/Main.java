package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Player gordon = new Player();
            Opponent opponent = new Opponent();
            System.out.format("Всего доступно %d монстров" + " выберите себе противника%n", opponent.getSlotCount());
            int slotMonster = scanner.nextInt() - 1;
            System.out.println("Против Вас " + opponent.getMonsterName(slotMonster));
            int healthMonster = opponent.healthLowMonster(slotMonster);
            int healthGordon = gordon.getHealth();
            int[] gordonTreatment = gordon.getTreatment().clone();
            System.out.println("Выберите броню, чтобы защитить себя от атак монстра");
            System.out.format("Всего доступно %d вида брони, либо нажмите %d, чтобы не одевать броню%n",
                    gordon.getSlotsArmor(), gordon.getSlotsArmor() + 1);
            int slotArmor = scanner.nextInt() - 1;
            System.out.println("Вы выбрали " + gordon.getArmorName(slotArmor));
            while (true) {
                System.out.format("У %s %d слотов с оружием,"
                                + " введите номер, чтобы выстрелить,"
                                + " -1 чтобы сбежать%n",
                        gordon.getName(), gordon.getSlotsCount()
                );
                int slot = scanner.nextInt() - 1;
                if (slot == -2) {
                    System.out.println("Вы жалкий трус, Гордон Фримен никогда не бежал от опасности");
                    break;
                }
                System.out.println("Вы выбрали: " + gordon.getWeaponName(slot));
                gordon.shotWithWeapon(slot);
                int dmg = gordon.damageGordon(slot);
                if (dmg != 0) {
                    opponent.getDamageMonster(slotMonster);
                    healthMonster -= dmg;
                }
                if (healthMonster <= 0) {
                    System.out.println(opponent.getMonsterName(slotMonster) + " повержен!");
                    break;
                }
                System.out.println("Здоровье " + opponent.getMonsterName(slotMonster) + " " + healthMonster + " xp!");
                System.out.println(opponent.getMonsterName(slotMonster) + " наносит ответный удар");
                healthGordon -= (opponent.monsterStrikeBack(slotMonster) * (1 - gordon.armorGordon(slotArmor)));
                if (healthGordon <= 0) {
                    System.out.println("Вы погибли!!!");
                    break;
                }
                if (healthGordon <= 200) {
                    System.out.println("Выше здоровье всего " + healthGordon + " хр, рекомендую Вам принять лекарство");
                    int checkTreatment = healthGordon;
                    System.out.println("Чтобы принять лекарство нажмите \"1\", чтобы продолжить игру нажмите \"2\"");
                    int choose = scanner.nextInt();
                    if (choose == 1) {
                        healthGordon += gordon.healthRecovery(gordonTreatment);
                        System.out.format("В инвентаре осталось %d капсулы для лечения!%n", gordon.countTreatment(gordonTreatment));
                    } else if (choose == 2) {
                        continue;
                    } else {
                        System.out.println("Неверная команда, Вы не получии лечение");
                        continue;
                    }
                    if (checkTreatment == healthGordon) {
                        System.out.println("Лекарство закончилось, рассчитывайте только на свои силы");
                    }
                }
                System.out.println("Здоровье " + gordon.getName() + " " + healthGordon + " xp!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы выбрали неверное значение");
        }
        System.out.println("Game over!");
    }
}
