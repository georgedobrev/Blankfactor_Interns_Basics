public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 150, 6.5, 5);
        Boat boat = new Boat("Boston Whaler", 250, 12, 150);
        car.startEngine();
        car.stopEngine();
        boat.startEngine();
        boat.stopEngine();
    }
}