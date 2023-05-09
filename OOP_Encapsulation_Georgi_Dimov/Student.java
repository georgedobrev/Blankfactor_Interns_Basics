import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> courses;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }

    public void removeCourse(String course){
        this.courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
