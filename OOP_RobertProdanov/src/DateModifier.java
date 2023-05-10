import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateModifier {

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate dt1 = LocalDate.parse(date1);
        LocalDate dt2 = LocalDate.parse(date2);

        long diffDays = ChronoUnit.DAYS.between(dt1, dt2);

        return Math.abs((int) diffDays);
    }
}






