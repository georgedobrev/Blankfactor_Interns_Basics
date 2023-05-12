using System;
using Microsoft.VisualBasic;

// 1. The goal of this exercise is to create a class called "Student" which possesses the following attributes:
//    * name(a string)
//    * age(an integer)
//    * courses(an array of strings)
// 2. Moreover, the following methods need to be integrated within the course:
//    * addCourse(course: String): adds a course to the courses array.
//    * removeCourse(course: String): removes a course from the courses array.
//    * getCourses() -> String[]: returns the courses array.
//    * getAge() -> int: returns the age attribute.
//    * getName() -> String: returns the name attribute.

//    Moreover, in order to complete the exercise we need to ensure that the name and age attributes cannot be accessed or modified directly from outside the class. The addCourse and removeCourse methods should be the only way to modify the course array.

namespace EncapsulationCourses
{
    internal class Student
    {
        private int age;
        private string name;
        private List<string> courses = new List<string>();


        public int Age
        {
            get { return age; }
            set { age = value; }
        }
        public string Name
        {
            get { return name; }
            set { name = value; }
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
            this.age = age;
            this.name = name;
        }



        public void AddCourse(string Course)
        {
            courses.Add(Course);
        }

        public void RemoveCourse(string Course)
        {
            if (courses.Contains(Course))
            {
                courses.Remove(Course);
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
            student.Age = Age;
            Console.WriteLine(student.age);
        }


        public void GetName()
        {
            Student student = new Student();
            student.Name = Name;
            Console.WriteLine(student.Name);

        }
    }
}