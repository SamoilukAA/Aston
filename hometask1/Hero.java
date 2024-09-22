package org.example.hometask1;

public abstract class Hero implements Mortal {
    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void superAttack(Enemy enemy);
}
