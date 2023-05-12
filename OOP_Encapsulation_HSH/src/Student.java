import java.util.ArrayList;

public class Student {

        private String name;
        private int age;
        private ArrayList<String> courses;

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void addCourses(String course)
        {
            for (int i = 0; i < courses.size(); i++) {
                this.courses.set(i, course);
            }
        }

        public void removeCourse(String course)
        {
            this.courses.remove(course);

        }

        public static void main(String[] args) {

        }
    }

