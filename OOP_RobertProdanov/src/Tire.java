public class Tire {

    private int tireAge;
    private double tirePressure;

    public Tire(double tirePressure, int tireAge) {
        this.tireAge = tireAge;
        this.tirePressure = tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "tireAge=" + tireAge +
                ", tirePressure=" + tirePressure +
                '}';
    }
}
