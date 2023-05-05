
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class PrinterTask {

    public static void main(String[] args) {

        //Стака и Кю-то се попълват автоматично със случайно числа чрез метода push.
        Stack paper = new Stack();
        Queue<Integer> tasks = new LinkedList<>();
        push(tasks, paper, 10);

        System.out.println("Loaded paper and tasks:\npaper: " + paper);
        System.out.println("tasks: " + tasks + "\n");
        completeTasks(paper, tasks);

        if (!tasks.isEmpty()) {
            System.out.println("Not completed tasks: " + tasks);
        } else {
            System.out.println("No remaining tasks!");
        }
    }

    private static void push(Queue<Integer> tasks, Stack paper, int amount) {

        for (int i = 0; i < amount; ++i) {
            Random rand = new Random();
            int randomNum = rand.nextInt((1 - 0) + 1) + 0;
            int randomNum2 = rand.nextInt((1 - 0) + 1) + 0;

            paper.push(randomNum);
            tasks.add(randomNum2);
        }
    }

    private static Queue<Integer> completeTasks(Stack paper, Queue<Integer> tasks) {

        int strike = 0;

        while (strike < paper.size()) {
            if (paper.lastElement() == tasks.element()) {

                paper.pop();
                tasks.remove();

                System.out.println("paper: " + paper);
                System.out.println("tasks: " + tasks);
                System.out.println("Task completed\n");
                strike = 0;

            } else {
                int firstElement = tasks.poll();

                tasks.offer(firstElement);

                System.out.println();
                System.out.println("paper: " + paper);
                System.out.println("tasks: " + tasks);
                System.out.println("Task not completed\n");
                strike++;
            }
        }
        return tasks;
    }
}

