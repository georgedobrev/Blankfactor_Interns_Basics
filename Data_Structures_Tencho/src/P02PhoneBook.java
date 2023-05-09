import java.util.LinkedList;

public class P02PhoneBook {
    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<>();

        numbers.add("+359 83 74 84 81");
        numbers.add("+359 83 74 84 82");
        numbers.add("+359 83 74 84 83");
        numbers.add("+359 83 74 84 85");
        numbers.add("+359 83 74 84 86");
        numbers.add("+359 83 74 84 87");

        numbers.add(4, "+359 83 74 84 82");
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);
    }
}
