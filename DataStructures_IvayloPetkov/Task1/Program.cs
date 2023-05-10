using System;

namespace Application
{
    class Program
    {

        static void Function()
        {

            Console.Write("What type of papers are loaded into the printer right now? : plain - 0   or   glossy - 1?");
            string TypeOfPaper = Console.ReadLine();

            Console.Write("How many tasks does each user have? ");
            int NumTasks = int.Parse(Console.ReadLine());

            string[] Users = { "User 1", "User 2", "User 3", "User 4" };
            string[,] TaskTypes = new string[Users.Length, NumTasks];

            for (int i = 0; i < Users.Length; i++)
            {
                Console.WriteLine($"Enter the type of paper for {Users[i]}'s tasks:");

                for (int j = 0; j < NumTasks; j++)
                {
                    Console.Write($"Task {j + 1}: ");
                    TaskTypes[i, j] = Console.ReadLine();
                }
            }

            Console.WriteLine("The tasks from the following users will be executed:");
            for (int i = 0; i < Users.Length; i++)
            {
                for (int j = 0; j < NumTasks; j++)
                {
                    if (TaskTypes[i, j] == TypeOfPaper)
                    {
                        Console.WriteLine($"{Users[i]} - Task {j + 1}");
                    }
                }
            }
        }

        static void Main(string[] args)
        {
            function();
        }
    }
}