public class DroneGen1 extends Drone implements GPS {

    private final String generation="Generation 1";

    Map map=new Map(10);


    public DroneGen1(String model, int batteryPercentage, int coordinateX, int getCoordinateY) {
        super(model, batteryPercentage, coordinateX, getCoordinateY);
    }

    public String getGeneration() {
        return generation;
    }

    public void turnOn() {
        System.out.println("The drone is turned on, battery at"+" "+ getBatteryPercentage()+"%");
    }


    public void enableGps() {
        System.out.println("GPS enabled.");
        this.setGps(true);

    }

    public void disableGps() {

        System.out.println("GPS disabled.");
        this.setGps(false);
    }


    public void getCoordinates() {

        if (!isGps()){
            System.out.println("The gps is off");
        }
        else {

            for (int row = map.getGridSize() - 1; row >= 0; row--) {
                for (int col = 0; col < map.getGridSize(); col++) {
                    if (col == getCoordinateX() && row == getGetCoordinateY()) {
                        System.out.print(map.getPointSymbol());
                    } else if (col == 0 && row == 0) {
                        System.out.print('+');
                    } else if (col == 0) {
                        System.out.print('|');
                    } else if (row == 0) {
                        System.out.print('-');
                    } else {
                        System.out.print(' ');
                    }
                    System.out.print(' ');
                }
                System.out.println();
            }
        }

    }
}
