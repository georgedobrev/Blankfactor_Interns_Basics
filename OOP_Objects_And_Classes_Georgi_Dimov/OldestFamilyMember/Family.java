import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> famMembers = new ArrayList<>();

    public void addMember(Person famMember){
        famMembers.add(famMember);
    }

    public Person getOldestFamilyMember(){
        Person oldest = famMembers.get(0);
        for(Person famMember : famMembers){
            if(famMember.getAge() > oldest.getAge()){
                oldest = famMember;
            }
        }
        return oldest;
    }

}
