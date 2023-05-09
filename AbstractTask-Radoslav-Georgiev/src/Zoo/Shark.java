package Zoo;

public class Shark extends InfoAboutTheAnimal implements Fish{
    private String name;
    private int years;

    public Shark(boolean isVenomous, String name, int years) {
        super(isVenomous);
        this.name = name;
        this.years = years;
    }

    @Override
    public void swim() {
        System.out.println("The way sharks move is by swimming");

    }

    @Override
    public boolean isVenomous() {
        return super.isVenomous();
    }

    @Override
    public String toString() {
        return "Shark{" +
                "isVenomous=" + isVenomous +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
