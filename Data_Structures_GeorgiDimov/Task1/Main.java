import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> tasks = new LinkedList<>();
        Stack<Integer> paper = new Stack<>();
        tasks.add(1);
        tasks.add(0);
        tasks.add(1);
        tasks.add(0);
        tasks.add(1);

        paper.add(0);
        paper.add(1);
        paper.add(1);
        paper.add(0);
        paper.add(0);
        System.out.println(printerTask(tasks, paper) + " tasks were unable to finish.");
    }


    public static int printerTask(Queue<Integer> tasks, Stack<Integer> paper) {
        int count;
        boolean unableToExecute = false;
        while (!tasks.isEmpty()){
            int currentTask = tasks.poll();
            if(!paper.isEmpty() && paper.peek() == currentTask){
                paper.pop();
            }else{
                tasks.offer(currentTask);
                unableToExecute = true;
            }
            if((tasks.isEmpty() || unableToExecute) && tasks.peek() == currentTask){
                break;
            }
            unableToExecute = false;
        }
        count = tasks.size();
        return count;
    }
}