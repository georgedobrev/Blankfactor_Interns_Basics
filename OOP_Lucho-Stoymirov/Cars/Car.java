public class Car {
    private String model;
    private Engine engine;

    private Cargo cargo;
    private Tires[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tires[] tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public Tires[] getTires() {
        return tires;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTires(Tires[] tires) {
        this.tires = tires;
    }
}
