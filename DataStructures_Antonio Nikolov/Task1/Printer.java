import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int[] tasks = {0, 1, 0, 1, 1};
        int[] papers = {0, 1, 1, 0, 1};

        int unableToPrint = unableToFinish(tasks, papers);

        System.out.println("Number of unfinished tasks: " + unableToPrint);
    }

    public static int unableToFinish(int[] tasks, int[] papers) {
        int n = tasks.length;
        Queue<Integer> paperAvailable = new LinkedList<>();
        int unableToPrint = 0;

        for (int i = 0; i < n; i++) {
            int taskPaper = tasks[i];

            if (paperAvailable.contains(taskPaper)) {
                paperAvailable.remove(taskPaper);
            } else {
                paperAvailable.add(papers[i]);
                unableToPrint++;
            }
        }

        return unableToPrint;
    }
}
