import java.util.LinkedList;
import java.util.Queue;

public class PrinterTask {

    public static int countUnableTasks(int[] tasks, int[] papers) {
        int count = 0;
        Queue<Integer> taskQueue = new LinkedList<>();

        for (int task : tasks) {
            taskQueue.add(task);
        }

        for (int i = 0; i < papers.length; i++) {
            int paper = papers[i];
            boolean found = false;

            for (int j = 0, size = taskQueue.size(); j < size; j++) {
                int task = taskQueue.poll();

                if (!found && task == paper) {
                    found = true;
                } else {
                    taskQueue.add(task);
                }
            }

            if (!found) {
                count++;
            }

            if (taskQueue.isEmpty()) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] tasks = {1, 1, 1, 0, 0, 1};
        int[] papers = {1, 0, 0, 0, 1, 1};
        int count = countUnableTasks(tasks, papers);
        System.out.println("Number of unable tasks: " + count);
    }
}


