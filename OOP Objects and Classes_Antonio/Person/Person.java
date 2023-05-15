package Person;

import java.util.ArrayList;

public class Person {
    public Person(String name, int age, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    private String name = "Antonio";
    private int age  = 29;

    ArrayList<String> courses = new ArrayList<String>();

    public String getName (String name){
        return name;
    };

    public int age (int age){
        return age;
    };

    public ArrayList<String> addCourse(String course){
        courses.add(course);
        return courses;
    }

    public ArrayList<String> removeCourse (int index){
        courses.remove(index);
        return courses;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}
