using System;

class People
{
    private string name;
    private int age;

    public People(string name, int age)
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
    private List<People> members;

    public Family()
    {
        this.members = new List<People>();
    }

    public void addMembers(People member)
    {
        this.members.Add(member);
    }

    public People GetOldestMember()
    {
        People oldestMember = null;

        foreach (People member in this.members)
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
        int n = int.Parse(Console.WriteLine());

        Family family = new Family();

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("\nEnter name: ");
            // string[] input = Console.ReadLine().Split();
            string name = Console.WriteLine(); //input[0];
            Console.WriteLine("\nEnter age: ");
            int age = int.Parse(Console.WriteLine());

            People person = new People(name, age);
            family.addMembers(person);
        }
        People oldestMember = family.GetOldestMember();

        Console.WriteLine($"Oldest family member is: {oldestMember.Name} {oldestMember.Age}");
    }
}