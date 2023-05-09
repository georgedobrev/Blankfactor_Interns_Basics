// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DroneGen1 droneGen1 = new DroneGen1("zhy", 70, 7, 8);
        DroneGen2 droneGen2 = new DroneGen2("yhz", 32, 3, 5);

//        droneGen1.turnOn();
//        droneGen1.getCargo();
//        System.out.println(droneGen1.getBatteryPercentage());
//        System.out.println(droneGen1.getGeneration());
//        droneGen1.enableGps();
//        droneGen1.disableGps();
//        System.out.println(droneGen1.getGetCoordinateY());
//        droneGen1.getCoordinates();

        droneGen2.turnOn();
        droneGen2.getCargo();
        System.out.println(droneGen2.getGeneration());
        System.out.println(droneGen2.getBatteryPercentage());
        droneGen2.enableGps();
        droneGen2.getCoordinates();
        droneGen2.disableGps();
        droneGen2.getCoordinates();

        //The program could be upgraded further and I will do so on my own
        // ,but I will submit it in, it's current form because of the deadline !
        //Feedback would be much appreciated on how to improve it and how to code it better
    }
}