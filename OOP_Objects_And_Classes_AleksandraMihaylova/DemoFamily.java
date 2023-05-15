package oopObjectsAndClasses;

import java.util.Scanner;

public class DemoFamily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family family = new Family();
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of person number " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the age of person number " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            Person person = new Person(name, age);
            family.addMembers(person);
        }
        Person oldest = family.oldestMember();
        System.out.println("The oldest family member is " + oldest.getName() + " and is " + oldest.getAge() + " years old.");
    }
}
