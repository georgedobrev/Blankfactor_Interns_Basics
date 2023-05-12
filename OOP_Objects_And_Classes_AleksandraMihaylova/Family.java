package oopObjectsAndClasses;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person> members;
    public Family() {
        members = new ArrayList<>();
    }
    public void addMembers(Person member) {
        members.add(member);
    }
    public Person oldestMember() {
        Person oldest = members.get(0);
        for (int i = 1; i < members.size(); i++) {
            Person temp = members.get(i);
            if (temp.getAge() > oldest.getAge()) {
                oldest = temp;
            }
        }
        return oldest;
    }
}