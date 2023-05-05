package date_modifier_task;

public class Main {
    public static void main(String[] args) {
        DateModifier dateModifier = new DateModifier();
        String firstDate = "02/05/2023";
        String secondDate = "16/05/2023";

        dateModifier.calculateDaysDifference(firstDate, secondDate);

        System.out.println(dateModifier.getDaysDifference());
    }
}
