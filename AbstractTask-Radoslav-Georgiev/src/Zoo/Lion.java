package Zoo;

public class Lion extends InfoAboutTheAnimal implements Mammals{

    private String name;
    private int years;
    public Lion(boolean isVenomous, String name, int years) {
        super(isVenomous);
        this.name = name;
        this.years = years;
    }

    @Override
    public void giveBirth() {
        System.out.println("Lion gives birth like humans");
    }
    @Override
    public boolean isVenomous() {
        return super.isVenomous();
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
