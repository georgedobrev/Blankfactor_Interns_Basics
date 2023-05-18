using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int n = 15; // The maximum number for FizzBuzz
        List<string> result = FizzBuzz(n);
        Console.WriteLine(string.Join(", ", result));
    }

    static List<string> FizzBuzz(int n)
    {
        List<string> result = new List<string>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                result.Add("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                result.Add("Fizz");
            }
            else if (i % 5 == 0)
            {
                result.Add("Buzz");
            }
            else
            {
                result.Add(i.ToString());
            }
        }
        return result;
    }
}