using System;

namespace CommonWord
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            
            string[] words = input.ToLower().Split().Select(word => word.Trim('.')).ToArray();

            Dictionary<string, int> commonWord = new Dictionary<string, int>();

            foreach (string word in words)
            {                               
               if (commonWord.ContainsKey(word))
               {
                  commonWord[word]++;
               }
               else
               {
                  commonWord.Add(word, 1);
               }                
            }

            int maxVal = commonWord.Values.Max();

            foreach (string key in commonWord.Keys)
            {
                if (commonWord[key] == maxVal)
                {
                    Console.WriteLine($"\"{key}\" (appears {maxVal} times)");
                }
            }
            

        }
    }
}