package task_OOP_Encapsulation;

import java.util.ArrayList;

public class task {
    public static void main(String[] args) {
        Student s = new Student("Borislav", "21", new ArrayList<String>());
        s.addCourse("C#");
        s.addCourse("Java");
        s.addCourse("JavaScript");
        s.removeCourse("C#");
        System.out.println("Name: " + s.getName() + "\nAge: " + s.getAge() + "\nCourses: " + s.getCourses());
    }
}
