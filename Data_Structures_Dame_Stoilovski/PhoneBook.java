import java.util.ArrayList;
import java.util.LinkedList;

public class PhoneBook {
    private final LinkedList<String> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new LinkedList<>();
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void addPhoneNumber(int index, String phoneNumber) {
        phoneNumbers.add(index, phoneNumber);
    }

    public void removePhoneNumber(int index) {
        phoneNumbers.remove(index);
    }

    public void printFunc() {
        System.out.println("Phone book numbers:");
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.println((i + 1) + ". " + phoneNumbers.get(i));
        }
    }
}
