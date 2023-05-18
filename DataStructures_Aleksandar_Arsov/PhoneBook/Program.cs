// See https://aka.ms/new-console-template for more information
//Console.WriteLine("Hello, World!");
using System;
using System.Collections;

//PHONEBOOK TASK 2 OF DATA STRUCTURES

//Suppose you are developing a phone book application, where users can store and retrieve phone numbers for their contacts.
//    Phone numbers will be represented as strings. Choose which data structure you will use to store the phone numbers.
//    Add at least 6 phone numbers. Add phone number: ‘+359 83 74 84 84’ at 4th position.Print in the console all phones.
//    Remove the phone in the 3rd position. Print the phone book again.

class Program
{


    static void Main(string[] args)
    {
        List<string> phones = new List<string>();
        phones.Add("+359 88 12 32 12");
        phones.Add("+359 89 54 64 75");
        phones.Add("+359 89 09 04 43");
        phones.Add("+359 88 42 44 12");
        phones.Add("+359 90 89 88 12");
        phones.Add("+359 88 65 64 73");

        Console.WriteLine("Phonebook:\n");

        for (int i = 0; i < phones.Count; i++)
        {
            Console.WriteLine(phones[i]);
        }

        phones.Insert(3, "+359 83 74 84 84");

        Console.WriteLine(" ");
        Console.WriteLine("Phonebook after adding phone number at 4-th position: \n");

        for (int i = 0; i < phones.Count; i++)
        {

            Console.WriteLine(phones[i]);
        }

        phones.RemoveAt(2);

        Console.WriteLine(" ");
        Console.WriteLine("Phonebook after removing phone number in third position: \n");

        for (int i = 0; i < phones.Count; i++)
        {

            Console.WriteLine(phones[i]);
        }
    }
}



