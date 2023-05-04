package CarCargoTask;

public class Tire {
    private double pressure;
    private int age;

    public Tire(double pressure, int age){
        this.age = age;
        this.pressure = pressure;
    }
    public Tire(){}

    public double getTirePressure() {
        return pressure;
    }

    public void setTirePressure(double pressure) {
        this.pressure = pressure;
    }

    public int getTireAge() {
        return age;
    }

    public void setTireAge(int age) {
        this.age = age;
    }
}
