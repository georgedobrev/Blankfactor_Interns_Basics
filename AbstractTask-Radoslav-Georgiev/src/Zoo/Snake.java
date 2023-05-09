package Zoo;

public class Snake extends InfoAboutTheAnimal implements Reptiles{
    public Snake(boolean isVenomous, String name, int years) {
        super(isVenomous, name, years);
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
