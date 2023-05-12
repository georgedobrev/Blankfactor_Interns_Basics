package taskDataStructures;

public class Printer {

    public static void main(String[] args) {
        int[] tasks = {0, 1, 1, 0, 1};
        int[] papers = {1, 0, 1, 0, 1};
        int unableTasks = tasksUnableToFinish(tasks, papers);

        System.out.println("Number of tasks unable to finish: " + unableTasks);
    }

    public static int tasksUnableToFinish(int[] tasks, int[] papers) {

        int unableTasks = 0;
        int numOfPapers = papers.length; //num of papers in the printer
        int firstPaperIndex = 0; //index of the first paper
        int startUnable = -1; //index of first task unable to finish
        int endUnable = -1;//index of last task unable to finish

        for (int i = 0; i < tasks.length; i++) {
            if (numOfPapers > 0 && tasks[i] == papers [firstPaperIndex]){
                //if the paper type for the task is available, use the paper
                numOfPapers--;
                firstPaperIndex++; //move the index of the first paper to next
            } else {
                //if not available increase the task counter
                unableTasks++;
                if (startUnable == -1){
                    //if this is the first unable task, set the index as the start
                    startUnable = i;
                }
                endUnable = i;//set the end index to be current and update it for each failed task
            }
        }

        if (startUnable != -1){
            int numUnable = endUnable - startUnable + 1; //num of failed tasks
            //array for the failed tasks
            int[] unableTasksArr = new int[numUnable];
            for (int i = 0; i < numUnable; i++) {
                //copy them to the array
                unableTasksArr[i] = tasks[startUnable + i];
            }
            for (int i = numUnable; i < tasks.length; i++) {
                //copy failed tasks to the beginning of the array
                tasks[i - numUnable] = tasks[i];
            }
            for (int i = 0; i < numUnable; i++) {
                //copy failed tasks from the unableArr to the end of the task array
                tasks[tasks.length - numUnable + i] = unableTasksArr[i];
            }
        }
        return unableTasks;
    }
}

