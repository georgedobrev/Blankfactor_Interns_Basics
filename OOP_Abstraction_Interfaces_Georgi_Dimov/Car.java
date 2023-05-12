public class Car extends Vehicle implements Startable, Stoppable{
    private int numOfSeats;
    public Car(String brand, int enginePower, double fuelConsumption, int numOfSeats) {
        super(brand, enginePower, fuelConsumption);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}
