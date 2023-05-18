class Program
{
    static void Main(string[] args)
    {
        string firstWord = "acb";
        string secondWord = "cba";
        string targetWord = "cdb";
        bool isEqualSum = IsEqualSum(firstWord, secondWord, targetWord);
        Console.WriteLine($"The sum of {firstWord} and {secondWord} is equal to {targetWord}");
    }

    static bool IsEqualSum(string firstWord, string secondWord, string targetWord)
    {
        int firstNum = GetNumericValue(firstWord);
        int secondNum = GetNumericValue(secondWord);
        int targetNum = GetNumericValue(targetWord);
        return firstNum + secondNum == targetNum;
    }

    static int GetNumericValue(string word)
    {
        int value = 0;
        foreach (char c in word)
        {
            value = value * 10 + (c - 'a'); 
        }
        return value;
    }
}

