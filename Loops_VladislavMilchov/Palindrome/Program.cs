using System;

namespace Check_if_it_is_palindrome
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 123;
            int staticX = x;
            int temp = x;
            int remainder, reverse = 0;
            while (x > 0)
            {
                remainder = x % 10;
                reverse = reverse * 10 + remainder;
                x /= 10;
            }

            if (temp == reverse)
                Console.WriteLine($"Number is a palindrome {staticX}");
            else
                Console.WriteLine($"Number is not a palindrome {staticX}");
        }
    }
}