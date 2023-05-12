import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList();
        Student student = new Student("Robi", 19, courses);
        
        student.addCourse("Math");
        student.addCourse("Programming");
        student.removeCourse("Math");

        System.out.println(student.getCourses());


    }
}