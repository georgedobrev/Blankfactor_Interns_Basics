package CarCargoTask;

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
            System.out.println("----Model of input----");
            System.out.println("[Car Model] [Engine Speed] [Engine Power] [Cargo Weight] " +
                    "[Cargo Type] [First Tire Pressure] [Second Tire Pressure]" +
                    "[Third Tire Pressure] [Forth Tire Pressure]");
            String[] input = scanner.nextLine().split(" ");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double firstTirePressure = Double.parseDouble(input[5]);
            int firstTireAge = Integer.parseInt(input[6]);
            double secondTirePressure = Double.parseDouble(input[7]);
            int secondTireAge = Integer.parseInt(input[8]);
            double thirdTirePressure = Double.parseDouble(input[9]);
            int thirdTireAge = Integer.parseInt(input[10]);
            double fourthTirePressure = Double.parseDouble(input[11]);
            int fourthTireAge = Integer.parseInt(input[12]);

            Tire firstTire = new Tire(firstTirePressure, firstTireAge);
            Tire secondTire = new Tire(secondTirePressure, secondTireAge);
            Tire thirdTire = new Tire(thirdTirePressure, thirdTireAge);
            Tire fourthTire = new Tire(fourthTirePressure, fourthTireAge);

            ArrayList<Tire> carTires = new ArrayList<>();
            carTires.add(firstTire);
            carTires.add(secondTire);
            carTires.add(thirdTire);
            carTires.add(fourthTire);

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
                            && car.getTires().stream().anyMatch(e -> e.getTirePressure() < 1)) {
                        System.out.println(car.getModel());
                    }
                }
                case "flammable" -> {

                    if (car.getCargo().getCargoType().equals(cargoType)
                            && car.getEngine().getEnginePower() > 250) {
                        System.out.println(car.getModel());
                    }
                }
                default -> throw new IllegalArgumentException("Wrong cargo type");
            }
        }
    }
}