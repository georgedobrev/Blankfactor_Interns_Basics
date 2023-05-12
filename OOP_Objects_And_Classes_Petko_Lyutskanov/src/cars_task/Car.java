package cars_task;

import java.util.ArrayList;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    ArrayList<Tyre> tires;

    public Car() {
    }

    public Car(String model, Engine engine, Cargo cargo, ArrayList<Tyre> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Tyre> getTires() {
        return tires;
    }

    public void setTires(ArrayList<Tyre> tires) {
        this.tires = tires;
    }
}
