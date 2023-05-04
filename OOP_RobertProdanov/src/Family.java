import java.util.ArrayList;
import java.util.Collections;

public class Family {

    private ArrayList<Person> members = new ArrayList<Person>();


    public void addMember(Person member) {
        this.members.add(member);
    }



    public String GetOldestMember() {
        Collections.sort(
                this.members,
                (m1, m2) -> m2.getAge()
                        - m1.getAge());


        return this.members.get(0).getName() + ", " +  String.valueOf(this.members.get(0).getAge());
    }


}
