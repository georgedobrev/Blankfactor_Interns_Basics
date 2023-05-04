package CarCargoTask;

public class Cargo {
    private double weight;
    private String type;

    public Cargo(double weight, String type){
        this.type = type;
        this.weight = weight;
    }

    public Cargo(){}

    public double getCargoWeight() {
        return weight;
    }

    public void setCargoWeight(double weight) {
        this.weight = weight;
    }

    public String getCargoType() {
        return type;
    }

    public void setCargoType(String type) {
        this.type = type;
    }
}
