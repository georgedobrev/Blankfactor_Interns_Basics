package oopObjectsAndClasses;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateModifier {
//    USE TO TEST:
//    public static void main(String[] args) {
//        String date1 = "1-20-2020";
//        String date2  = "1-23-2020";
//        daysDifferanceCalculator(date1, date2);
//    }

    private int differanceBetweenTwoDays;

    public DateModifier() {
        this.differanceBetweenTwoDays = 0;
    }

    public int getDifferanceBetweenTwoDays() {
        return differanceBetweenTwoDays;
    }

    public void setDifferanceBetweenTwoDays(int differanceBetweenTwoDays) {
        this.differanceBetweenTwoDays = differanceBetweenTwoDays;
    }

    static void daysDifferanceCalculator(String join_date, String leave_date) {
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");

        try {
            Date date1 = obj.parse(join_date);
            Date date2 = obj.parse(leave_date);
            long time_difference = date2.getTime() - date1.getTime();
            long days_difference = (time_difference / (1000 * 60 * 60 * 24)) % 365;
            long years_difference = (time_difference / (1000L * 60 * 60 * 24 * 365));


            System.out.print("Difference " + "between two dates is: ");
            System.out.println(years_difference + " years, " + days_difference + " days");
        }
        catch (ParseException exception) {
            exception.printStackTrace();
        }
    }
}