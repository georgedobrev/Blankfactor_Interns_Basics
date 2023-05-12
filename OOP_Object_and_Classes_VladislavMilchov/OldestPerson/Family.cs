
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace OldestPerson
{
    internal class Family
    {
        List<Person> people;

        public Family()
        {
            this.people = new List<Person>();   
        }

        public void AddMember(Person person)
        {
            this.people.Add(person);

            
        }

        public void GetOldestMember()
        {
           
            people.Sort((p1, p2) => p2.Age.CompareTo(p1.Age));
            Console.WriteLine($"Oldest person {people[0]}");


            //   Dictionary<string, int> members = new Dictionary<string, int>();
            //   members.Add(name.Name, age.Age);    
            //  foreach (Person mem(ber in people) 
            //   {
            //       Console.WriteLine(member);
            //   }
        }

    }
}
