using System;

namespace Application
{
    class Program
    {
        static void phone_book()
        {
            string phones = "";
            List<string> phoneNumbers = new List<string>();

            Console.WriteLine("Enter phone numbers (empty line to stop):");
            string phoneNumber = Console.ReadLine().Trim();
            while (phoneNumber != "")
            {
                phoneNumbers.Add(phoneNumber);
                phoneNumber = Console.ReadLine().Trim();
            }

            phoneNumbers.Insert(3, "+359 83 74 84 84");

            Console.WriteLine("\nPhone book:");
            foreach (string number in phoneNumbers)
            {
                Console.WriteLine(number);
            }

            phoneNumbers.RemoveAt(2);

            Console.WriteLine("\nPhone book after removing a phone number:");
            foreach (string number in phoneNumbers)
            {
                Console.WriteLine(number);
            }
        }

    static void Main(string[] args)
        {
            phone_book();
        }
    }
}