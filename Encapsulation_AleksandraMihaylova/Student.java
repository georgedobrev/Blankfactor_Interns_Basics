package encapsulation;

import oopObjectsAndClasses.Tire;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String[] courses;

    public Student(String name, int age, String[] courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public void addCourse(String course){
        String[] newCourses = new String[this.courses.length + 1];
        for (int i = 0; i < this.courses.length; i++) {
            newCourses[i] = this.courses[i];
        }

        newCourses[newCourses.length - 1] = course;
        this.courses = newCourses;
    }

    public void removeCourse(String course){
        String[] newCourses = new String[this.courses.length - 1];
        int indexRemove = -1;
        for (int j = 0; j < courses.length; j++) {
            if (courses[j].equals(course)){
                indexRemove = j;
            } else if (indexRemove == -1) {
                newCourses[j] = courses[j];
            }else {
                newCourses[j - 1] = courses [j];
            }
        }

        if (indexRemove != -1){
            courses = newCourses;
        }
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
