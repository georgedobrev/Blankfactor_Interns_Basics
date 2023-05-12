package FamilyOperations;

import java.util.Scanner;

public class App {

    public static void run(int numberOfPeople) {
        Family family=new Family();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter the person's name");
            String name = scanner.next();
            System.out.println("Enter the age");
            int age = scanner.nextInt();
            Person person = new Person(name, age);
            family.addMember(person);

        }
        System.out.println(family.oldestMember());


    }
}
