package org.example.hometask1;

public abstract class Enemy implements Mortal {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackHero(Hero hero);
    public abstract void superAttack(Hero hero);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
