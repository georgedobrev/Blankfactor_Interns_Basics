using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;


namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            string userInput = Console.ReadLine();
            string cleanUserInput = Regex.Replace(userInput, @"[^A-Za-z ]+", "").ToLower();

            string[] finalSenteceWord = cleanUserInput.Split(' ', StringSplitOptions.RemoveEmptyEntries);


            Dictionary<string, int> MostUsedWord = new Dictionary<string, int>();

            foreach (string word in finalSenteceWord)
            {
                if (MostUsedWord.ContainsKey(word))
                {
                    MostUsedWord[word]++;
                }
                else
                {
                    MostUsedWord[word] = 1;
                }
            }

            string mostCommonWord = MostUsedWord.OrderByDescending(kv => kv.Value).First().Key;
            Console.WriteLine(mostCommonWord);


        }
    }
}