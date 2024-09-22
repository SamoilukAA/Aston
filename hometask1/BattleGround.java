package org.example.hometask1;

import java.util.ArrayList;
import java.util.Random;

public class BattleGround {
    static final int maxHealth = 1000;

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        heroes.add(new Warrior("Warrior 1", maxHealth));
        heroes.add(new Warrior("Warrior 2", maxHealth));
        heroes.add(new Warrior("Warrior 3", maxHealth));
        heroes.add(new Archer("Archer 1", maxHealth));
        heroes.add(new Archer("Archer 2", maxHealth));
        heroes.add(new Mage("Mage 1", maxHealth));
        heroes.add(new Mage("Mage 2", maxHealth));

        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        enemies.add(new Zombie(maxHealth));
        enemies.add(new Zombie(maxHealth));
        enemies.add(new Zombie(maxHealth));
        enemies.add(new Dragon(maxHealth));
        enemies.add(new Dragon(maxHealth));

        int turnToBeat = 0;
        int chanceToHeroSuperpower = 0;
        int chanceToEnemySuperpower = 0;

        Random rand = new Random();

        while(!enemies.isEmpty() && !heroes.isEmpty()) {
            int enemy = rand.nextInt(enemies.size());
            int hero = rand.nextInt(heroes.size());

            if (turnToBeat == 0) {
                if (chanceToHeroSuperpower == 3) {
                    heroes.get(hero).superAttack(enemies.get(enemy));
                    chanceToHeroSuperpower = 0;
                } else {
                    heroes.get(hero).attackEnemy(enemies.get(enemy));
                    chanceToHeroSuperpower++;
                }
                if (!enemies.get(enemy).isAlive()) {
                    enemies.remove(enemy);
                }
                turnToBeat = 1;
            } else {
                if (chanceToEnemySuperpower == 10) {
                    enemies.get(enemy).superAttack(heroes.get(hero));
                    chanceToEnemySuperpower = 0;
                } else {
                    enemies.get(enemy).attackHero(heroes.get(hero));
                    chanceToEnemySuperpower++;
                }
                if (!heroes.get(hero).isAlive()) {
                    heroes.remove(hero);
                }
                turnToBeat = 0;
            }
        }

        if (heroes.isEmpty()) {
            System.out.println("The enemies have won...");
        }
        if (enemies.isEmpty()) {
            System.out.println("The heroes have won!");
        }
    }
}
