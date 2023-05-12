package Zoo;

public class Spider extends InfoAboutTheAnimal implements Reptiles{
    private String name;
    private int years;
    public Spider(boolean isVenomous, String name, int years) {
        super(isVenomous);
        this.name = name;
        this.years = years;

    }



    @Override
    public void layEggs() {
        System.out.println("Spiders lay eggs");

    }
    @Override
    public boolean isVenomous() {
        return super.isVenomous();
    }
    @Override
    public String toString() {
        return "Spider{" +
                "isVenomous=" + isVenomous +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
