package Family;

import java.util.LinkedList;
import java.util.List;

public class Family {
    List<Person> people = new LinkedList<>();

    public void addMember(Person member)
    {
        people.add(member);
    }

    public Person getOldestMember()
    {
        Person oldest = people.get(0);
        for (int i = 0; i < people.size(); i++) {
            Person currMember = people.get(i);

            if(currMember.getAge() > oldest.getAge())
            {
                oldest = currMember;
            }
        }
        return oldest;
    }

}
