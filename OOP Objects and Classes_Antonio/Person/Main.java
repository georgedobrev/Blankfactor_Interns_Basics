package Person;

import java.util.ArrayList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<String>();

        Person person = new Person("Antonio",  29, courses);

        courses.add("React");
        courses.add("JS");

        courses.remove(1);
        System.out.println(person.getCourses());

        System.out.println(person.getCourses());


    }
}