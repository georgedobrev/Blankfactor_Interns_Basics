using System.Text;

namespace MergeTwoStrings;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Write word 1");

        string wordOne = Console.ReadLine();

        Console.WriteLine("Write word 2");

        string wordTwo = Console.ReadLine();

        Console.WriteLine(MergeTwoString(wordOne, wordTwo));
    }

    public static string MergeTwoString(string wordOne, string wordTwo)
    {

        var queueOne = new Queue<char>(wordOne.ToCharArray());
        var queueTwo = new Queue<char>(wordTwo.ToCharArray());

        var sb = new StringBuilder();

        while (queueOne.Count != 0 || queueTwo.Count != 0)
        {
            if (queueOne.Count != 0)
            {
                sb.Append(queueOne.Dequeue());
            }
            if (queueTwo.Count != 0)
            {
                sb.Append(queueTwo.Dequeue());
            }


        }

        return sb.ToString();
    }
}

