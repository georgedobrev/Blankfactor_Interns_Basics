import java.util.*;
import java.util.stream.Collectors;

public class Printer {
    public static int printTasks(int[] tasks, int[] paperType) {
        List<Integer> tasksList = Arrays.stream(tasks)
                .boxed()
                .toList();
        ArrayDeque<Integer> tasksArrayDeque = new ArrayDeque<>(tasksList);

        Stack<Integer> paperTypeStack = Arrays.stream(paperType)
                .boxed()
                .collect(Collectors.toCollection(Stack::new));

        int counter = 0;

        while (tasksArrayDeque.size() > 0 && counter <= paperTypeStack.size()) {
            if (Objects.equals(tasksArrayDeque.getLast(), paperTypeStack.peek())) {
                tasksArrayDeque.removeLast();
                paperTypeStack.pop();

                counter = 0;
            } else {
                tasksArrayDeque.addFirst(tasksArrayDeque.removeLast());

                counter++;
            }
        }

        return tasksArrayDeque.size();
    }

    public static void main(String[] args) {
        int[] tasks = new int[]{0, 0, 1, 0, 1};
        int[] paperType = new int[]{1, 1, 0, 1, 1};

        int tasksUnableToFinish = printTasks(tasks, paperType);

        System.out.println(tasksUnableToFinish);
    }
}
