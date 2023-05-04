package firstTask_DateModifier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateModifier {
    public void calculateDate(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);


        Date firstDate = sdf.parse(date1);
        Date secondDate = sdf.parse(date2);

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        System.out.println("The difference in days is: " + diff + " days.");
    }

    public static void main(String[] args) throws ParseException {
        DateModifier d = new DateModifier();
        d.calculateDate("2023/01/01", "2024/01/06");
    }
}
