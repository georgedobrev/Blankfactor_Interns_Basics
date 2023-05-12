package Family;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Valentin", 88);
        Person person1 = new Person("Vasil", 25);
        Person person2 = new Person("George", 27);
        Person person3 = new Person("Maria", 22);
        Person person4 = new Person("Alex", 45);
        Person person5 = new Person("Peter", 56);
        Person person6 = new Person("Alex", 18);

        Family members = new Family();
        members.addMember(person);
        members.addMember(person1);
        members.addMember(person2);
        members.addMember(person3);
        members.addMember(person4);
        members.addMember(person5);
        members.addMember(person6);

        Person oldest = members.getFamilyMembers().get(0);
        for (int i = 1; i < members.getFamilyMembers().size(); i++) {
            if (members.getFamilyMembers().get(i).getAge() > oldest.getAge()) {
                oldest = members.getFamilyMembers().get(i);
            }
        }

        System.out.println("The oldest family member is " + oldest.getName() + " - " + oldest.getAge() + " years old.");

    }

}