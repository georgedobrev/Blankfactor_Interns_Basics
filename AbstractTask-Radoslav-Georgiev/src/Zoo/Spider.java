package Zoo;

public class Spider extends InfoAboutTheAnimal implements Reptiles{
    public Spider(boolean isVenomous, String name, int years) {
        super(isVenomous, name, years);
    }



    @Override
    public void layEggs() {
        System.out.println("Spiders lay eggs");

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
