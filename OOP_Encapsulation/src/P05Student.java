import java.util.ArrayList;

public class P05Student {
    public class Student{
        private String name;
        private int age;
        private ArrayList<String> courses;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
            this.courses = new ArrayList<>();

        }
        public String getName() {

            return name;
        }
        public int getAge() {

            return age;
        }

        public void setName(String name) {

            this.name = name;
        }

        public void setAge(int age) {

            this.age = age;
        }

        public void addCourse(String course) {
            this.courses.add(course);
        }

        public void removeCourse(String course) {
            this.courses.remove(course);
        }

        public String[] getCourses() {
            return this.courses.toArray(new String[0]);
        }

    }


}
