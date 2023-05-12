using System;
namespace CSharp_Tasks
{
    public class Palindrome
    {
        public static bool PalindromeM(string str)
        {
            bool res = false;
            string rev = "";

            rev = string.Join("", str.ToString().Split("").Reverse());

            if (rev == str)
            {
                res = true;
            }

            return res;
        }

        public static bool Palindrome2M(int n)
        {
            bool res = false;
            int copyOfN = n;
            string rev = "";

            while (copyOfN > 0)
            {
                rev += copyOfN % 10;
                copyOfN = copyOfN / 10;
            }

            if (int.Parse(rev) == n)
            {
                res = true;
            }

            return res;
        }

    }
}

