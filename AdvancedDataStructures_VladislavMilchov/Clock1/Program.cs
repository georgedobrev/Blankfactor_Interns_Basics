using System;

namespace Clock1
{
    internal class Program
    {
        public static int n = 3;        
        public static int[,] matrix = new int[,] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        static void Main(String[] args)
        {          
            Rotate(0, 0, 2);
            for (int c = 0; c < n; c++)
            {
                for (int j = 0; j < n; j++)
                {
                    Console.Write(matrix[c, j] + " ");
                }
                Console.WriteLine();
            }
            
        }
        public static void Rotate(int cnt, int rows, int cols)
        {            
            int i = 0;

            for (i = 0; i < n - 1; i++)
            {
                int tmp = matrix[0, i];
                if (cnt == 0)
                {
                    matrix[0, i] = matrix[rows + i, cols];
                    matrix[rows + i, cols] = tmp;
                }
                else if (cnt == 1)
                {
                    matrix[0, i] = matrix[rows, cols - i];
                    matrix[rows, cols - i] = tmp;
                }
                else
                {
                    matrix[0, i] = matrix[rows - i, 0];
                    matrix[rows - i, 0] = tmp;

                }
            }
         

            if (cnt != n - 1)
            {
                Rotate(cnt + 1, cols, cols);
            }
        }
    }
}