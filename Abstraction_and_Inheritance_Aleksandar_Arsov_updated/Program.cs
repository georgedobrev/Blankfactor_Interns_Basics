using System;
using System.Collections.Generic;
using Abstraction_and_Inheritance;



public class Program
{
    static void Main(string[] args)
    {

        Dictionary dict = new Dictionary();


        Noun dog = new Noun
        {
            English = "cat",
            Bulgarian = "kotka",
            Plural = "kotki"
        };
        dict.AddWord(dog);


        Verb govori = new Verb
        {
            English = "sleep",
            Bulgarian = "spi",
            Infinitive = "spim"
        };
        dict.AddWord(govori);


        dict.DisplayWords();
    }
}
