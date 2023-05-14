package oop_Abstraction_And_Inheritance;

public interface Attackable {

    int getAttackStrength();
    void attack(Attackable target);
    void takeDamage(int damage);


}
