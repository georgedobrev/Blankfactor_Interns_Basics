public class Main {
    public static void main(String[] args) {

        //Diablo Remake with 2 moves per turn

        Warrior w1 = new Warrior("Gronzo", 500, 500, 50);
        Healer h1 = new Healer("Vondok", 350, 350, 35, 60);

        Warrior w2 = new Warrior("Rangnarok", 500, 500, 50);
        Healer h2 = new Healer("Bondo", 350, 350, 35, 60);

        w1.attack(w2);
        w1.attack(h2);

        h2.heal(w2);
        w2.attack(h1);

        w1.heavyAttack(w2);
        w1.attack(h2);

        h2.heavyHeal(w2);
        w2.attack(h1);

        System.out.println("Heroes stats after 2 turns");
        System.out.println(w1.returnInfo());
        System.out.println(h1.returnInfo());
        System.out.println(w2.returnInfo());
        System.out.println(h2.returnInfo());

    }
}