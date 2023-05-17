package oop_Abstraction_And_Inheritance;

public class Hero extends Character implements Healable, Attackable {
    private int experience;

    public Hero(String name, int health, int strength, int level, int experience) {
        super(name, health, strength, level);
        this.experience = experience;
    }
    public Hero() {
        super("Hero", 100, 100, 1);
        this.experience = 0;
    }


    public void levelUp() {
        setLevel(getLevel() + 1);
        System.out.println("Level up!");
        this.experience = 0;
        setHealth(getLevel() * 50);
        setStrength(getStrength() + (int) (Math.random() * 4) + 3);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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
        int currentHealth = getHealth();
        int newHealth = currentHealth - damage;
        setHealth(newHealth);
        System.out.println(getName() + " took " + damage + " damage!");
        if (newHealth <= 0) {
            System.out.println(getName() + " has been defeated!");
        }
    }

    @Override
    public void heal(int amount) {
        int currentHealth = getHealth();
        int newHealth = currentHealth + amount;
        setHealth(newHealth);
        System.out.println(getName() + " healed " + amount + " points!");
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Health: " + getHealth() + "\n" +
                "Strength: " + getStrength() + "\n" +
                "Experience: " + experience + "\n" +
                "Level: " + getLevel();
    }
}