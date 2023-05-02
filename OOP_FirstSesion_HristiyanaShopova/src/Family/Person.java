package Family;

public class Person {
    private String name;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public Person(String nameC, int age)
        {
            this.name = nameC;
            this.age = age;
        }
}
