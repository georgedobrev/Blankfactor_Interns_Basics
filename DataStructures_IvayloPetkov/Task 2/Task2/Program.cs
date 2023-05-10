using System;

namespace Application
{
    class Program
    {
        static void PhoneBook()
        {
            string Phones = "";
            List<string> PhoneNumbers = new List<string>();

            Console.WriteLine("Enter phone numbers (empty line to stop):");
            string PhoneNumber = Console.ReadLine().Trim();
            while (PhoneNumber != "")
            {
                PhoneNumbers.Add(phoneNumber);
                PhoneNumber = Console.ReadLine().Trim();
            }

            PhoneNumbers.Insert(3, "+359 83 74 84 84");

            Console.WriteLine("\nPhone book:");
            foreach (string Number in PhoneNumbers)
            {
                Console.WriteLine(Number);
            }

            PhoneNumbers.RemoveAt(2);

            Console.WriteLine("\nPhone book after removing a phone number:");
            foreach (string Number in PhoneNumbers)
            {
                Console.WriteLine(Number);
            }
        }

    static void Main(string[] args)
        {
            PhoneBook();
        }
    }
}