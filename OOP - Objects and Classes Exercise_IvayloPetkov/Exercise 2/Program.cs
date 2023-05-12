using System;

class Person
{
    private string name;
    private int age;

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

    public Person(string name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Family
{
    private List<Person> members = new List<Person>();

    public void AddMember(Person member)
    {
        members.Add(member);
    }

    public Person GetOldestMember()
    {
        int maxAge = int.MinValue;
        Person oldestMember = null;

        foreach (Person member in members)
        {
            if (member.Age > maxAge)
            {
                maxAge = member.Age;
                oldestMember = member;
            }
        }

        return oldestMember;
    }
}

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        Family family = new Family();

        for (int i = 0; i < n; i++)
        {
            string[] input = Console.ReadLine().Split();
            string name = input[0];
            int age = int.Parse(input[1]);
            Person person = new Person(name, age);
            family.AddMember(person);
        }

        Person oldestMember = family.GetOldestMember();
        Console.WriteLine($"{oldestMember.Name} {oldestMember.Age}");
    }
}
