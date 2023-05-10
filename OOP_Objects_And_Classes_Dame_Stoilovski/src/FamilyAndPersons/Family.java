package FamilyAndPersons;

import java.util.ArrayList;
import java.util.Comparator;

public class Family {
    public ArrayList<Person> listOfPeople = new ArrayList<>();

    public void AddMember(Person person) {
        if (!personInListOfPeople(person)) {
            listOfPeople.add(person);
            System.out.println("FamilyAndPersons.Person with name " + person.getName() + " was successfully added to the family members!");
        } else {
            System.out.println("The person you are trying to add to the family members already exists.");
        }
    }

    private boolean personInListOfPeople(Person person) {
        if (listOfPeople == null) {
            return false;
        }
        for (Person p: listOfPeople) {
            if (p == person) {
                return true;
            }
        }
        return false;
    }

    public void GetOldestMember() {
        Person oldestPerson = listOfPeople.stream().max(Comparator.comparing(Person::getAge)).orElse(null);

        if (oldestPerson == null) {
            System.out.println("The list of family members is empty, " +
                    "please add the family members to find the oldest one!");
        } else {
            System.out.println("The oldest family member is " + oldestPerson.getName() +
                    ", " + oldestPerson.getAge() + " years old.");
        }

    }
}
