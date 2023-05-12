public abstract class Drone {

    public Drone(String model, int batteryPercentage, int coordinateX, int getCoordinateY) {
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        this.coordinateX = coordinateX;
        this.getCoordinateY = getCoordinateY;
        this.gps=false;
    }

    private String model;
    private int batteryPercentage;

    private int coordinateX;
    private int getCoordinateY;

    private boolean gps;
    public abstract void turnOn();

    public void getCargo(){
        System.out.println("The drone picked up the goods");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getGetCoordinateY() {
        return getCoordinateY;
    }

    public void setGetCoordinateY(int getCoordinateY) {
        this.getCoordinateY = getCoordinateY;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
