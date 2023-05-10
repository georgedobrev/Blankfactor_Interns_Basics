import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Dame", 23);
        Student s2 = new Student("Martin", 22, new ArrayList<>(Arrays.asList("Math", "English", "Python")));
        Student s3 = new Student("Anna", 25);
        Student s4 = new Student("John", 28);

        s1.addCourse("Math");
        s1.addCourse("English");
        s1.addCourse("Java");

        System.out.println(s1.getCourses());

        s1.removeCourse("Math");
        System.out.println(s1.getCourses());

        s1.removeCourse("Math");
        System.out.println();

        s1.addCourse("English");

        System.out.println(s2.getCourses());
        }
    }