//PRINTER TASK 1 OF DATA STRUCTURES
//The printer in the office has two types of paper: plain and glossy, which are represented by the numbers 0 and 1, respectively.
//    Employees start submitting tasks to the printer. Each job is specifying the type of paper it requires.
//The number of papers in the printer is equal to the number of tasks.
//Before the execution of each task:
//If it prefers the paper type that is currently available, the task will be executed.
//Otherwise, the paper remains unused and ready for the next task. And the current task will be placed as last and will wait for all others to be done
//so it can try again.
//This continues until none of the tasks want to take the top paper and are thus unable to print the document.
//Write a function that accepts two parameters: an array of tasks and an array of papers’ type and returns the number
//    of tasks that are unable to finish.

using System;

using System.Collections;


class Program
{
    public static int CountofUnfinishedtasks(int[] tasks, int[] paper)
    {
        int numofTasks = tasks.Length;
        int numofPapers = paper.Length;
        int numofUnusedPaper = 0;
        int numofUnfinishedTasks = 0;

        for (int i = 0; i < numofTasks; i++)
        {
            bool paperAvailable = false;
            for (int j = 0; j < numofPapers; j++)
            {
                if (tasks[i] == paper[j])
                {
                    paper[j] = -1;
                    paperAvailable = true;
                    break;

                }
            }
            if (!paperAvailable)
            {
                numofUnusedPaper++;
                numofUnfinishedTasks++;
            }
        }
        while (numofUnusedPaper > 0)
        {
            bool paperAvailable = false;
            for (int i = numofTasks - numofUnfinishedTasks; i < numofTasks; i++)
            {
                if (tasks[i] == paper[numofPapers - numofUnusedPaper])
                {
                    paper[numofPapers - numofUnusedPaper] = -1;
                    paperAvailable = true;
                    numofUnfinishedTasks--;
                    break;
                }
            }
            if (!paperAvailable)
            {
                numofUnusedPaper--;
            }
        }
        return numofUnfinishedTasks;
    }

    static void Main(string[] args)
    {
        int[] tasks = { 1, 1, 1, 0, 1, 1 };
        int[] paper = { 0, 1, 1, 1, 0, 0, 0 };

        int numberofUnfinishedtasks = CountofUnfinishedtasks(tasks, paper);
        Console.WriteLine($"Number of unfinished tasks: {numberofUnfinishedtasks}");

    }


}

