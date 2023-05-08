public class Healer extends Entity implements HealerInterface{

    private String name;
    private int health;
    private int armour;

    private int damage;
    private int healPoints;

    private boolean isDefeated = false;

    private int heavyHealCounter = 0;

    public Healer(String name, int health, int armour, int damage, int healPoints) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.damage = damage;
        this.healPoints = healPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getDamage() {
        return damage;
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

    public int getHeavyHealCounter() {
        return heavyHealCounter;
    }

    public void setHeavyHealCounter(int heavyHealCounter) {
        this.heavyHealCounter = heavyHealCounter;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public int attack() {
        if(!isDefeated) {
            return this.getDamage();
        }else
            System.out.println("This Healer is defeated. He cant do damage!");
        return 0;
    }

    @Override
    public void receiveDamage(int damage) {
        this.setHealth(this.getHealth() - damage);

        if (this.getArmour() >=(damage / 2)) {
            this.setArmour(this.getArmour() - (damage / 2));
        }

        if(this.getHealth() <=0){
            System.out.println(this.getName() + " is defeated");
            this.setDefeated(true);
        }

    }



    @Override
    public void heal(Entity entity) {
        if(!isDefeated) {
            entity.setHealth(entity.getHealth() + this.getHealPoints());
        }else
            System.out.println("This Healer is defeated. He cant heal!");

    }

    @Override
    public void heavyHeal(Entity entity) {
        if(!isDefeated) {
            entity.setHealth(entity.getHealth() + this.getHealPoints()*2);
        }else
            System.out.println("This Healer is defeated. He cant heal!");

    }
}
