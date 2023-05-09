import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> courses = new ArrayList<>();

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Student(String name, int age, List<String> courses) {
        this(name, age);
        this.setCourses(courses);
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
        if (age <= 0) {
            throw new IllegalArgumentException("The age cannot be zero or less than zero.");
        }
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        if (!this.getCourses().contains(course)) {
            this.getCourses().add(course);
            System.out.println("The course " + course + " was successfully added to " + this.getName()+  "'s courses.");
        } else {
            System.out.println("The course " + course + " is already added. Try adding different course.");
        }
    }

    public void removeCourse(String course) {
        if (this.getCourses().contains(course)) {
            this.getCourses().remove(course);
            System.out.println("The course " + course + " was successfully removed from the " + this.getName() + "'s courses.");
        } else {
            System.out.println("The course " + course + " was not found in the student's courses.");
        }
    }
}
