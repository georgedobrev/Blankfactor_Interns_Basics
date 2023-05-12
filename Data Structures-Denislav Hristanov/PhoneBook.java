import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<>();

        phoneNumbers.add("+3598912345");

        phoneNumbers.add("+3598210934");

        phoneNumbers.add("+3598567894");

        phoneNumbers.add("+3595987654");

        phoneNumbers.add("+3598712334");

        phoneNumbers.add("+3598793321");

        phoneNumbers.add(3, "+35983748484");

        System.out.println("All phone numbers: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
        phoneNumbers.remove(2);

        System.out.println("Phone book after removing the phone at 3rd position:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

    }
}