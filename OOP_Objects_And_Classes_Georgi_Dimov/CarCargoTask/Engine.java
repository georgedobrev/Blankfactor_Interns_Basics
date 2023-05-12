package CarCargoTask;

public class Engine {
    private int speed;
    private int power;

    public Engine(int speed, int power){
        this.power = power;
        this.speed = speed;
    }
    public Engine(){}

    public int getEnginePower() {
        return power;
    }

    public void setEnginePower(int power) {
        this.power = power;
    }

    public int getEngineSpeed() {
        return speed;
    }

    public void setEngineSpeed(int speed) {
        this.speed = speed;
    }
}
