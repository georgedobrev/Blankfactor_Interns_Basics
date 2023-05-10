public class Studentt {
    private String name;
    private int age;
    private String[] courses;

    public Studentt(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new String[0];

    }

    public void addCourse(String course) {
        String[] newCourses = new String[courses.length + 1];
        for (int i = 0; i < courses.length; i++) {
            newCourses[i] = courses[i];
        }
        newCourses[courses.length] = course;
        this.courses = newCourses;
    }

    public void removeCourse(String course) {
        int index = -1;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(course)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newCourses = new String[courses.length - 1];
            for (int i = 0, j = 0; i < courses.length; i++) {
                if (i != index) {
                    newCourses[j] = courses[i];
                    j++;
                }
            }
            this.courses = newCourses;
        }
    }

    public String[] getCourses() {
        return courses;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}