package Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {


    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tires[] tires = new Tires[4];

    public Car(String model, Engine engine, Cargo cargo, Tires[] tires) {
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

    public Tires[] getTires() {
        return tires;
    }

    public void setTires(Tires[] tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", cargo=" + cargo +
                ", tires=" + Arrays.toString(tires) +
                '}';
    }
}
