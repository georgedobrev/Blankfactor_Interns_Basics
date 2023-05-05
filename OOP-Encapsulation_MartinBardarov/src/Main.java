import java.util.ArrayList;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<String> courses = new ArrayList<>();
        courses.add("kk");
        courses.add("cc");
        Student student = new Student("Martin", 22, courses);

        student.addCourse("lol");
        System.out.println(student.getCourses());
        student.removeCourse("cc");
        System.out.println(student.getCourses());


    }
}