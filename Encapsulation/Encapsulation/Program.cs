using System;
using Microsoft.VisualBasic;
using System.Xml.Linq;
using System.Linq;

//Create a class called Student that has the following attributes:
//name(a string)
//age(an integer)
//courses(an array of strings)

//The class should have the following methods:
//addCourse(course: String): adds a course to the courses array.
//removeCourse(course: String): removes a course from the courses array.
//getCourses() -> String[]: returns the courses array.
//getAge() -> int: returns the age attribute.
//getName() -> String: returns the name attribute.

//Ensure that the name and age attributes cannot be accessed or modified directly from outside the class.
//    The addCourse and removeCourse methods should be the only way to modify the course array.

class Student
{
    private string name;
    private int age;
    //private List<string> courses;
    private string[] courses;

    public Student(string name, int age)
    {
        this.name = name;
        this.age = age;
        this.courses = new string[0];     //new List<string>();
    }

    public void addCourse(string course)
    {

        // this.courses.Add(course); //
        Array.Resize(ref this.courses, this.courses.Length + 1);
        this.courses[this.courses.Length - 1] = course;
    }

    public void removeCourse(string course)
    {
        string[] newCourses = new string[this.courses.Length - 1];
        int indexRem = -1;
        for (int i = 0; i < courses.Length; i++)
        {
            if (courses[i].Equals(course))
            {
                indexRem = i;
            }
            else if (indexRem == -1)
            {
                newCourses[i] = courses[i];
            }
            else
            {
                newCourses[i - 1] = courses[i];
            }
        }

        if(indexRem != -1)
        {
            courses = newCourses;
        }
        //this.courses.Remove(course);
        //int index = Array.IndexOf(this.courses, course);
        //if(index >= 0)
        //{
        //    for(int i = 0; i <this.courses.Length - 1; i++)
        //    {
        //        this.courses[i] = this.courses[i + 1];
        //    }
        //    Array.Resize(ref this.courses, this.courses.Length - 1);
        //}
    }

    public string[] Courses()
    {
        return this.courses; //.ToArray();
    }

    public int getAge()
    {
        return this.age;
    }

    public string getName()
    {
        return this.name;
    }


}





class Program
{
    static void Main(string[] args)
    {
        Student student1 = new Student("Aleksandar Arsov", 22);


        student1.addCourse("Math");
        student1.addCourse("Physics");
        student1.addCourse("Economics");
        student1.addCourse("Programming");


        student1.removeCourse("Math");


        string name = student1.getName();
        Console.WriteLine("Name: " + name);

        int age = student1.getAge();
        Console.WriteLine("Age: " + age);

        string[] courses = student1.Courses();
        Console.WriteLine("Courses:");
        foreach (string course in courses)
        {
            Console.WriteLine(" " + course);
        }
    }

}