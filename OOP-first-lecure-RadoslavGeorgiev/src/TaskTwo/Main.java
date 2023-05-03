package TaskTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Rado", 23);
        Person person1 = new Person("dasd", 13);
        Person person2 = new Person("nbff", 73);
        Person person3 = new Person("sdadw", 53);
        Person person4 = new Person("bfsfs", 31);
        Family members = new Family();
        members.addMember(person);
        members.addMember(person1);
        members.addMember(person2);
        members.addMember(person3);
        members.addMember(person4);

        Person oldest = members.getMembers().get(0);
        for (int i = 1; i < members.getMembers().size(); i++) {
            if (members.getMembers().get(i).getAge() > oldest.getAge()) {
                oldest = members.getMembers().get(i);
            }
        }

        System.out.println("The oldest member is " + oldest.getName() + " who is " + oldest.getAge() + " years old.");


    }

}

