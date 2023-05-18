//Define a class Person with private fields for name and age and public properties Name and Age.
//    Create a class Family. The class should have a list of people, a method for adding members - void AddMember(Person member)
//    and a method returning the oldest family member – Person GetOldestMember(). Write a program that reads the names and ages of N people
//    and adds them to the family. Then print the name and age of the oldest member.

using System;
class Person
{
    private string name;
    private int age;

    public Person(string name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public string Name
    {
        get { return name; }
        set { name = value; }
    }

    public int Age
    {
        get { return age; }
        set { age = value; }
    }


}

class Family
{
    private List<Person> members;


    public Family()
    {
        this.members = new List<Person>();
    }


    public void addMembers(Person member)
    {
        this.members.Add(member);
    }

    public Person GetOldestMember()
    {
        Person oldestMember = null;
        foreach (Person member in this.members)
        {
            if (oldestMember == null || member.Age > oldestMember.Age)
            {
                oldestMember = member;
            }
        }
        return oldestMember;
    }

}

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter number of people: ");
        int n = int.Parse(Console.ReadLine());

        Family family = new Family();

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("\nEnter name: ");
            // string[] input = Console.ReadLine().Split();
            string name = Console.ReadLine(); //input[0];
            Console.WriteLine("\nEnter age: ");
            int age = int.Parse(Console.ReadLine());

            Person person = new Person(name, age);
            family.addMembers(person);
        }
        Person oldestMember = family.GetOldestMember();

        Console.WriteLine($"Oldest family member is: {oldestMember.Name} {oldestMember.Age}");
    }
}