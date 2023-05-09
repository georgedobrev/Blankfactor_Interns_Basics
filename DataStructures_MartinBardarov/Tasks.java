import java.util.*;

public class Tasks {

    Scanner scanner = new Scanner(System.in);

    public int loadTasks() {
        System.out.println("Enter the number of Tasks!");
        int numberOfTasks = scanner.nextInt();
        return numberOfTasks;
    }

    public Queue<Integer> addTask(int numberTasks) {

        Queue<Integer> loadedLists = new LinkedList<>();
        System.out.println("Please choose the needed paper for the task 0 for plain or 1 for glossy paper!");
        for (int i = 0; i < numberTasks; i++) {
            int list = scanner.nextInt();
            while (list != 1 && list != 0) {
                System.out.println("Please choose a valid paper type");
                list = scanner.nextInt();
            }
            loadedLists.add(list);
        }

        return loadedLists;
    }
}

