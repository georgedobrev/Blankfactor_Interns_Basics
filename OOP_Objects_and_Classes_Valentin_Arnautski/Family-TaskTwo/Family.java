package TaskTwo;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> familyMembers = new ArrayList<>();

    public void addMember(Person member) {
        familyMembers.add(member);
    }

    public List<Person> getFamilyMembers(){
        return  familyMembers;
    }

    public void setFamilyMembers(List<Person> familyMembers){
        this.familyMembers = familyMembers;
    }

    public void getOldestFamilyMember(){
    Person oldest = familyMembers.get(0);
    for(int i = 1; i < familyMembers.size();i++){
        if(familyMembers.get(i).getAge() > oldest.getAge()){
            oldest = familyMembers.get(i);
        }
    }
    }
}
