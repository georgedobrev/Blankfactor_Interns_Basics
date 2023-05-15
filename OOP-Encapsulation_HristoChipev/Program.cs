using OOP_Encapsulation;

var student = new Student("Hristo", 18, new string[] { });

Console.WriteLine(student.Name);
Console.WriteLine(student.Age);
student.AddCourse("Maths");
student.AddCourse("Bel");

foreach (var course in student.GetCourses())
{
    Console.WriteLine(course);
}
Console.WriteLine("-------------");
student.RemoveCourse("Bel");

foreach (var course in student.GetCourses())
{
    Console.WriteLine(course);
}
