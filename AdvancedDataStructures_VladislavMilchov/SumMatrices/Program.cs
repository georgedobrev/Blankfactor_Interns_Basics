using System;

namespace SumMatrices
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] firstMatrix = new int[2, 3] { { 1, 2 ,3}, { 4, 5, 6} };

            int[,] secondMatrix = new int[2, 3] { { 7, 8, 9 }, { 10, 11, 12} };

            int[,] sumMatrix = new int[2, 3];

            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    sumMatrix[i , j] = firstMatrix[i, j] + secondMatrix[i, j];

                    Console.Write(sumMatrix[i, j] + " ");

                }

                Console.WriteLine();
            }

        }
    }
}