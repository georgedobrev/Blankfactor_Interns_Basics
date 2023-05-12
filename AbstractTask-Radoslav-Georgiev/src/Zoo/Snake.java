package Zoo;

public class Snake extends InfoAboutTheAnimal implements Reptiles{
    private String name;
    private int years;
    public Snake(boolean isVenomous, String name, int years) {
        super(isVenomous);
        this.name = name;
        this.years= years;
    }
    @Override
    public boolean isVenomous() {
        return super.isVenomous();
    }
    @Override
    public void layEggs() {
        System.out.println("Snakes lay eggs");

    }

    @Override
    public String toString() {
        return "Snake{" +
                "isVenomous=" + isVenomous +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
