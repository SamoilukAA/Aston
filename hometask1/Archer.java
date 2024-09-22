package org.example.hometask1;

public class Archer extends Hero {
    static final int DAMAGE = 50;
    static final int CRIT = 250;

    public Archer(String name, int health) {
        super(name, health);
    }

    private void fireArrow(Enemy enemy){
        System.out.println("The Archer " + name + " attacks the enemy with superpower");
        enemy.takeDamage(CRIT);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Archer " + name + " attacks the enemy");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void superAttack(Enemy enemy) {
        fireArrow(enemy);
    }


}
