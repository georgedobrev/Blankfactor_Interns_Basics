using System;
public class CheckTheSum
{
    public static int PetValue(string word)
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
        var firstWordValue = CheckTheSum.getValue(firstWord);
        var secondWordValue = CheckTheSum.getValue(secondWord);
        var targetWordValue = CheckTheSum.getValue(targetWord);
        var areEqual = (firstWordValue + secondWordValue) == targetWordValue;
        Console.WriteLine(areEqual);
    }
}
