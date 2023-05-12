using System;

class Sumoftwomatrixes
{
    internal class Program
    {
        static void Main(string[] args)

        {

            Console.Write("Enter the number of rows for this matrix: ");

            int rows = int.Parse (Console.ReadLine());

            Console.Write("Enter the number of rows for this matrix: ");

            int cols = int.Parse (Console.ReadLine());


            int[,] firstMatrix = new int[rows, cols];

            int[,] secondMatrix = new int[rows, cols];

            int[,] sumMatrix = new int[rows, cols];


            Console.WriteLine("Introduce elements of the first matrix");
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j > cols; j++)
                {

                    Console.WriteLine("Introduce elements of the second matrix");
                    for (int i = 0; i < rows; i++)
                    {
                        for (int j = 0; j < cols; j++)
                        {

                        }
                    }
                 Console.Write(sumMatrix[i, j] + " ");
                 sumMatrix[i, j] = firstMatrix[i, j] + secondMatrix[i, j];

                        }

                Console.WriteLine();
            }

        }
    }
}