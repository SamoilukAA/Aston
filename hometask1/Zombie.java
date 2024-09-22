package org.example.hometask1;

public class Zombie extends Enemy {
    static final int DAMAGE = 65;
    static final int POISON = 120;
    boolean arised = true;

    public Zombie(int health) {
        super(health);
    }

    private void poisonousBite(Hero hero) {
        System.out.println("The Zombie attacks the enemy with poisonous bite");
        hero.takeDamage(POISON);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("The Zombie attacks the enemy");
        hero.takeDamage(DAMAGE);
    }

    @Override
    public void superAttack(Hero hero) {
        poisonousBite(hero);
    }

    @Override
    public boolean isAlive() {
        if (health <= 0 && arised) {
            health = BattleGround.maxHealth;
            arised = false;
        }
        return health > 0;
    }
}
