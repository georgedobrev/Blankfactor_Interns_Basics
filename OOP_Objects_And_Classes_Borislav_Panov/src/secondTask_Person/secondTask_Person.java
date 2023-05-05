package secondTask_Person;

public class secondTask_Person {
    public static void main(String[] args) {
        Person person1 = new Person("Bobi", 15);
        Person person2 = new Person("Gosho", 50);
        Person person3 = new Person("Maria", 40);

        Family family = new Family();
        family.addMember(person1);
        family.addMember(person2);
        family.addMember(person3);



        Person oldest = family.GetOldestMember();
        System.out.println("The oldest family member is " + oldest.getName() + ", age: " + oldest.getAge());
    }
}