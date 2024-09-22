package org.example.hometask1;

public class Mage extends Hero {
    static final int DAMAGE = 30;
    static final int CRIT = 240;

    public Mage(String name, int health) {
        super(name, health);
    }

    private void iceBall(Enemy enemy){
        System.out.println("The Mage " + name + " attacks the enemy with superpower");
        enemy.takeDamage(CRIT);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mage " + name + " attacks the enemy");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void superAttack(Enemy enemy) {
        iceBall(enemy);
    }
}
