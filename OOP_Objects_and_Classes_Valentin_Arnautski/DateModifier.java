import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateModifier {

    public long daysDifference;

    public  void findDifference(String firstDate, String secondDate){

        LocalDate date1 = LocalDate.parse(firstDate);
        LocalDate date2 = LocalDate.parse(secondDate);
        this.daysDifference = ChronoUnit.DAYS.between(date1, date2);

    }

    public long getDaysDifference(){
        return daysDifference;
    }

    public static void main(String[] args) {
        DateModifier dateModifier = new DateModifier();
        dateModifier.findDifference("2022-06-12", "2022-06-14");
        System.out.println("The difference between the two dates is " + dateModifier.getDaysDifference() + " days.");
    }

}




