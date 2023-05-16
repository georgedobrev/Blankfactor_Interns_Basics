public class Engine {
    private int speed;
    private int power;

    public Engine(int Speed, int Power){
        this.speed = Speed;
        this.power = Power;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
