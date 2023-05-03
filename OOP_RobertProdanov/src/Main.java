import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //DateModifier

        System.out.println("Difference between dates:");
        System.out.println(DateModifier.daysBetweenDates("2022-10-10", "2022-10-07"));
        System.out.println(DateModifier.daysBetweenDates("2022-10-10", "2022-10-15"));


        //Family Task
        Family f = new Family();
        System.out.println("\nEnter amount of family numbers");

        int members = input.nextInt();
        createMembers(members, f);
        System.out.println(f.GetOldestMember());

        //Generic method

        //list with strings
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        swapElements(list, 1, 2);
        System.out.println(list);

        //list with integers
        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        swapElements(list2, 1, 2);
        System.out.println(list2);

        //Car-Cargo Task

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of cars: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carList = createCars(n);

        System.out.print("Input cargo type: ");
        String cargoType = scanner.nextLine();
        checkCargo(cargoType,carList);

    }

    private static void createMembers(int members, Family f) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < members; i++) {
            System.out.println("Enter member name: ");
            String name = input.nextLine();

            System.out.println("Enter member age: ");
            int age = input.nextInt();

            input.nextLine();

            f.addMember(new Person(name, age));

        }
    }


    private static <T> void swapElements(List<T> list, int idx1, int idx2) {

        if (idx1 < list.size() && idx2 < list.size()) {
            Collections.swap(list, idx1, idx2);
        }
    }

    private static List<Car> createCars(int amount){
        List<Car> carList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amount; i++) {
            String[] carProperties = scanner.nextLine().split(" ");

            ArrayList<Tire> tires = new ArrayList<Tire>();
            tires.add(new Tire(Double.valueOf(carProperties[5]), Integer.valueOf(carProperties[6])));
            tires.add(new Tire(Double.valueOf(carProperties[7]), Integer.valueOf(carProperties[8])));
            tires.add( new Tire(Double.valueOf(carProperties[9]), Integer.valueOf(carProperties[10])));
            tires.add( new Tire(Double.valueOf(carProperties[11]), Integer.valueOf(carProperties[12])));

            Car car = new Car(carProperties[0], new Engine(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2])), new Cargo(Integer.parseInt(carProperties[3]), carProperties[4]), tires);

            carList.add(car);

        }
        return carList;

    }

    private static void checkCargo( String cargoType, List<Car> carList){
        for (Car car : carList) {

            if(cargoType.equals("fragile")){
                if (car.getCargo().getCargoType().equals(cargoType)
                        && car.getTires().stream().anyMatch(e -> e.getTirePressure() < 1)) {
                    System.out.println(car);
                }
            }
            else if(cargoType.equals("flammable")){
                if (car.getCargo().getCargoType().equals(cargoType)
                        && car.getEngine().getEnginePower() > 250) {
                    System.out.println(car);
                }
            }else {
                System.out.println("Invalid type");
            }
        }
    }
}