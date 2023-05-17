using System;

public class Printer
{
    public static int CountUnfinishedTasks(int[] tasks, int[] papers)
    {
        var paperStack = new Stack<int>(papers);
        var tasksQueue = new Queue<int>(tasks);
        var count = 0;

        while (paperStack.Count > 0 && count <= paperStack.Count + 1)
        {
            if (paperStack.Peek() == tasksQueue.Peek())
            {
                paperStack.Pop();
                tasksQueue.Dequeue();
                count = 0;
            }
            else
            {
                tasksQueue.Enqueue(tasksQueue.Dequeue());
                count++;
            }
        }

        return tasksQueue.Count;
    }
}

public class Program
{
    static void Main(string[] args)
    {
        int[] tasks = { 1, 1, 1, 0, 0 };
        int[] papers = { 1, 0, 0, 0, 1 };

        int unfinishedTasks = Printer.CountUnfinishedTasks(tasks, papers);

        Console.WriteLine("Number of unfinished tasks: " + unfinishedTasks);
    }
}