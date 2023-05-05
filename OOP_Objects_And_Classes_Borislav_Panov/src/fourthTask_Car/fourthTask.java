package fourthTask_Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 200, 150, 500, "fragile", 0.5, 1, 0.3, 2, 0.4, 3, 0.5, 5));
        cars.add(new Car("Mercedes", 200, 150, 500, "fragile", 0.5, 1, 0.3, 2, 0.4, 3, 0.5, 5));
        cars.add(new Car("Honda", 220, 300, 800, "flammable", 1.3, 2, 1.3, 1, 1.3, 0, 1.3, 3));
        cars.add(new Car("Toyota", 220, 300, 800, "flammable", 1.3, 2, 1.3, 1, 1.3, 0, 1.3, 3));

        System.out.print("Enter command: (fragile or flammable): ");
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            System.out.println("Fragile: ");
            for (Car car : cars) {
                if (car.isFragile()){
                    System.out.println(car);
                }
            }
        } else if (command.equals("flammable")) {
            System.out.println("Flammable: ");
            for (Car car : cars) {
                if (car.isFlammable()) {
                    System.out.println(car);
                }
            }
        }
    }
}
