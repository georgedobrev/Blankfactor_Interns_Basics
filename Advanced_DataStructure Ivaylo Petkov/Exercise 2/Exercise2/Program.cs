using System;

namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] Array = { 1, 2, 3, 4, 5 };
            int Target = 7;

            var Pairs = new System.Collections.Generic.List<(int, int)>();
            for (int i = 0; i < Array.Length; i++)
            {
                for (int j = i + 1; j < Array.Length; j++)
                {
                    if (Array[i] + Array[j] == Target)
                    {
                        Pairs.Add((Array[i], Array[j]));
                    }
                }
            }

            foreach (var Pair in Pairs)
            {
                Console.WriteLine("(" + Pair.Item1 + ", " + Pair.Item2 + ")");
            }
        }
    }
}
