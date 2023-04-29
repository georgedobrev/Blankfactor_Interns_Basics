using System;
using System.Collections.Generic;

public class Printer
{
    public static int CountUnfinishedTasks(int[] tasks, int[] papers)
    {
        int unfinishedTasks = 0;

        for (int i = 0; i < tasks.Length; i++)
        {
            if (papers[i] == tasks[i])
            {
                continue;
            }

            for (int j = i + 1; j < tasks.Length; j++)
            {
                if (papers[j] == tasks[i])
                {
                    int temp = papers[i];
                    papers[i] = papers[j];
                    papers[j] = temp;
                    break;
                }
            }

            if (papers[i] != tasks[i])
            {
                unfinishedTasks++;
            }
        }

        return unfinishedTasks;
    }
}

public class Program
{
    static void Main(string[] args)
    {
        int[] tasks = { 1, 1, 0, 1, 0, 1, 0, 1 };
        int[] papers = { 1, 1, 0, 0, 1, 1, 0, 0 };

        int unfinishedTasks = Printer.CountUnfinishedTasks(tasks, papers);

        Console.WriteLine("Number of unfinished tasks: " + unfinishedTasks);
    }
}