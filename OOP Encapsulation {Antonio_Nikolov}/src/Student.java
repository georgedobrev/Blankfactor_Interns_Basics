import java.util.ArrayList;

public class Student {

    private String name;
    private int age;

    ArrayList<String> courses = new ArrayList<String>();

    public Student(String name, int age, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
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

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
