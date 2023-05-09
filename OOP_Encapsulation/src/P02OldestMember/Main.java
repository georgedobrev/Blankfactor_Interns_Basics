package P02OldestMember;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Family family = new Family();

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            Person person = new Person(name, age);
            family.addMember(person);
        }

        Person oldest = family.getOldestMember();
        System.out.println("The oldest family member is " + oldest.getName() + " who is " + oldest.getAge() + " years old.");
    }
}
