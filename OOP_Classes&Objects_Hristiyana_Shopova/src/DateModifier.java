import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateModifier {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023,4,12);
        LocalDate date2 = LocalDate.of(2020,8,22);

        long daysDifference = Math.abs(ChronoUnit.DAYS.between(date1, date2));
        System.out.println("The difference between the two dates is " + daysDifference + " days.");
    }

}