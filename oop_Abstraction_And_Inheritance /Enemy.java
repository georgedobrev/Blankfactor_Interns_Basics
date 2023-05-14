package oop_Abstraction_And_Inheritance;

public class Enemy extends Character implements Attackable{

    public Enemy(String name, int health, int strength, int level) {
        super(name, health, strength, level);
    }

    public Enemy() {
        super("Enemy", 100, 100, 1);
    }

    @Override
    public int getAttackStrength() {
        return getStrength();
    }

    @Override
    public void attack(Attackable target) {
        int damage = getStrength();
        target.takeDamage(damage);

    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        if (getHealth() <= 0) {
            System.out.println(getName() + " has been defeated!");
        }
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Health: " + getHealth() + "\n" +
                "Strength: " + getStrength() + "\n" +
                "Level: " + getLevel();
    }
}
