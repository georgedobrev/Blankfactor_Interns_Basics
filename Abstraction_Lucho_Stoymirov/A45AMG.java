public class A45AMG extends Car implements BreakDown{
    @Override
    public void makeNoise() {
        System.out.println("*Revs up* *BANG* *CRASH* *Oil spilling noises* *Angry Mercedes owner screaming*");
    }

    @Override
    public void breakDown() {
        System.out.println("*Breaks Down*");
    }
}
