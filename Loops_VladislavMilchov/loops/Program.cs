using System;

namespace FixMergeString
{
    class Program
    {
        static void Main(string[] args)
        {
            string word1 = "abc";
            string word2 = "pqrv";

            if (word1.Length > word2.Length)
            {
                concat(word2, word1);
            }
            else 
            {
                concat(word1, word2);   
            }
        }

        static void concat(string shorter, string longer)
        {
            int i;
            for (i = 0; i < shorter.Length; i++)
            {
                Console.Write(shorter[i]);

                Console.Write(longer[i]);
            }

            for (int j = i; j < longer.Length; j++)
            {
                Console.Write(longer[i]);                
            }
        }
    }
