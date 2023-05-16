public class Cargo {
    private int weight;
    private String type;

    public Cargo(int Weight, String Type){
        this.weight = Weight;
        this.type = Type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
