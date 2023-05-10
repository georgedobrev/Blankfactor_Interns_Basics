import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Person1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Family {
    private List<Person1>members = new ArrayList<>();

    public void addMember(Person1 member) {
        members.add(member);
    }
    public  Person1 getOldestMember() {
        Person1 oldest =- null;
        for (Person1 member : members) {
            if (oldest == null) || member.getAge() >oldest.getAge()) {
                oldest = member;
            }
        }
        return oldest;
    }
}