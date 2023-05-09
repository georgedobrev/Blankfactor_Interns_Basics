package Zoo;

public class Shark extends InfoAboutTheAnimal implements Fish{


    public Shark(boolean isVenomous, String name, int years) {
        super(isVenomous, name, years);
    }

    @Override
    public void swim() {
        System.out.println("The way sharks move is by swimming");

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
