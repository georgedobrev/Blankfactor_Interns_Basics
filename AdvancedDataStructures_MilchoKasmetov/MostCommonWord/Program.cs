using System.Collections.Generic;
using System.ComponentModel;

namespace MostCommonWord
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Find the most common word in a string* Use Dictionary / HashMap

            //Write a program that takes a string as input and outputs the most common word in the string.Ignore case and punctuation.

            //Example input: "The quick brown fox jumped over the lazy dog. The lazy dog slept all day."
            //Example output: "the"(appears 3 times)           

            while (true)
            {
                try
                {
                    Console.WriteLine("Insert sentence, please");
                    Console.WriteLine(MostCommonWord(Console.ReadLine()));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"Input ERROR TRY AGAIN :( !!!!! {e.Message}");
                }
            }

        }

        public static string MostCommonWord(string sentence)
        {
            var listWords = sentence.Split(' ',StringSplitOptions.RemoveEmptyEntries).Select(x => x.ToLower()).ToList();
            var dictionary = new Dictionary<string, int>();

            listWords.ForEach(x =>
            {
                if (!dictionary.ContainsKey(x))
                {
                    dictionary[x] = 0;
                }
                dictionary[x]++;
            });

            var maxKVP = dictionary.Aggregate((left, right) => left.Value > right.Value ? left : right);

            return $" \"{maxKVP.Key}\" (appears {maxKVP.Value} times)";
        }
    }
}