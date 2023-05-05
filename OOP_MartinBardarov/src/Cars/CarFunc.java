package Cars;

import java.util.List;

public class CarFunc {
    public static void printFragileCarsWithLowPressureTires(List<Car> cars) {
        for (Car car : cars) {
            if (car.getCargo().getCargoType().equals("fragile")) {
                for (Tires tire : car.getTires()) {
                    if (tire.getTirePressure() < 1) {
                        System.out.println(car);
                        break;
                    }
                }
            }
        }
    }
    public static void printFlamableCarsWithHighPowerEngine(List<Car> cars) {
        for (Car car : cars) {
            if (car.getCargo().getCargoType().equals("flamable") && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);
            }
        }
    }
}
