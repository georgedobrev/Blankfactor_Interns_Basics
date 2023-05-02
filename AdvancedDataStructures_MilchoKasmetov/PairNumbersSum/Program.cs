using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.Intrinsics.X86;
using System.Text;

namespace PairNumbersSum
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Exercise 2: Find pairs of numbers in an array that sum to a target value  *Use Dictionary / HashMap

            //Write a program that takes an array of integers and a target integer, and outputs all pairs of numbers in the array that sum to the target.

            //Example input: [1, 2, 3, 4, 5], 7
            //Example output: (2, 5), (3, 4)
            while (true)
            {
                try
                {
                    Console.WriteLine("Insert numbers");

                    var inputNumbers = Console.ReadLine().Split(", ").Select(int.Parse).ToArray();

                    Console.WriteLine("Insert desired number");
                    var inputSum = int.Parse(Console.ReadLine());

                    Console.WriteLine(FindPairsOfNumber(inputNumbers, inputSum));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"Input ERROR TRY AGAIN :( !!!!! {e.Message}");
                }
            }
           
        }
        
        public static string FindPairsOfNumber(int[] inputNumbers, int inputSum)
        {
            var dictionary = new Dictionary<int, int>();

            for (int i = 0; i < inputNumbers.Length; i++)
            {
                for (int j = 1; j < inputNumbers.Length; j++)
                {
                    if (inputSum == inputNumbers[i] + inputNumbers[j])
                    {
                        if (!dictionary.ContainsKey(inputNumbers[i]) && !dictionary.ContainsKey(inputNumbers[j]))
                        {
                            dictionary[inputNumbers[i]] = inputNumbers[j];
                        }

                    }


                }

            }

            StringBuilder sb = new StringBuilder();

            if(dictionary.Count != 0)
            {
                sb.AppendLine("Possible combinations");

                foreach (var item in dictionary.Keys)
                {
                    sb.AppendLine($"({item}, {dictionary[item]})");
                }
            }
            else
            {
                sb.AppendLine("No possible combinations :(");
            }

            return sb.ToString().Trim();
        }
    }
}