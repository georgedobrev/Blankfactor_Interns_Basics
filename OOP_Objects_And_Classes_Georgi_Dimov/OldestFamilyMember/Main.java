import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("For how many family members do you want to input data: ");
        int n = input.nextInt();

        Family family = new Family();
        for(int i = 0; i < n; i++){
            System.out.print("(" + (i + 1) + ")" + "Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("(" + (i + 1) + ")" + "Age: ");
            int age = input.nextInt();
            Person person = new Person(name, age);
            family.addMember(person);
        }

        Person oldestMember = family.getOldestFamilyMember();
        System.out.println("Oldest family member\nName: " + oldestMember.getName() + "\nAge: " + oldestMember.getAge());
    }
}