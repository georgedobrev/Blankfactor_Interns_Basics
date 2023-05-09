package TaskTwo;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> members;

    public Family() {
        members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public void getOldestMember(Family personlist) {
        Person oldest = personlist.getMembers().get(0);
        for (int i = 1; i < personlist.getMembers().size(); i++) {
            if (personlist.getMembers().get(i).getAge() > oldest.getAge()) {
                oldest = personlist.getMembers().get(i);
                System.out.println("The oldest member is " + oldest.getName() + " who is " + oldest.getAge() + " years old.");
            }
        }

    }
}



