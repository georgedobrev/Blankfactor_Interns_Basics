namespace CheckPalindrome;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Write number to be checked");
        Console.WriteLine(IsPalindrome(int.Parse(Console.ReadLine())));
    }

    public static bool IsPalindrome(int x)
    {
        string numberWord = Math.Abs(x).ToString();
        return numberWord.SequenceEqual(numberWord.Reverse());
    }
}

