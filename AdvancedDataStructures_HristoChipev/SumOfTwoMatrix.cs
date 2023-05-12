using System;
namespace DictionarysAndMatrix
{
    public class SumOfTwoMatrix
    {
        public static int[,] FindSum(int[,] arr, int[,] arr2)
        {
            int[,] newArr = new int[arr.GetLength(0), arr.GetLength(1)];
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    newArr[i, j] = arr[i, j] + arr2[i, j];
                }
            }

            return newArr;
        }
    }
}

