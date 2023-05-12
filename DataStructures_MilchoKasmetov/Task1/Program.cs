namespace Task1;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Input tasks -- write it separated with , ");
        Queue<string> taskQueue = new Queue<string>(Console.ReadLine().Split(", ", StringSplitOptions.RemoveEmptyEntries));

        // plain, glossy, plain

        Console.WriteLine("Insert paper -- write it separated with , ");
        Stack<byte> paperStack = new Stack<byte>((Console.ReadLine().Split(", ", StringSplitOptions.RemoveEmptyEntries).Select(x => byte.Parse(x)).Reverse()));

        //  0, 0, 0
        // int count = taskQueue.Count;

        while (taskQueue.Count != 0 || paperStack.Count != 0)
        {
            string currentTask = taskQueue.Peek();
            byte currentPaper = paperStack.Peek();

            if (currentTask == Enum.GetName(typeof(TypeOfPaper), currentPaper))
            {
                taskQueue.Dequeue();
                paperStack.Pop();
            }
            else
            {
                taskQueue.Enqueue(currentTask);
                taskQueue.Dequeue();
            }

        

            if (!taskQueue.Any( x => x == Enum.GetName(typeof(TypeOfPaper), currentPaper)))
            {
                break;
            }

        }

        Console.WriteLine($"Number of unfinished tasks: {taskQueue.Count}");

    }
}

