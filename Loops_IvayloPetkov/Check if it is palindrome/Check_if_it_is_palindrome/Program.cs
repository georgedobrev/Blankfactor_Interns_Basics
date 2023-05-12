using System;
using System.Text;

namespace Application
{
    class Program
    {

        static void check_if_it_is_palindrome()
        {
            string x = Console.ReadLine();
            int x_length = x.Length;
            StringBuilder result = new StringBuilder();

            for (int i = x_length - 1; i >= 0; i--)
            {
                result.Append(x[i]);
            }

            if (result.ToString() == x )
            {
                Console.WriteLine("True");
            }

            else
            {
                Console.WriteLine("False");
            }

        }


        static void Main(string[] args)
        {
            check_if_it_is_palindrome();
        }
    }
}