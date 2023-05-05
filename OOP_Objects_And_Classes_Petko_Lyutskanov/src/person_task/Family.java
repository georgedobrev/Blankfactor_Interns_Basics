package person_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Family {
    private List<Person> people;

    public Family() {
        people = new ArrayList<>();
    }

    public Family(List<Person> people) {
        this.people = people;
    }

    public void addMember(Person member) {
        people.add(member);
    }

    public Person getOldestMember() {
        return people.stream().max(Comparator.comparing(Person::getAge)).get();
    }
}
