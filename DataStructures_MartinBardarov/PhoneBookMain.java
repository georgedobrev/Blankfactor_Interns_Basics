import java.util.ArrayList;
import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PhoneBookMain {
    public static void main(String[] args) {

        ArrayList<String> phoneBook = new ArrayList<String>(
                Arrays.asList("+123 43 23 65 88", "+993 55 23 69 81", "+691 87 34 69 81", "+223 55 23 66 09", "+355 16 74 22 89", "+098 27 09 33 33"));



        phoneBook.set(4,"+359 83 74 84 84");
        System.out.println(Arrays.asList(phoneBook));
        phoneBook.remove(3);
        System.out.println(Arrays.asList(phoneBook));
    }

    }
