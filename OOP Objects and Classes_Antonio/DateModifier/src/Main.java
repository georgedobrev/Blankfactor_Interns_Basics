public class Main {
    public static void main(String[] args) {
        String date1 = "2023-09-05";
        String date2 = "2023-09-12";

        DateModifier dateModifier = new DateModifier();
        long difference = dateModifier.calculateDateDifference(date1, date2);

        System.out.println("The difference in days is: " + difference);
    }
}
