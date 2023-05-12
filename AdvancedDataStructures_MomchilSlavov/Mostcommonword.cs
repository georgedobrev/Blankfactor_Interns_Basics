using System;

namespace MostCommonWord
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Enter a string: ");

            string input = Console.ReadLine();

            string[] words = input.Split(' ');

            Dictionary<string, int> Mostcommonword = new Dictionary<string, int>();

            foreach (string word in words)
            {
                if (Mostcommonword.ContainsKey(word))
                {
                    Mostcommonword [word]++;
                }
                else
                {
                    Mostcommonword.Add(word, 1);
                }
            }

            int maxVal = Mostcommonword.Values.Max();

            foreach (string key in Mostcommonword.Keys)
            {
                if (Mostcommonword[key] == maxVal)
                {
                    Console.WriteLine($"\"{key}\" (appears {maxVal} times)");
                }
            }


        }
    }
}