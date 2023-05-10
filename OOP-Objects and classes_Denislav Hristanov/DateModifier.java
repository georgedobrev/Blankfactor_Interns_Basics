import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class DateModifier {
    private long days;
    public DateModifier(String date1,String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2,formatter);
        this.days = ChronoUnit.DAYS.between(localDate1, localDate2);
    }
    public long getDays() {
        return days;
    }
}
