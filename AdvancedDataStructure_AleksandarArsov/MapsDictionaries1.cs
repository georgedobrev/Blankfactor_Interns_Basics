//EXERCISE 1 ASSOCIATIVE ARRAYS(MAPS, DICTIONARIES)
//Write a program that takes a string as input and outputs the most common word in the string. Ignore case and punctuation.

//Example input: "The quick brown fox jumped over the lazy dog. The lazy dog slept all day."
//Example output: "the"(appears 3 times)

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter a string: ");

        string input = Console.ReadLine();

        string[] words = input.Split(' ');

        Dictionary<string, int> counts = new Dictionary<string, int>();

        foreach (string word in words)
        {
            if (counts.ContainsKey(word))
            {
                counts[word]++;
            }
            else
            {
                counts[word] = 1;
            }
        }

        int highestCount = 0;
        string commword = "";
        foreach (KeyValuePair<string, int> pair in counts)
        {
            if (pair.Value > highestCount)
            {
                commword = pair.Key;
                highestCount = pair.Value;
            }
        }

        Console.WriteLine($"Word:{highestCount}, Count:{commword}");
    }
}

