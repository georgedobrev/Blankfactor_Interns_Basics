package P02OldestMember;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> members;

    public Family() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        this.members.add(member);
    }

    public Person getOldestMember() {
        Person oldest = null;
        for (Person member : this.members) {
            if (oldest == null || member.getAge() > oldest.getAge()) {
                oldest = member;
            }
        }
        return oldest;
    }
}
