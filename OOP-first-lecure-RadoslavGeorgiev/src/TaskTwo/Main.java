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
        Family family = new Family();



        family.getOldestMember(members);


    }

}

