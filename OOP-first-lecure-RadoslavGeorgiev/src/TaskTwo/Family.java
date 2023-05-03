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

    public void getOldestMember() {
        Person oldest = members.get(0);
        for (int i = 1; i < members.size(); i++) {
            if (members.get(i).getAge() > oldest.getAge()) {
                oldest = members.get(i);

            }
        }

    }
}



