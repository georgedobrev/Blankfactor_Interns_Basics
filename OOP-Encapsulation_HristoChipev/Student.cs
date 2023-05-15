using System;
namespace OOP_Encapsulation
{
    public class Student
    {
        private string name;
        private int age;
        private List<string> courses;

        public Student(string name, int age, string[] courses)
        {
            this.name = name;
            this.age = age;
            this.courses = new List<string>(courses);
        }

        public void AddCourse(string course)
        {
            courses.Add(course);
        }

        public void RemoveCourse(string course)
        {
            courses.Remove(course);
        }

        public string[] GetCourses()
        {
            return courses.ToArray();
        }

        public string Name
        {
            get { return name; }
        }

        public int Age
        {
            get { return age; }
        }
    }
}

