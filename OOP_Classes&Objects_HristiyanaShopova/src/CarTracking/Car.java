package CarTracking;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;

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

    public List<Tire> getMyTires() {
        return myTires;
    }

    public void setMyTires(List<Tire> myTires) {
        this.myTires = myTires;
    }

    List<Tire> myTires = new ArrayList<Tire>(4);

    Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {

        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.myTires = tires;

    }


}
