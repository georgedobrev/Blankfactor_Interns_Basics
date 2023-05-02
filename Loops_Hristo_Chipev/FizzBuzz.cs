using System;
namespace CSharp_Tasks
{
    public class FizzBuzz
    {
        public static string[] FizzBuzzM(int n)
        {
            string[] arr = new string[n];
            string res = "";

            for (int i = 0; i < n; i++)
            {
                if ((i + 1) % 3 == 0)
                {
                    res += "Fizz";
                }
                if ((i + 1) % 5 == 0)
                {
                    res += "Buzz";
                }

                if (res != "")
                {
                    arr[i] = res;
                }
                else
                {
                    arr[i] = (i + 1).ToString();
                }

                res = "";
            }

            return arr;
        }

    }
}

