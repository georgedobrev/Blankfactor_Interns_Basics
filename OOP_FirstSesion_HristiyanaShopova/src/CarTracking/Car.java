package CarTracking;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    List<Tire> tires = new ArrayList<Tire>(4);

    Car(Engine engine, Cargo cargo, Tire tire) {

       engine = engine;

    }
}
