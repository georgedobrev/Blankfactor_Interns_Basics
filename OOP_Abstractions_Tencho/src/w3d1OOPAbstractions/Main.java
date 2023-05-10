package w3d1OOPAbstractions;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car ("Toyota", "Avensis",120, 400);

        System.out.println("Checking essential safety systems...");
        car1.accelerate();
        car1.brake();
        System.out.println();

        car1.workingCorrectly();
        System.out.println();

        car1.startEngine();
        System.out.println("-----------------------");




        Boat boat1 = new Boat("","", 70, 30);
        System.out.println("Checking essential safety systems...");
        boat1.floating();
        boat1.turning();
        System.out.println();

        boat1.workingCorrectly();
        System.out.println();

        boat1.startEngine();
        System.out.println("------------------------");


        Airplane airplane1 = new Airplane("","", 8000, 14000);
        System.out.println("Checking essential safety systems...");
        airplane1.takeOff();
        airplane1.land();
        System.out.println();

        airplane1.workingCorrectly();
        System.out.println();

        airplane1.startEngine();
        System.out.println("----------------------");


    }
}
