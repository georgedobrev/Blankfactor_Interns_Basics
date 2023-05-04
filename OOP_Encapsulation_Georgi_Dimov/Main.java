public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 20);
        System.out.println(student.getCourses());
        student.addCourse("Math");
        System.out.println(student.getCourses());
        student.addCourse("Java");
        System.out.println(student.getCourses());
        student.removeCourse("Math");
        System.out.println(student.getCourses());
        System.out.println(student.toString());
    }
}