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

