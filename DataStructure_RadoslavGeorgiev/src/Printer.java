

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//The printer in the office has two types of paper: plain and glossy, which are represented by the numbers 0 and 1, respectively
// . Employees start submitting tasks to the printer.
// Each job is specifying the type of paper it requires.
//The number of papers in the printer is equal to the number of tasks.
//Before the execution of each task:
//If it prefers the paper type that is currently available, the task will be executed.
//Otherwise, the paper remains unused and ready for the next task. And the current task will be placed
// as last and will wait for all others to be done so it can try again.
//This continues until none of the tasks want to take the top paper and are thus unable to print the document.
// Write a function that accepts two parameters: an array of tasks and an array of papers’ type and returns the number of tasks that are unable to finish.


public class Printer {
    public static int notFinishedTasks(int[] tasks, int[] papers) {
        Stack<Integer> printer = new Stack<>();
        Queue<Integer> taskQueue = new LinkedList<>();
        int numUnfinishedTasks = 0;

        int t;
        int p;
        for (t = 0; t < tasks.length; t++) {
            taskQueue.add(t);
        }

        for (p = 0; p < papers.length; p++) {
            printer.add(p);

        }

        while (!taskQueue.isEmpty()) {
            int currentTask = taskQueue.poll();
            int currentPaper = printer.pop();

            if (currentTask != currentPaper) {
                taskQueue.offer(currentTask);

            }

            if (printer.isEmpty() && !taskQueue.isEmpty()) {
                numUnfinishedTasks = numUnfinishedTasks + taskQueue.size();
                break;
            }
        }

        return numUnfinishedTasks;
    }

    public static void main(String[] args) {
        int[] tasks = {1, 0, 1, 1, 0, 1, 1, 1};
        int[] papers = {0, 1, 1, 0, 1, 1, 1, 0, 1};
        int leftTasks = notFinishedTasks(tasks, papers);
        System.out.println("tasks left " + leftTasks);
    }
}

