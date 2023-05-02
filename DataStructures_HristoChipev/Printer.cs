using System;
namespace DataStructures
{
    public class Printer
    {
        public static int PrintTasks(int[] tasks, int[] paper)
        {
            var paperToStack = new Stack<int>(paper);
            var tasksToQueue = new Queue<int>(tasks);
            var br = 0;

            while (paperToStack.Count > 0 && br <= paperToStack.Count + 1)
            {
                if (paperToStack.Peek() == tasksToQueue.Peek())
                {
                    paperToStack.Pop();
                    tasksToQueue.Dequeue();
                    br = 0;
                }
                else
                {
                    tasksToQueue.Enqueue(tasksToQueue.Dequeue());
                    br++;
                }
            }

            return tasksToQueue.Count;
        }
    }
}

