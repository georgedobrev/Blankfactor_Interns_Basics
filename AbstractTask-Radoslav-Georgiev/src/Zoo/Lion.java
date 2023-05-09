package Zoo;

public class Lion extends InfoAboutTheAnimal implements Mammals{


    public Lion(boolean isVenomous, String name, int years) {
        super(isVenomous, name, years);
    }

    @Override
    public void giveBirth() {
        System.out.println("Lion gives birth like humans");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "isVenomous=" + isVenomous +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
