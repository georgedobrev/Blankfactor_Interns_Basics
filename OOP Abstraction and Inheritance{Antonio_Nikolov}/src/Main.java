public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        car.move();
        ((Engine) car).startEngine();
        ((Radio) car).playMusic();
        car.stop();

        Vehicle motorcycle = new Motorcycle("Ducati");
        motorcycle.move();
        ((Engine) motorcycle).startEngine();
        motorcycle.stop();
    }
}