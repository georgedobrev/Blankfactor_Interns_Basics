import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public String[] getCourses() {
        return courses.toArray(new String[0]);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
