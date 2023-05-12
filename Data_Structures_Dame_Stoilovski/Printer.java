import java.util.Deque;
import java.util.Stack;

public class Printer {
    public int printerTaskChecker(int[] paperTypes, Deque<Integer> tasks){
        Stack<Integer> papers = new Stack<>();
        // 1, 0, 1, 1, 0, 0, 1, 0, 1
        for (int n : paperTypes) {
            papers.push(n);
        }
        return calculatePrinterTasks(papers, tasks);
    }

    private int calculatePrinterTasks(Stack<Integer> papers, Deque<Integer> tasks){
        int loopRange = papers.size();

        for (int i = 0; i < loopRange; i++) {
            int printerPaper = papers.pop();
            int taskPaper = tasks.removeFirst();

            if (printerPaper != taskPaper) {
                papers.push(printerPaper);
                tasks.addLast(taskPaper);
            }
        }

        if (checkIfATaskMatchesAtLeastOnePaper(papers, tasks)) {
            calculatePrinterTasks(papers, tasks);
        }
        return tasks.size();
    }

    private boolean checkIfATaskMatchesAtLeastOnePaper(Stack<Integer> papers, Deque<Integer> tasks) {
        if (papers.size() > 0) {
            int paper = papers.pop();
            for (int taskPaper: tasks) {
                if (paper == taskPaper) {
                    papers.push(paper);
                    return true;
                }
            }
        }
        return false;
    }
}