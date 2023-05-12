import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {
        int[] tasks = {1,1,1};
        int[] papers = {1,0,0};
        int leftTasks = notFinishedTasks(tasks, papers);
        System.out.println("tasks left " + leftTasks);
    }
    public static int notFinishedTasks(int[] tasks, int[] papers) {
        Queue<Integer> printer = new LinkedList<>();
        Queue<Integer> taskQueue = new LinkedList<>();
        int numUnfinishedTasks = 0;

        int t;
        int p;
        for (t = 0; t < tasks.length; t++) {
            taskQueue.add(tasks[t]);
        }

        for (p = 0; p < papers.length; p++) {
            printer.add(papers[p]);

        }



        while (taskQueue.size() > 0 && numUnfinishedTasks <= printer.size()) {

            if (taskQueue.peek() == printer.peek()) {
                taskQueue.poll();
                printer.poll();
                numUnfinishedTasks = 0;
            }else{
                taskQueue.offer(taskQueue.poll());
                numUnfinishedTasks++;
            }

        }

        return taskQueue.size();
    }


}
