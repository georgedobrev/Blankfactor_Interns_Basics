using System;
using System.Collections.Generic;

namespace PhoneBook
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> phoneBook = new List<string>();

            phoneBook.Add("+359 31 52 32 13");
            phoneBook.Add("+359 54 34 42 72");
            phoneBook.Add("+359 23 11 26 22");
            phoneBook.Add("+359 13 74 45 11");
            phoneBook.Add("+359 93 74 84 74");
            phoneBook.Add("+359 34 74 37 53");
           
            for (int i = 0; i < phoneBook.Count; i++)
            {
                if (i == 3)
                {
                    phoneBook.Insert(3, "+359 83 74 84 84");
                }
                
                Console.WriteLine(phoneBook[i]);

            }

            phoneBook.RemoveAt(2);

            Console.WriteLine("");

            for (int i = 0; i < phoneBook.Count; i++)
            {    
                Console.WriteLine(phoneBook[i]);
            }
            
        }     
    }
}
