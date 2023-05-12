using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using static System.Net.Mime.MediaTypeNames;

namespace OOP_Encapsulation_MilchoKasmetov
{
    public class Student
    {
        private const int MinAge = 0;
        private const int MaxAge = 120;

        private string _name;
        private int _age;

        public Student(string name, int age)
        {
            this.Name = name;
            this.Age = age;
            this.Courses = new List<string>();
        }


        private string Name
        {
            get
            {
                return _name;
            }
            set
            {
                if (string.IsNullOrWhiteSpace(value) || String.IsNullOrEmpty(value))
                {
                    throw new Exception("Name cannot be empty.");
                }


                this._name = value;
            }
        }

        private int Age
        {
            get
            {
                return _age;
            }
            set
            {
                if (value < MinAge || value > MaxAge)
                {
                    throw new Exception($"Age should be between {MinAge} and {MaxAge}.");
                }


                this._age = value;
            }
        }

        public ICollection<string> Courses { get; set; }


        //addCourse(course: String) : adds a course to the courses array.
        //removeCourse(course: String): removes a course from the courses array.
        //getCourses() -> String[]: returns the courses array.
        //getAge() -> int: returns the age attribute.
        //getName() -> String: returns the name attribute.

        public void AddCourse(string course)
        {
            if (!this.Courses.Contains(course))
            {
                Courses.Add(course);

                Console.WriteLine("Succesfuly added course");
            }
            else
            {
                Console.WriteLine("Already in this course !");
            }
        }

        public void RemoveCourse(string course)
        {
            if (this.Courses.Contains(course))
            {
                Courses.Remove(course);

                Console.WriteLine("Succesfuly removed course");
            }
            else
            {
                Console.WriteLine("There is no such course !");
            }
        }

        public ICollection<string> GetCourses() => this.Courses;
        public int GetAge() => this.Age;
        public string GetName() => this.Name;
    }
}
