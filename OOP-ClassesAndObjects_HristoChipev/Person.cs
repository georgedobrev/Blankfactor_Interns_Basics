using System;
namespace OOP_Objects_Classes
{
    public class Person
    {
        private string name;
        private int age;

        public Person(string name, int age)
        {
            this.age = age;
            this.name = name;
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
}

