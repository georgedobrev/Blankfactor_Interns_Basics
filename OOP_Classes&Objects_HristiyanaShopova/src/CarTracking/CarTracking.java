package CarTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new LinkedList<>();
        List<Tire> tiresForOneCar = new ArrayList<>(4);


        for (int i = 1; i <= n; i++) {

            System.out.printf("Enter the information about car number %d: ", i);
            String[] information = scanner.nextLine().split(" ");
            String model = information[0];
            int engineSpeed = Integer.parseInt(information[1]);
            int enginePower = Integer.parseInt(information[2]);
            Engine carEngine = new Engine(enginePower, engineSpeed);
            int cargo = Integer.parseInt(information[3]);
            Cargo carCargo = new Cargo(cargo);
            String cargoType = information[4];
            double tire1Preassure = Double.parseDouble(information[5]);
            int tire1Age = Integer.parseInt(information[6]);
            double tire2Preassure = Double.parseDouble(information[7]);
            int tire2Age = Integer.parseInt(information[8]);
            double tire3Preassure = Double.parseDouble(information[9]);
            int tire3Age = Integer.parseInt(information[10]);
            double tire4Preassure = Double.parseDouble(information[11]);
            int tire4Age = Integer.parseInt(information[12]);

            Tire tire1 = new Tire(tire1Preassure, tire1Age);
            tiresForOneCar.add(tire1);
            Tire tire2 = new Tire(tire2Preassure, tire2Age);
            tiresForOneCar.add(tire2);
            Tire tire3 = new Tire(tire3Preassure, tire3Age);
            tiresForOneCar.add(tire3);
            Tire tire4 = new Tire(tire1Preassure, tire4Age);
            tiresForOneCar.add(tire4);

            Car car = new Car(model, carEngine, carCargo, tiresForOneCar);
            cars.add(car);


            if(cargoType.equals("fragile") && tire1Preassure < 1.0 && tire2Preassure < 1 && tire3Preassure < 1 && tire4Preassure < 1)
            {
                System.out.println(car.toString());
            } else if(cargoType.equals("flammable") && enginePower > 250)
            {
                System.out.println(car.toString());
            }

        }

    }
}
