import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {


    public static void main(String[] args) {

        Printer printer = new Printer();
        Tasks tasks = new Tasks();

        Stack<Integer> loadedPrinter = printer.addPaper(printer.loadLists());
        Queue<Integer> loadedTasks = tasks.addTask(tasks.loadTasks());
//        System.out.println(Arrays.asList(loadedPrinter));
//        System.out.println(loadedLists);

        if (loadedPrinter.size() != loadedTasks.size()) {
            System.out.println("Sorry not enough papers for the required tasks");
        }

        else {
          int unfinishedTasks=unfinishedTasks(loadedPrinter,loadedTasks);
            System.out.println(unfinishedTasks);

        }

    }



    public static int unfinishedTasks(Stack<Integer> printer,Queue<Integer> tasks){
        int counter=0;
        while(printer.size()>0 && counter<printer.size()){
            if(printer.peek().equals(tasks.peek())){
                printer.pop();
                tasks.remove();
                counter=0;
            }
            else{
                tasks.add(tasks.remove());
                counter++;
            }
        }

        return tasks.size();

    }

}