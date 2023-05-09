package date_modifier_task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateModifier {
    private int daysDifference;

    public DateModifier() {
    }

    public DateModifier(int daysDifference) {
        this.daysDifference = daysDifference;
    }

    public int getDaysDifference() {
        return daysDifference;
    }

    public void setDaysDifference(int daysDifference) {
        this.daysDifference = daysDifference;
    }

    public void calculateDaysDifference(String firstDate, String secondDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date firstDateParsed;
        Date secondDateParsed;

        try {
            firstDateParsed = simpleDateFormat.parse(firstDate);
            secondDateParsed = simpleDateFormat.parse(secondDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        long diff = Math.abs(secondDateParsed.getTime() - firstDateParsed.getTime());
        daysDifference = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
