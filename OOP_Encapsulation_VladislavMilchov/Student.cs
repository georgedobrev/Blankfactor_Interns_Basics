using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace StudentCoursesEncapsulation
{
    internal class Student
    {

        private string name;
        private int age;
        private List<string> courses = new List<string>();

        public string Name
        {
            get { return name; } set { name = value; }
        }
        public int Age
        {
            get { return age; }
            set { age = value; }
        }
        public List<string> Courses
        {
            get { return courses; }
            set { courses = value; }
        }

        public Student()
        {
        }

        public Student(string name, int age)
        {
            this.name = name;
            this.age = age;

        }



        public void AddCourse(string course)
        {
            courses.Add(course);
        }

        public void RemoveCourse(string course)
        {
            if (courses.Contains(course))
            {
                courses.Remove(course);
            }
        }

        public void GetCourses()
        {

            for (int i = 0; i < courses.Count; i++)
            {                
                Console.WriteLine(courses[i]);
            }
        }

        public void GetAge()
        {
            Student student = new Student();
            student.Age = age;
            Console.WriteLine(student.age);
        }


        public void GetName()
        {
            Student student = new Student();
            student.Name = name;
            Console.WriteLine(student.name);

        }



        
        
    }
}
