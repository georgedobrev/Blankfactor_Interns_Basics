using System;

namespace OldestPerson
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Input Family members: ");
            int n = int.Parse(Console.ReadLine());
            Family family = new Family();

            for (int i = 0; i < n; i++)
            {

                Person person1 = new Person();
                Console.Write("Input name:");
                person1.Name = Console.ReadLine();
                Console.Write("Input age:");
                person1.Age = int.Parse(Console.ReadLine());
                family.AddMember(person1);
            }

            
            
            family.GetOldestMember();

        }
    }
}