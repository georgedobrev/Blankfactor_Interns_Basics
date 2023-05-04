package CarTracking;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    List<Tire> myTires = new ArrayList<Tire>(4);

    Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {

        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.myTires = tires;

    }
}
