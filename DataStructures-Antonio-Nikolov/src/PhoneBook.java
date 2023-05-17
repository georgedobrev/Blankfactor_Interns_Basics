import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<Contact> phoneBook = new ArrayList<>();

        phoneBook.add(new Contact("+359 22 11 55 66"));
        phoneBook.add(new Contact("+359 33 12 56 67"));
        phoneBook.add(new Contact("+359 44 13 57 68"));
        phoneBook.add(new Contact("+359 55 14 58 69"));
        phoneBook.add(new Contact("+359 66 15 59 61"));
        phoneBook.add(new Contact("+359 33 15 59 61"));

        phoneBook.add(3, new Contact("+359 83 74 84 84"));

        printContacts(phoneBook);

        phoneBook.remove(2);

        printContacts(phoneBook);
    }

    private static void printContacts(ArrayList<Contact> contacts) {
        System.out.println("Contacts");
        for (Contact contact : contacts) {
            System.out.println(" Phone: " + contact.getPhone());
        }
        System.out.println();
    }

    private static class Contact {
        private String phone;
        public Contact(String phone) {

            this.phone = phone;
        }
        public String getPhone() {
            return phone;
        }
    }
}
