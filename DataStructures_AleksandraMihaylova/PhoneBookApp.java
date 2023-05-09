package taskDataStructures;

import java.util.LinkedList;

public class PhoneBookApp {
    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<String>();

        numbers.add("+359 123 456 789");
        numbers.add("+359 987 654 321");
        numbers.add("+359 895 605 698");
        numbers.add("+359 333 333 333");
        numbers.add("+359 111 222 333");
        numbers.add("+359 222 333 444");

        System.out.println(numbers);
        numbers.add(4, "+359 83 74 84 84");

        numbers.remove("+359 895 605 698");
        System.out.println(numbers);

    }
}
