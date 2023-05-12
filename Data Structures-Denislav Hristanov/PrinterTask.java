public class PrinterTask {

    public static int
    countUnableTasks(int[] tasks, int[] papers) {
        int numTasks = tasks.length;
        int numPapers = papers.length;
        int count = 0;
        int currentPaper = -1;

        for (int i = 0; i < numTasks; i++) {
            int requiredPaper = tasks[i];

            if (requiredPaper == currentPaper) {
                currentPaper = -1;

            } else {
                int j = 0;
                while (j < numPapers && papers[j] != requiredPaper) {
                    j++;
                }
                if (j < numPapers) {
                    papers[j] = -1;
                    currentPaper = requiredPaper;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] tasks = {1, 0, 1, 1, 0};
        int[] papers = {0, 1, 0, 1, 0};
        int count = countUnableTasks(tasks, papers);
        System.out.println("Number of unable tasks: " + count);
    }
}