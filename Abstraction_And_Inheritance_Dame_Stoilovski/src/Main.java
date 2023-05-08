import attractions.Museum;
import people.Group;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Museum museumOfHistory = new Museum("Museum of History", "1 Main Street", 5, 10, 2.00);
        System.out.println(museumOfHistory);
        Group tourists = new Group(26, museumOfHistory);
        System.out.println(tourists.groupExpenses());
        }
    }