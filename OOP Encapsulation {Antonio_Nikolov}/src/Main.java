import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        ArrayList<String> courses = new ArrayList<String>();

        Student student = new Student("Antonio", 29, courses);

        courses.add("React");

        System.out.println(student.getName() + " has completed the following courses: " + String.join(", ", student.getCourses()));



    }
}