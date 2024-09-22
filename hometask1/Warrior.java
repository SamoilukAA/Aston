package org.example.hometask1;

public class Warrior extends Hero {
    static final int DAMAGE = 70;
    static final int CRIT = 300;

    public Warrior(String name, int health) {
        super(name, health);
    }

    public void heavyBlow(Enemy enemy){
        System.out.println("The Warrior " + name + " attacks the enemy with superpower");
        enemy.takeDamage(CRIT);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior " + name + " attacks the enemy");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void superAttack(Enemy enemy) {
        heavyBlow(enemy);
    }
}
