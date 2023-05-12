package Cars;

public class Cargo {
    private int weight;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getCargoType() {
        return this.type;
    }

    public int getWeight() {
        return this.weight;
    }
}