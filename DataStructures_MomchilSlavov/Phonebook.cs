//The goal of this exercise is to develop a phone book application which allows users to store and retrieve phone numbers.
//    Phone numbers will be represented as strings. Choose which data structure you will use to store the phone numbers.
//    Add at least 6 phone numbers. Phone number: ‘+359 83 74 84 84’ should be added as fourth. All phones should be printed as a console.
//    The third phone number has to be deleted and the entire phone book has to be printed again.
using System;
using System.Collections;

class Program
{

    static void Main(string[] args)
    {
        List<string> phones = new List<string>();
        phones.Add("+359 882710179");
        phones.Add("+359 886884692");
        phones.Add("+359 89 09 04 43");
        phones.Add("+359 83748484");
        phones.Add("+359 889387567");
        phones.Add("+359 88656473");

        Console.WriteLine("Phonebook:\n");

        for (int i = 0; i < phones.Count; i++)
        {
            Console.WriteLine(phones[i]);
        }

        phones.Insert(3, "+359 83 74 84 84");

        Console.WriteLine(" ");
        Console.WriteLine("Phonebook after the number at fourth position has been added: \n");

        for (int i = 0; i < phones.Count; i++)
        {

            Console.WriteLine(phones[i]);
        }

        phones.RemoveAt(2);

        Console.WriteLine(" ");
        Console.WriteLine("Phonebook after the phone number at third position has been removed: \n");

        for (int i = 0; i < phones.Count; i++)
        {

            Console.WriteLine(phones[i]);
        }
    }
}