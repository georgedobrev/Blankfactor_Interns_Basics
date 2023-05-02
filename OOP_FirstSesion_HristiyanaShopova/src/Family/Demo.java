package Family;

import Family.Family;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Family family = new Family();

        String name;
        int age;

        System.out.print("Enter the count of family members: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            System.out.printf("Enter the name of member %d: ", i);
            name = scanner.nextLine();
            System.out.printf("Enter the age of member %d: ", i);
            age = Integer.parseInt(scanner.nextLine());

            Person person = new Person(name, age);
            family.addMember(person);

        }

        System.out.printf("The oldest member of the family is called %s and is %d years old.", family.getOldestMember().getName(), family.getOldestMember().getAge());

    }
}
