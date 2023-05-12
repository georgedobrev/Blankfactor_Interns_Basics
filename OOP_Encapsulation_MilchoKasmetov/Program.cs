using System.Threading.Channels;

namespace OOP_Encapsulation_MilchoKasmetov
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("How many students ?");
                    var n = int.Parse(Console.ReadLine());

                    var students = new List<Student>();

                    for (int i = 0; i < n; i++)
                    {
                        Console.WriteLine("Write name");

                        var name = Console.ReadLine().Trim();

                        Console.WriteLine("Write Age");

                        var age = int.Parse(Console.ReadLine());

                        Console.WriteLine("Creating student");
                        var student = new Student(name, age);

                        Console.WriteLine("Student created");

                        while (true)
                        {
                            Console.WriteLine("Press Key");
                            Console.WriteLine("1 Add course");
                            Console.WriteLine("2 Remove course");
                            Console.WriteLine("0 Exit");

                            var input = int.Parse(Console.ReadLine().Split().First());

                            if (input == 0)
                            {
                                break;
                            }

                            switch (input)
                            {
                                case 1:
                                    Console.WriteLine("Name of course");

                                    var courseToAdd = Console.ReadLine().ToLower();

                                    student.AddCourse(courseToAdd);

                                    break;
                                case 2:
                                    Console.WriteLine("Name of course");

                                    var courseToRemove = Console.ReadLine().ToLower();

                                    student.RemoveCourse(courseToRemove);

                                    break;
                                default:
                                    Console.WriteLine("Invalid input option !");
                                    break;
                            }

                        }

                        students.Add(student);
                    }
                    Console.WriteLine(new string('-', 100));
                    students.ForEach(student => 
                    Console.WriteLine($"Student name: {student.GetName()}, Student age: {student.GetAge()}, Courses -> {(student.Courses.Count != 0 ? string.Join(", ", student.Courses) : "None :(")}"));

                    Console.WriteLine(new string('-', 100));

                }
                catch (Exception e)
                {
                    Console.WriteLine($"ERROR TRY AGAIN :( {e.Message}");
                }
            }

        }
    }
}