import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList<String> phoneBook = new LinkedList<>();
        String[] numbers = {
                "+359 11 11 11 11",
                "+359 22 22 22 22",
                "+359 33 33 33 33",
                "+359 44 44 44 44",
                "+359 55 55 55 55",
                "+359 66 66 66 66"
        };

        for(int i = 0; i < numbers.length; i++){
            phoneBook.add(numbers[i]);
        }

        for(int i = 0; i < phoneBook.size(); i++){
            System.out.println(phoneBook.get(i));
        }
        System.out.println("");
        phoneBook.set(3, "+359 83 74 84 84");

        for(int i = 0; i < phoneBook.size(); i++){
            System.out.println(phoneBook.get(i));
        }
        System.out.println("");
        phoneBook.remove(2);

        for(int i = 0; i < phoneBook.size(); i++){
            System.out.println(phoneBook.get(i));
        }

    }
}