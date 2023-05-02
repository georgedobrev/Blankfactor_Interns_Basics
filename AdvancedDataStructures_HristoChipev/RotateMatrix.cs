using System;
namespace DictionarysAndMatrix
{
    public class RotateMatrix
    {
        public static int[,] Rotate(int[,] arr)
        {
            int[,] newArr = new int[arr.GetLength(0), arr.GetLength(1)];
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    newArr[i, j] = arr[Math.Abs(j - (arr.GetLength(0) - 1)), i];
                }
            }

            return newArr;
        }
    }
}

