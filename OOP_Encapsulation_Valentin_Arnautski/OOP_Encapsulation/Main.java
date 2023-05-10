package OOP_Encapsulation;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Valentin", 24);
        student.addCourse("Object-Orientated-Programming");
        student.addCourse("Computer Science");
        student.addCourse("Math");

        System.out.println("----------------------------------------------------");
        System.out.println(student.getName() + " - " + student.getAge() + " years old");
        System.out.println(Arrays.toString(student.getCourses()));
        student.removeCourse("Computer Science");
        System.out.println(Arrays.toString(student.getCourses()));

        System.out.println("----------------------------------------------------");

        Student student1 = new Student("Petar", 30);
        student1.addCourse("Front-end");
        student1.addCourse("Science");
        student1.addCourse("Biology");

        System.out.println(student1.getName() + " - " + student1.getAge() + " years old");
        System.out.println(Arrays.toString(student1.getCourses()));
        student1.removeCourse("Science");
        System.out.println(Arrays.toString(student1.getCourses()));

    }
}
