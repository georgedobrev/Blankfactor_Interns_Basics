package FamilyOperations;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> people=new ArrayList<>();


    public List<Person> getPeople() {
        return people;
    }


    public void setPeople(List<Person> people) {
        this.people = people;
    }


    public void addMember(Person member) {
        people.add(member);
    }

    public Person oldestMember() {
        Person oldestPerson = null;
        int maxAge = 0;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

}
