package secondTask_Person;

import secondTask_Person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Family {
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
