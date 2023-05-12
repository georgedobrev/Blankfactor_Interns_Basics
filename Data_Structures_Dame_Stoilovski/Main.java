import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {


        // TASK 1
        Printer printerWithTasks = new Printer();

        // Deque<Integer> tasks = new ArrayDeque<>(Arrays.asList(0, 1, 1, 0, 1, 0, 1, 1, 0));
        Deque<Integer> tasks = new ArrayDeque<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));

        // int[] paperNums = {1, 0, 1, 1, 0, 0, 1, 0, 1};
        int[] paperNums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int result = printerWithTasks.printerTaskChecker(paperNums, tasks);
        System.out.println("Uncompleted tasks: " + result);

        System.out.println();


        // TASK 2
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addPhoneNumber("+359 89 74 25 87");
        myPhoneBook.addPhoneNumber("+359 89 74 25 80");
        myPhoneBook.addPhoneNumber("+359 89 74 25 11");
        myPhoneBook.addPhoneNumber("+359 89 04 75 40");
        myPhoneBook.addPhoneNumber("+359 89 14 25 38");
        myPhoneBook.addPhoneNumber("+359 90 26 00 38");
        myPhoneBook.addPhoneNumber("+359 99 87 12 38");
        myPhoneBook.printFunc();

        myPhoneBook.addPhoneNumber(3, "+359 83 74 84 84");
        myPhoneBook.printFunc();

        myPhoneBook.removePhoneNumber(2);
        myPhoneBook.printFunc();
        }
    }