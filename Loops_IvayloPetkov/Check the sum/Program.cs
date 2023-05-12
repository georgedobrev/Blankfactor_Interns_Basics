using System;

namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            string firstWord = Console.ReadLine();
            string secondWord = Console.ReadLine();
            string targetWord = Console.ReadLine();

            int counter_firstWord = 0;
            int counter_secondWord = 0;
            int counter_thirdWord = 0;
            var new_first_word = firstWord.Length;
            var new_second_word = secondWord.Length;
            var new_target_word = targetWord.Length;

            for (int i = 0; i < new_first_word; i++)
            {
                counter_firstWord += firstWord[i] - 96;
            }

            for (int i = 0; i < new_second_word; i++)
            {
                counter_secondWord += secondWord[i] - 96;
            }

            for (int i = 0; i < new_target_word; i++)
            {
                counter_thirdWord += targetWord[i] - 96;
            }

            if (counter_firstWord == counter_secondWord && counter_firstWord == counter_thirdWord && counter_secondWord == counter_thirdWord)
            {
                Console.WriteLine("True");
            }

            else
            {
                Console.WriteLine("False");
            }

        }
    }
}