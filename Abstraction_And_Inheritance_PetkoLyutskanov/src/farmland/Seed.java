package farmland;

public abstract class Seed implements Harvestable, Plantable {

    int seedSize;
    double weight;
    String colour;

    public Seed() {
    }

    public Seed(int seedSize, double weight, String colour) {
        this.seedSize = seedSize;
        this.weight = weight;
        this.colour = colour;
    }
}
