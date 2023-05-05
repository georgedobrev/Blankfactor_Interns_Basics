package cars_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        System.out.print("Input the number of cars: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double firstTyrePressure = Double.parseDouble(input[5]);
            int firstTyreAge = Integer.parseInt(input[6]);
            double secondTyrePressure = Double.parseDouble(input[7]);
            int secondTyreAge = Integer.parseInt(input[8]);
            double thirdTyrePressure = Double.parseDouble(input[9]);
            int thirdTyreAge = Integer.parseInt(input[10]);
            double fourthTyrePressure = Double.parseDouble(input[11]);
            int fourthTyreAge = Integer.parseInt(input[12]);

            Tyre firstTyre = new Tyre(firstTyrePressure, firstTyreAge);
            Tyre secondTyre = new Tyre(secondTyrePressure, secondTyreAge);
            Tyre thirdTyre = new Tyre(thirdTyrePressure, thirdTyreAge);
            Tyre fourthTyre = new Tyre(fourthTyrePressure, fourthTyreAge);

            ArrayList<Tyre> carTires = new ArrayList<>();
            carTires.add(firstTyre);
            carTires.add(secondTyre);
            carTires.add(thirdTyre);
            carTires.add(fourthTyre);

            Car car = new Car(model, new Engine(engineSpeed, enginePower),
                    new Cargo(cargoWeight, cargoType), carTires);

            carList.add(car);
        }

        System.out.print("Input cargo type: ");
        String cargoType = scanner.nextLine();

        for (Car car : carList) {
            switch (cargoType) {
                case "fragile" -> {
                    if (car.getCargo().getCargoType().equals(cargoType)
                            && car.getTires().stream().anyMatch(e -> e.getPressure() < 1)) {
                        System.out.println(car.getModel());
                    }
                }
                case "flammable" -> {
                    if (car.getCargo().getCargoType().equals(cargoType)
                            && car.getEngine().getEnginePower() > 250) {
                        System.out.println(car.getModel());
                    }
                }
                default -> throw new IllegalArgumentException("Cargo type is wrong");
            }
        }
    }
}
