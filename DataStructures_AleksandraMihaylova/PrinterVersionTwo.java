package taskDataStructures;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PrinterVersionTwo {

    public static void main(String[] args) {
        int[] tasks = {0, 1, 1, 0, 1};
        int[] papers = {1, 0, 1, 0, 1};
        int unableTasks = tasksUnableToFinish(tasks, papers);

        System.out.println("Number of tasks unable to finish: " + unableTasks);
    }

    public static int tasksUnableToFinish(int[] tasks, int[] papers) {
        int unableTasks = 0;
        int numOfPapers = papers.length;
        Stack<Integer> unusedPapers = new Stack<Integer>();
        Queue<Integer> waitingTasks = new LinkedList<Integer>();

        for (int i = 0; i < tasks.length; i++) {
            if (numOfPapers > 0 && tasks[i] == papers[numOfPapers-1]) {
                //if the paper type for the task is available, use the paper
                numOfPapers--;
            } else {
                //if not available, go to unusedPapers stack and add task to queue
                unusedPapers.push(tasks[i]);
                waitingTasks.add(i);
            }
        }

        unableTasks = waitingTasks.size();

        while (!unusedPapers.isEmpty() && !waitingTasks.isEmpty()) {
            int waitingTaskIndex = waitingTasks.poll(); //get the first task in the queue
            int requiredPaper = unusedPapers.pop(); //get the latest unused paper from the stack
            if (requiredPaper == papers[numOfPapers]) {
                //if the required paper is available use it
                numOfPapers++;
            } else {
                //if not available, add the task to queue and push the required paper to unusedPapers
                waitingTasks.add(waitingTaskIndex);
                unusedPapers.push(requiredPaper);
            }
        }

        return unableTasks;
    }
}
