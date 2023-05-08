public class Main {
    public static void main(String[] args){

        Warrior w1 = new Warrior("Gronzo", 500, 500, 50);
        Healer h1 = new Healer("Vondok", 350,350,35,60);

        h1.heavyHeal(w1);
        System.out.println(w1.getHealth());

    }
}