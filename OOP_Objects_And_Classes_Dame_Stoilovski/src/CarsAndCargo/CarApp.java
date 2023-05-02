package CarsAndCargo;

import java.util.Scanner;

public final class CarApp {
    public static void addTire(Tire tire, Tire[] tires) {
        for (int k = 0; k < tires.length; k++) {
            if (tires[k] == null) {
                tires[k] = tire;
                break;
            }
        }
    }
    public static void startMakingCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of cars you want to make: ");
        int numOfCars = scanner.nextInt();

        Car[] cars = new Car[numOfCars];
        // bmw 100 25 50 flamable 2.00 2 2.00 2 2.00 2 2.00 2
        for (int i = 0; i < numOfCars; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String str = scanner1.nextLine();
            String[] inputData = str.split(" ");

            String model = null;
            Engine engine = null;
            Cargo cargo= null;
            Tire[] tires = new Tire[4];
            Tire tire1;
            Tire tire2;
            Tire tire3;
            Tire tire4;

            for (int j = 0; j < inputData.length; j++) {
                if (j == 0) {
                    model = inputData[0];
                } else if (j == 1) {
                    engine = new Engine(Integer.parseInt(inputData[j]), Integer.parseInt(inputData[j+1]));
                    j++;
                } else if (j == 3) {
                    cargo = new Cargo(Integer.parseInt(inputData[j]), inputData[j+1]);
                    j++;
                } else {
                    tire1 = new Tire(Double.parseDouble(inputData[j]), Integer.parseInt(inputData[j+1]));
                    addTire(tire1, tires);
                    j += 2;
                    tire2 = new Tire(Double.parseDouble(inputData[j]), Integer.parseInt(inputData[j+1]));
                    addTire(tire2, tires);
                    j += 2;
                    tire3 = new Tire(Double.parseDouble(inputData[j]), Integer.parseInt(inputData[j+1]));
                    addTire(tire3, tires);
                    j += 2;
                    tire4 = new Tire(Double.parseDouble(inputData[j]), Integer.parseInt(inputData[j+1]));
                    addTire(tire4, tires);
                    break;
                }
            }
            cars[i] = new Car(model, engine, cargo, tires);

        }

        System.out.println("Enter the command: ");
        String command = scanner.next();

        if (command.equals("fragile")) {
            printFragile(cars);

        } else if (command.equals("flamable" )) {
            printFlamable(cars);
        }
    }

    public static void printFragile(Car[] cars) {
        for (Car car : cars) {
            if (car.getCargo().getType().equals("fragile") && checkTiresPressure(car.getTires())) {
                System.out.println(car.getModel());
            }
        }
    }

    public static boolean checkTiresPressure(Tire[] tires) {
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }

    public static void printFlamable(Car[] cars) {
        for (Car car : cars) {
            if (car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250) {
                System.out.println(car.getModel());
            }
        }
    }
}
