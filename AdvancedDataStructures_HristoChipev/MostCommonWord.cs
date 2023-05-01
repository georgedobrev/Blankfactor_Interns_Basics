using System;
namespace DictionarysAndMatrix
{
    public class MostCommonWord
    {
        public static string FindMostCommonWord(string str)
        {
            str = str.ToLower();
            var dict = new Dictionary<string, int>();

            foreach (var word in str.Split(" "))
            {
                if (dict.ContainsKey(word))
                {
                    dict[word]++;
                }
                else
                {
                    dict[word] = 1;
                }
            }
            KeyValuePair<string, int> max = dict.First();
            foreach (KeyValuePair<string, int> entry in dict)
            {
                if (max.Value < entry.Value)
                {
                    max = entry;
                }
            }

            return $"'{max.Key}' (appears {max.Value} times)";
        }
    }
}

