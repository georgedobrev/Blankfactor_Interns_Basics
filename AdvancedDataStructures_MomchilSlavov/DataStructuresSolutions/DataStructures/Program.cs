using System;

namespace DictionarysAndMatrix
{
    public class TargetSum
    {
        public static Dictionary<int, int> FindPairs(int[] arr, int targetSum)
        {
            var dict = new Dictionary<int, int>();

            for (int i = 0; i < arr.Length; i++)
            {
                int diff = targetSum - arr[i];
                if (arr.Contains(diff))
                {
                    if (!dict.ContainsValue(diff))
                        dict[diff] = arr[i];
                }
            }

            return dict;
        }
    }
}




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




class Student
{
    private string firstName;
    private string lastName;

        public string fullName
    {
        get { return name; }
        set { name = value; }

    }

    public static int age

    {
        get { return age; }
        set { age = value; }
    }
    public static void main(string[] args);





}
