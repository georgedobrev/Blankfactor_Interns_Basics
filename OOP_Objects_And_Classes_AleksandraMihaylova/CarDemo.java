package oopObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//EXAMPLE INPUT:
//2
//Model1 150 100 500 fragile 0.8 1 1.2 2 1.3 2 1.4 3
//Model2 220 280 1400 flammable 1.8 3 1.9 4 1.7 5 1.8 6
//fragile


public class CarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int numberOfCars = scanner.nextInt();
        List<Car> cars = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < numberOfCars; i++) {
            System.out.printf("Enter information for car number %d in the following format:\n" +
                    "{model} {engineSpeed} {enginePower} {cargoWeight} {cargoType} {tire1Pressure} {tire1Age} {tire2Pressure} {tire2Age} {tire3Pressure} {tire3Age} {tire4Pressure} {tire4Age}\n", i+1);
            String[] carData = scanner.nextLine().split(" ");
            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            double[] tirePressures = new double[] {
                    Double.parseDouble(carData[5]),
                    Double.parseDouble(carData[7]),
                    Double.parseDouble(carData[9]),
                    Double.parseDouble(carData[11])
            };
            int[] tireAges = new int[] {
                    Integer.parseInt(carData[6]),
                    Integer.parseInt(carData[8]),
                    Integer.parseInt(carData[10]),
                    Integer.parseInt(carData[12])
            };
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            for (int j = 0; j < 4; j++) {
                tires[j] = new Tire(tirePressures[j], tireAges[j]);
            }
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }
        System.out.print("Enter a command ('fragile' or 'flammable'): ");
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            boolean foundCar = false;
            for (Car car : cars) {
                if (car.getCargo().getType().equals("fragile")) {
                    boolean hasLowPressureTire = false;
                    for (Tire tire : car.getTires()) {
                        if (tire.getPressure() < 1.0) {
                            hasLowPressureTire = true;
                            break;
                        }
                    }
                    if (hasLowPressureTire) {
                        System.out.println(car.getModel());
                        foundCar = true;
                    }
                }
            }
            if (!foundCar) {
                System.out.println("No cars with fragile cargo and low pressure tires found.");
            }
        } else if (command.equals("flammable")) {
            boolean foundCar = false;
            for (Car car : cars) {
                if (car.getCargo().getType().equals("flammable") && car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                    foundCar = true;
                }
            }
            if (!foundCar) {
                System.out.println("No cars with flammable cargo and engine power > 250 found.");
            }
        } else {
            System.out.println("Not a valid command.");
        }
    }
}