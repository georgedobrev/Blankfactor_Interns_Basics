package TaskOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//Create a class DateModifier, which stores the difference of the days between two dates.
// It should have a method that takes two string parameters
// representing a date as strings and calculates the difference in the days between them.
public class DateModifier {
    public int daysDifference;
    public String dateString1;
    public String dateString2;

    public String getDateString1() {
        return dateString1;
    }

    public int getDaysDifference() {
        return daysDifference;
    }

    public void setDateString1(String dateString1) {
        this.dateString1 = dateString1;
    }

    public void setDaysDifference(int daysDifference) {
        this.daysDifference = daysDifference;
    }

    public String getDateString2() {
        return dateString2;
    }

    public void setDateString2(String dateString2) {
        this.dateString2 = dateString2;
    }

    public void calculateDaysDifference() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        setDateString1("1999-06-24");
        LocalDate date1 = LocalDate.parse(dateString1, formatter);
        setDateString2("2023-06-24");
        LocalDate date2 = LocalDate.parse(dateString2, formatter);
      setDaysDifference((int) ChronoUnit.DAYS.between(date1, date2));
        System.out.println(getDaysDifference());
    }

    }

