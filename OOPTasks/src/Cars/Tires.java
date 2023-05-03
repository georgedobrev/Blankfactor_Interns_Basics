package Cars;

public class Tires {

    private double tirePressure;
    private int tireAge;

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public Tires(double tirePressure, int tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "tirePressure=" + tirePressure +
                ", tireAge=" + tireAge +
                '}';
    }
}