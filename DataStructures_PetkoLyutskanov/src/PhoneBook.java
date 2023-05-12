import java.io.Console;
import java.util.ArrayList;

public class PhoneBook {
    private static class Contact {
        String name;
        String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    private static void addContacts(ArrayList<Contact> contacts) {
        contacts.add(new Contact("Petar", "+359 83 70 84 83’"));
        contacts.add(new Contact("Georgi", "+359 83 71 84 82’"));
        contacts.add(new Contact("Dimitar", "+359 83 72 84 81’"));
        contacts.add(new Contact("Mariya", "+359 83 73 84 89’"));
        contacts.add(new Contact("Stefani", "+359 83 70 84 86’"));
        contacts.add(new Contact("Petko", "+359 83 75 84 86’"));
        contacts.add(new Contact("Vasil", "+359 83 76 84 87’"));
        contacts.add(new Contact("Angel", "+359 83 77 84 88’"));
    }

    private static void printContacts(ArrayList<Contact> contacts) {
        contacts.forEach(e -> System.out.println(e.name + " - " + e.phoneNumber));
    }

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        addContacts(contacts);

        contacts.add(3, new Contact("Stanimir", "+359 83 74 84 84’"));

        printContacts(contacts);
        System.out.println("-----------------------");
        System.out.println("Contacts before removal");
        System.out.println("-----------------------");

        contacts.remove(2);

        printContacts(contacts);
    }
}
