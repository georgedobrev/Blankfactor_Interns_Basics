import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Family {
    private List<Person> people;

    public Family() {
        this.people = new ArrayList<>();
    }

    public void addMember(Person member) {
        people.add(member);
    }

    public Person GetOldestMember() {
        return people.stream().max(Comparator.comparingInt((ToIntFunction<? super Person>) Person::getAge)).get();
    }
}


public class thirdTask {
    public static void main(String[] args) {
        Person person1 = new Person("Bobi", 15);
        Person person2 = new Person("Gosho", 50);
        Person person3 = new Person("Maria", 40);

        Family family = new Family();
        family.addMember(person1);
        family.addMember(person2);
        family.addMember(person3);



        Person oldest = family.GetOldestMember();
        System.out.println("The oldest family member is " + oldest.getName() + ", age: " + oldest.getAge());
    }
}