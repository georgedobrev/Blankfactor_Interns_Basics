using System;
namespace CSharp_Tasks
{
    public class CheckSum
    {
        public static bool CheckSumM(string str1, string str2, string targetStr)
        {
            int sum = 0;
            int targetSum = 0;

            foreach (char ch in str1)
            {
                if ((int)ch >= 97 && (int)ch <= 122)
                {
                    sum += (int)ch - 97;
                }
            }

            foreach (char ch in str2)
            {
                if ((int)ch >= 97 && (int)ch <= 122)
                {
                    sum += (int)ch - 97;
                }
            }

            foreach (char ch in targetStr)
            {
                if ((int)ch >= 97 && (int)ch <= 122)
                {
                    targetSum += (int)ch - 97;
                }
            }

            return sum == targetSum;
        }
    }
}

