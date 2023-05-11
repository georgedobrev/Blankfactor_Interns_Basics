import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P01PrinterOffice {

    public static void main(String[] args) {
        int[] tasks = {0,1,1,1,1,1};
        int[] paper = {1,0,0,1,1,1};
        System.out.println(printerJob(paper, tasks));
    }

    public static int printerJob(int[]paper, int[] tasks){
        int failedTasks = 0;

        Queue<Integer> queueTasks = new LinkedList<>();
        Stack<Integer> stackPaper = new Stack<>();

        for (int i = 0; i < paper.length; i++) {
            queueTasks.offer(tasks[i]);
            stackPaper.push(paper[i]);
        }
        int strike = 0;
        for (int i = 0; i < paper.length + strike ; i++) {
            int z = queueTasks.peek();
            int y = stackPaper.peek();
            if (y == z) {
                queueTasks.poll();
                stackPaper.pop();
                //strike++;
            } else {
                int x = 0;
                x = queueTasks.poll();
                queueTasks.offer(x);
                }

            }
        failedTasks = queueTasks.size();

        return failedTasks;
    }


}
