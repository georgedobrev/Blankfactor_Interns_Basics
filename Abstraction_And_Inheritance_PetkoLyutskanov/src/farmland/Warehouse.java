package farmland;

public class Warehouse {
    private double capacity;
    private double currentCapacity;

    public Warehouse() {
    }

    public Warehouse(double capacity, double currentCapacity) {
        this.capacity = capacity;
        this.currentCapacity = currentCapacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
