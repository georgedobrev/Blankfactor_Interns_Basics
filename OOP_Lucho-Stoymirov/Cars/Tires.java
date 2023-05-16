public class Tires {
    private double pressure;
    private int age;

    public Tires(double Pressure, int age){
        this.pressure = Pressure;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
