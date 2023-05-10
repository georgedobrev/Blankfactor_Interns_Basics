public class Boat extends Vehicle implements Startable, Stoppable{
    private double maxSpeed;

    public Boat(String brand, int enginePower, double fuelConsumption, double maxSpeed) {
        super(brand, enginePower, fuelConsumption);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }
}
