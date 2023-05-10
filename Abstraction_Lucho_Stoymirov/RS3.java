public class RS3 extends Car implements SpeedOff{
    public void makeNoise(){
        System.out.println("*Revs up*, *BANG* *BANG* *Wheels burning*");
    }

    @Override
    public void speedOff() {
        System.out.println("*Speeds off*");
    }
}
