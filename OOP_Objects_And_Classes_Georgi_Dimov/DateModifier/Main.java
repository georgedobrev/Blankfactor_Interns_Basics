import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateModifier dateModifier = new DateModifier("2023-04-01", "2023-04-14");
        System.out.println("The difference between the two dates is " +
                dateModifier.getDaysDifference() + " days.");
    }
}