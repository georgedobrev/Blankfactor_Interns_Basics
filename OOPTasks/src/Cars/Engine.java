package Cars;

public class Engine {

    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineSpeed=" + engineSpeed +
                ", enginePower=" + enginePower +
                '}';
    }
}
