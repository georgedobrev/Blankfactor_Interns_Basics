import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateModifier {
    public long daysDifference;

    public void calculateDifference(String firstDate, String secondDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(firstDate, formatter);
        LocalDate d2 = LocalDate.parse(secondDate, formatter);
        this.daysDifference = ChronoUnit.DAYS.between(d1, d2);
    }

    public long getDaysDifference() {
        return daysDifference;
    }
}
