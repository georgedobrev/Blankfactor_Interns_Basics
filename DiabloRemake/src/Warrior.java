public class Warrior extends Entity implements WarriorInterface {

    private String name;
    private int health;
    private int armour;

    private int damage;

    private boolean isDefeated = false;

    private int heavyAttackCounter = 0;

    public Warrior(String name, int health, int armour, int damage) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    public int getHeavyAttackCounter() {
        return heavyAttackCounter;
    }

    public void setHeavyAttackCounter(int heavyAttackCounter) {
        this.heavyAttackCounter = heavyAttackCounter;
    }

    @Override
    public void attack(Entity entity) {

        if(!isDefeated) {
            entity.setHealth(entity.getHealth()-this.getDamage());
        }else
            System.out.println("This Warrior is defeated. He cant do damage!");
    }

    @Override
    public int heavyAttack() {
        if(!isDefeated && this.getHeavyAttackCounter() <3) {
            this.setHeavyAttackCounter(this.getHeavyAttackCounter()+1);
            return this.getDamage()*2;
        }else
            System.out.println("This warrior is defeated. He cant do damage!");
        return 0;

    }
}
