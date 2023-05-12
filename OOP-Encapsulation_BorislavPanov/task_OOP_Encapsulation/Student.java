package task_OOP_Encapsulation;

import java.util.ArrayList;
public class Student {
    private final String name;
    private final String age;
    private final ArrayList<String> courses;
    public Student(String name, String age, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    void addCourse(String course) {
        this.courses.add(course);
    }

    void removeCourse(String course) {
        this.courses.remove(course);
    }

    ArrayList<String> getCourses() {
        return this.courses;
    }

    String getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
