using System;

namespace StudentCoursesEncapsulation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student student = new Student("ivan" , 6);           
            student.AddCourse("basic");
            student.AddCourse("advanced");
            student.GetCourses();

            student.RemoveCourse("basic");
            student.GetName();
            student.GetAge();
            student.GetCourses();
            
        }
    }
}
