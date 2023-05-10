package FamilyAndPersons;

import java.util.Scanner;

public final class SetFamily {
    public static void setFamilyMembers() {
        Scanner scanner = new Scanner(System.in);
        Family pFamily = new Family();

        System.out.println("Please enter the number of people you want to add to a family: ");
        int numOfPeople = scanner.nextInt();

        for (int i = 0; i < numOfPeople; i++) {
            System.out.println("Enter the person name: ");
            String name = scanner.next();

            System.out.println("Enter the age of " + name + ": ");
            int age = scanner.nextInt();

            pFamily.AddMember(new Person(name, age));
        }

        if (numOfPeople > 0) {
            System.out.println("Great! You have added every person to the family list.");
        }
        pFamily.GetOldestMember();

    }
}
