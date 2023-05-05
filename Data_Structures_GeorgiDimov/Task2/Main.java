import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> phoneBookList = new LinkedList<String>();
        phoneBookList.add("+359 88 88 88 81");
        phoneBookList.add("+359 88 88 88 82");
        phoneBookList.add("+359 88 88 88 83");
        phoneBookList.add("+359 88 88 88 84");
        phoneBookList.add("+359 88 88 88 85");
        phoneBookList.add("+359 88 88 88 86");
        phoneBook(phoneBookList);
    }


    public static void phoneBook(LinkedList<String> phoneBook) {
        System.out.println("\t\t First print:");
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println("("+ (i+1) + ") " + phoneBook.get(i));
        }
        phoneBook.add(3, "+359 83 74 84 84");
        System.out.println("\t\t Second print:");
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println("("+ (i+1) + ") " + phoneBook.get(i));
        }
        phoneBook.remove(2);
        System.out.println("\t\t Third print:");
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println("("+ (i+1) + ") " + phoneBook.get(i));
        }
    }
}