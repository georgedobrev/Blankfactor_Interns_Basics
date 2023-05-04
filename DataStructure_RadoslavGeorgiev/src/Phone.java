
import java.util.HashMap;
import java.util.Map;

//Suppose you are developing a phone book application, where users can store and retrieve phone numbers for their contacts.
// Phone numbers will be represented as strings. Choose which data structure you will use to store the phone numbers.
// Add at least 6 phone numbers. Add phone number: ‘+359 83 74 84 84’ at 4th position.
// Print in the console all phones. Remove the phone in the 3rd position. Print the phone book again.
public class Phone {
    private static Map<Integer, String> contacts() {
        Map<Integer, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put(1, "+358 83 72 13 84");
        phoneNumbers.put(2, "+359 13 54 84 84");
        phoneNumbers.put(3, "+359 83 73 85 84");
        phoneNumbers.put(4, "+359 83 74 84 84");
        phoneNumbers.put(5, "+3592 833 744 845 841");
        phoneNumbers.put(6, "+123 359 83 74 84 84");
        return phoneNumbers;
    }

    public static void main(String[] args) {
        Map<Integer, String> phoneNumbers = contacts();
        for (Map.Entry<Integer, String> entry : phoneNumbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Without fourth number:");
        phoneNumbers.remove(4);
        for (Map.Entry<Integer, String> entry : phoneNumbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

