public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        ((Machine) car).startEngine();
        car.move();
        Radio radio = new Radio();
        radio.playMusic();
        car.stop();
        radio.playMusic();

        Vehicle motorcycle = new Motorcycle("Ducati");

        ((Machine) motorcycle).startEngine();
        motorcycle.move();
        motorcycle.stop();
    }
}