package Zoo;

public class Elephant extends InfoAboutTheAnimal implements Mammals  {

    private String name;
   private int years;
    public Elephant(boolean isVenomous, String name, int years) {
        super(isVenomous);
        this.name = name;
        this.years = years;
    }

    public void giveBirth() {
        System.out.println("Malls give birth like humans");
    }

    @Override
    public boolean isVenomous() {
        return super.isVenomous();
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
