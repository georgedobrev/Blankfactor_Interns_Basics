import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private ArrayList<String> courses;

    public Student(String name, int age, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course){
        this.getCourses().add(course);
    }


    public void removeCourse(String course){
        this.getCourses().remove(course);

    }


}
