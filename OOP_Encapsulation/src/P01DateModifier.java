import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class P01DateModifier {
    public class DateModifier {
        private long daysDifference;

        public void calculateDaysDifference(String day1, String day2) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                LocalDate d1 = LocalDate.parse(day1, dateFormatter);
                LocalDate d2 = LocalDate.parse(day2, dateFormatter);
                this.daysDifference = Math.abs(ChronoUnit.DAYS.between(d1, d2));
            } catch (Exception e) {
                System.out.println("Invalid date format: " + e.getMessage());
            }
        }

        public long getDaysDifference() {
            return daysDifference;
        }
    }
}
