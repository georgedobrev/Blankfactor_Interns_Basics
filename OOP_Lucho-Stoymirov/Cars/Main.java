import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lines: ");
        int lines = scanner.nextInt();

        List<Car> cars = new ArrayList<>();

        for(int i = 0; i < lines; i++) {
            System.out.println("Enter info: ");
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            double tireOnePressure = Double.parseDouble(input[5]);
            int tireOneAge = Integer.parseInt(input[6]);
            Tires firstTire = new Tires(tireOnePressure, tireOneAge);

            double tireTwoPressure = Double.parseDouble(input[7]);
            int tireTwoAge = Integer.parseInt(input[8]);
            Tires secondTire = new Tires(tireTwoPressure, tireTwoAge);

            double tireThreePressure = Double.parseDouble(input[9]);
            int tireThreeAge = Integer.parseInt(input[10]);
            Tires thirdTire = new Tires(tireThreePressure, tireThreeAge);

            double tireFourPressure = Double.parseDouble(input[11]);
            int tireFourAge = Integer.parseInt(input[12]);
            Tires fourthTire = new Tires(tireFourPressure, tireFourAge);
            Tires[] tires = new Tires[]{firstTire, secondTire, thirdTire, fourthTire};

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }
        System.out.println("Enter cargo: ");
        String cargo = scanner.nextLine();
        if(cargo.equals("fragile")) {
            for(Car car : cars) {
                Tires[] tires = car.getTires();
                for(Tires tire : tires){
                    if(tire.getPressure() < 1) {
                        System.out.println(car.getModel());
                    }
                }
            }
        }else if(cargo.equals("flammable")) {
            for(Car car: cars) {
                Engine engine = car.getEngine();
                if(engine.getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }

    }
}
