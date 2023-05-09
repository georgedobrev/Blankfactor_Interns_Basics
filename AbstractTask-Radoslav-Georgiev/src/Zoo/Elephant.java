package Zoo;

public class Elephant extends InfoAboutTheAnimal implements Mammals  {


    public Elephant(boolean isVenomous, String name, int years) {
        super(isVenomous, name, years);
    }

    public void giveBirth() {
        System.out.println("Malls give birth like humans");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "isVenomous=" + isVenomous +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
