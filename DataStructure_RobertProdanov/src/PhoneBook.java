
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<Integer, String> phoneBook = new HashMap<Integer, String>();

        phoneBook.put(1, "+359 83 74 90 90");
        phoneBook.put(2, "+359 83 74 39 38");
        phoneBook.put(3, "+359 83 74 90 90");
        phoneBook.put(4, "+359 83 74 85 84");
        phoneBook.put(5, "+359 82 74 81 90");
        phoneBook.put(6, "+359 85 74 88 90");

        printContacts(phoneBook);
        phoneBook.remove(3);
        printContacts(phoneBook);
    }

    private static void printContacts(HashMap<Integer, String> hashMap) {

        System.out.println("Contacts");

        for (int i : hashMap.keySet()) {
            System.out.println("key: " + i + " value: " + hashMap.get(i));
        }
        System.out.println();
    }







}

