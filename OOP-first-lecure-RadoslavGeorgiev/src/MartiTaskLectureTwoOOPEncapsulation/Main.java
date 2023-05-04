package MartiTaskLectureTwoOOPEncapsulation;

public class Main {
        public static void main(String[] args) {
            Student s = new Student("Rado", 23);
            s.addCourse("Math");
            s.addCourse("English");
            s.removeCourse("English");

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Courses: " + String.join(", ", s.getCourses()));
        }
    }

