using System;

namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = { 1, 2, 3, 4, 5 };
            int target = 7;

            var pairs = new System.Collections.Generic.List<(int, int)>();
            for (int i = 0; i < array.Length; i++)
            {
                for (int j = i + 1; j < array.Length; j++)
                {
                    if (array[i] + array[j] == target)
                    {
                        pairs.Add((array[i], array[j]));
                    }
                }
            }

            foreach (var pair in pairs)
            {
                Console.WriteLine("(" + pair.Item1 + ", " + pair.Item2 + ")");
            }
        }
    }
}
