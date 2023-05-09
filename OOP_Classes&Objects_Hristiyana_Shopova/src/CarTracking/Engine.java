package CarTracking;

public class Engine {

    private int myEnginePower;
    private int myEngineSpeed;

    public int getMyEnginePower() {
        return myEnginePower;
    }

    public void setMyEnginePower(int myEnginePower) {
        this.myEnginePower = myEnginePower;
    }

    public int getMyEngineSpeed() {
        return myEngineSpeed;
    }

    public void setMyEngineSpeed(int myEngineSpeed) {
        this.myEngineSpeed = myEngineSpeed;
    }

    public Engine(int power, int speed)
    {
        this.myEnginePower = power;
        this.myEngineSpeed = speed;
    }


}