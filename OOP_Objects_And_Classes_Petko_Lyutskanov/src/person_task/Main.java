package person_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family family = new Family();

        System.out.print("Input the number of family members: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Member name: ");
            String name = scanner.nextLine();
            System.out.print("Member age: ");
            int age = Integer.parseInt(scanner.nextLine());

            Person currentPerson = new Person(name, age);
            family.addMember(currentPerson);
        }

        Person oldestPerson = family.getOldestMember();

        System.out.printf("Oldest person name - %s and age - %d", oldestPerson.getName(), oldestPerson.getAge());
    }
}
