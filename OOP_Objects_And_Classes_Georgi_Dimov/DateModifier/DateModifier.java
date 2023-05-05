import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateModifier {
    private long daysDifference;

    public DateModifier(String date1, String date2){
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        this.daysDifference = ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public long getDaysDifference() {
        return daysDifference;
    }
}
