using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task2
{
    public abstract class BaseFamily
    {
        private ICollection<BasePerson> persons;

        protected BaseFamily()
        {
            this.persons = new List<BasePerson>();
        }

        public void AddMember(BasePerson member)
        {
            var person = persons.FirstOrDefault(x => x.Name == member.Name);

            if ( person == null)
            {
                this.persons.Add(member);
                Console.WriteLine($"{member.Name} added successfully in the family !!!");
            }
            else
            {
                Console.WriteLine($"{member.Name} is already in the family !!!");
            }
        }

        public  BasePerson GetOldestMember()
        {
            return this.persons.MaxBy(x => x.Age);
        }
    }
}
