package Cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", 320, 6300, 1000, "fragile", 0.5, 2, 0.2, 2, 0.4, 3, 0.5, 5));
        cars.add(new Car("BMW", 300, 3500, 1500, "fragile", 1, 2, 2, 2, 0.4, 3, 0.5, 5));
        cars.add(new Car("Ford", 180, 1400, 600, "flammable", 1.3, 1, 1.3, 1, 1, 1, 1.6, 3));
        cars.add(new Car("Opel", 200, 1800, 1000, "flammable", 2, 2, 1.3, 1, 1.3, 0, 1.5, 3));


        System.out.print("What is the cargo type: \n" +
                "If cargo is fragile insert command fragile or press 1 \n" +
                "or \n" +
                "if flammable insert flammable or press 2 \n");
        String command = scanner.nextLine();
        if (command.equals("1") || command.equals("fragile")) {
            System.out.println("Fragile: ");
            for (Car car : cars) {
                if (car.isFragile()){
                    System.out.println(car);
                }
            }
        } else if (command.equals("2") || command.equals("flammable")) {
            System.out.println("Flammable: ");
            for (Car car : cars) {
                if (car.isFlammable()) {
                    System.out.println(car);
                }

            }

        }
    }
}