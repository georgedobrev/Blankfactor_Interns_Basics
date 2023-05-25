using System;

namespace PairNumbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = new int[] { 1, 2, 3, 4, 5, };
            int sum = 7;
            int counter = 0;
            Dictionary<int, int> dictionary = new Dictionary<int, int>();

            for (int i = 0; i < numbers.Length; i++)
            {
                for (int j = i + 1; j < numbers.Length; j++)
                {
                    if (numbers[i] + numbers[j] == sum)
                    {
                        dictionary.Add(numbers[i], numbers[j]);
                    }
                }
                
            }
            
            foreach (KeyValuePair<int, int> kvp in dictionary)
            {                
                Console.Write("(" + kvp.Key + ", " + kvp.Value + ")");
                if (counter < dictionary.Count - 1)
                {
                    
                    Console.Write(", ");
                }
                counter++;

            }
        }
    }
}