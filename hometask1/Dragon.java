package org.example.hometask1;

public class Dragon extends Enemy {
    static final int DAMAGE = 90;
    static final int FIRE = 200;

    public Dragon(int health) {
        super(health);
    }

    private void fieryBreath(Hero hero) {
        System.out.println("The Dragon attacks the enemy with fiery breath");
        hero.takeDamage(FIRE);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("The Dragon attacks the enemy");
        hero.takeDamage(DAMAGE);
    }

    @Override
    public void superAttack(Hero hero) {
        fieryBreath(hero);
    }
}
