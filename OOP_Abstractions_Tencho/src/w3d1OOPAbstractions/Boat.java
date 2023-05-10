package w3d1OOPAbstractions;

public class Boat extends Vehicle implements isFloatable {
    private String brand;
    private String model;
    private int horsePower;
    private int torque;

    public Boat(String brand, String model, int horsePower, int torque) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.torque = torque;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void workingCorrectly() {
        System.out.println("System tests ran successful...");
    }

    public void floating() {
        System.out.println("No damage detected on the hull...");
    }

    public void startEngine() {
        System.out.println("Starting boat engine...");
    }


    public void turning() {
        System.out.println("Propeller working correctly...");
    }
}
