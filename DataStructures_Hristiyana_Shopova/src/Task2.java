import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> phoneBook = new LinkedList<>();

        phoneBook.add(0,"+359 86 74 84 84");
        phoneBook.add(1,"+359 86 74 84 84");
        phoneBook.add(2,"+359 84 74 84 84");
        phoneBook.add(3,"+359 70 74 84 84");
        phoneBook.add(4,"+359 83 74 84 84");
        phoneBook.add(5,"+359 22 84 77 84");
        phoneBook.add(6,"+359 30 74 84 84");


        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println(phoneBook.get(i));
        }
        phoneBook.remove(3);

        System.out.println("---------");
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println(phoneBook.get(i));
        }
    }
}