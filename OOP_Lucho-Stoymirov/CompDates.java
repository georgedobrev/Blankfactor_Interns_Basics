import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        static void findDiff(String date1, String date2) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");

            try {
                Date startDate = formatter.parse(date1);
                Date endDate = formatter.parse(date2);

                long diffTime = endDate.getTime() - startDate.getTime();

                long diffDays = TimeUnit.MILLISECONDS.toDays(diffTime) % 365;

                System.out.println("Difference in days is : " + diffDays);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            String date1 = "01 01 2023";
            String date2 = "24 03 2023";
            findDiff(date1, date2);
    }
}