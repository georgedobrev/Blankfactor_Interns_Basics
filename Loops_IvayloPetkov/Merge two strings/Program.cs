using System;
using System.Text;

namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            string string1 = Console.ReadLine();
            string string2 = Console.ReadLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < string1.Length || i < string2.Length; i++)
            {

                if (i < string1.Length)
                    result.Append(string1[i]);

                if (i < string2.Length)
                    result.Append(string2[i]);
            }

            Console.WriteLine(result.ToString());
        }
    }
}