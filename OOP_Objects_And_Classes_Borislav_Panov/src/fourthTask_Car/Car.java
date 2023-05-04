package fourthTask_Car;

import java.util.ArrayList;
import java.util.List;

public class Car {
        String model;
        Engine engine;
        Cargo cargo;
        List<Tire> tires;

        public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType,
                   double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age,
                   double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
            this.model = model;
            this.engine = new Engine(engineSpeed, enginePower);
            this.cargo = new Cargo(cargoWeight, cargoType);
            this.tires = new ArrayList<>();
            this.tires.add(new Tire(tire1Pressure, tire1Age));
            this.tires.add(new Tire(tire2Pressure, tire2Age));
            this.tires.add(new Tire(tire3Pressure, tire3Age));
            this.tires.add(new Tire(tire4Pressure, tire4Age));
        }

        public boolean isFragile() {
            for (Tire tire : tires) {
                if (tire.pressure < 1) {
                    return cargo.type.equals("fragile");
                }
            }
            return false;
        }

        public boolean isFlammable() {
            return engine.power > 250 && cargo.type.equals("flammable");
        }

        @Override
        public String toString() {
            return model;
        }
}
