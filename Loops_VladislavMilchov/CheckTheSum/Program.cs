using System;
public class CheckTheSum
{
    public static int GetValue(string word)
    {
        int value = 0;
        for (int i = 0; i < word.Length; i++)
        {
            char c = word[i];
            value = value * 10 + ((int)(c) - (int)('a'));
        }
        return value;
    }
    public static void Main(string[] args)
    {
        string firstWord = "acb";
        string secondWord = "cba";
        string targetWord = "cdb";
        var firstWordValue = CheckTheSum.GetValue(firstWord);
        var secondWordValue = CheckTheSum.GetValue(secondWord);
        var targetWordValue = CheckTheSum.GetValue(targetWord);
        var areEqual = (firstWordValue + secondWordValue) == targetWordValue;
        Console.WriteLine(areEqual);
    }
}
