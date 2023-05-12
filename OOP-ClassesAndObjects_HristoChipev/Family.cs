using System;
namespace OOP_Objects_Classes
{
    public class Family
    {
        private List<Person> family;

        public Family(List<Person> people)
        {
            this.family = people;
        }

        public void AddMember(Person person)
        {
            family.Add(person);
        }

        public Person GetOldestMember()
        {
            var oldestPerson = family.First();

            foreach (var person in family)
            {
                if (oldestPerson.Age < person.Age)
                {
                    oldestPerson = person;
                }
            }

            return oldestPerson;
        }

        public void PrintFamily()
        {
            if (family.Count < 1)
            {
                Console.WriteLine("[]");
                return;
            }

            foreach (var person in family)
            {
                if (person != family.Last())
                {
                    Console.Write($"[{person.Name}, {person.Age}], ");
                }
                else
                {
                    Console.Write($"[{person.Name}, {person.Age}]");
                }
            }

            Console.WriteLine();
        }
    }
}

