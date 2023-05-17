import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Family {
    private List<Person> members;

    public Family() {
        members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

    public Person getOldestMember() {
        Person oldestMember = members.get(0);

        for (int i = 1; i < members.size(); i++) {
            if (members.get(i).getAge() > oldestMember.getAge()) {
                oldestMember = members.get(i);
            }
        }

        return oldestMember;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family family = new Family();

        System.out.print("Enter the number of people: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the age of person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Person person = new Person(name, age);
            family.addMember(person);
        }

        Person oldestMember = family.getOldestMember();
        System.out.println("Oldest member: " + oldestMember.getName() + ", Age: " + oldestMember.getAge());
    }
}
