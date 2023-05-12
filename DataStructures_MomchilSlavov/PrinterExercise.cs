// The goal of this exercise is to check then type of paper a certain printer prefers in order to execute a task.
// Types of paper are specified by the numbers "0" and "1" which represents "plain" and "glossy".
// Otherwise, the paper remains unused and ready for the next task. 
// Thus, the current task will be placed as last and will wait for all others to be done so it can try again.


using System;
using System.Collections.Generic;

public class PrinterResults
{
    public static int Numberofunfinishedtasks(int[] tasks, int[] papers)
    {
        int unfinishedTasks = 0;

        for (int i = 0; i < tasks.Length; i++)
        {

            for (int j = i + 1; j < tasks.Length; j++)
            {
                if (papers[j] == tasks[i])
                {
                    int temp = papers[i];
                    papers[j] = papers[i];
                    papers[j] = temp;

                    break;
                }
            }

            if (tasks [i] != papers [i])
            {
                unfinishedTasks ++;
            }
        }

        return unfinishedTasks;
    }
}

public class Program
{
    static void Main(string[] args)
    {
        int[] tasks = { 1, 1, 0, 1, 0, 1, 0, 1, 1 };
        int[] papers = { 0, 0, 1, 1, 0, 1, 0, 1, 0 };

        int Remainingunfinishedtasks = PrinterResults.Numberofunfinishedtasks (tasks, papers);

        Console.WriteLine("Number of unfinished tasks: " + Remainingunfinishedtasks);
    }
}