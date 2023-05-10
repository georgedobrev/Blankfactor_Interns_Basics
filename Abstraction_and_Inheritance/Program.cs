using System;
using System.Collections.Generic;


public abstract class Words
{
    public string English { get; set; }
    public string Bulgarian { get; set; }

    public abstract void DisplayWordInfo();
}




public class Verb : Words
{
    public string Infinitive { get; set; }
    public override void DisplayWordInfo()
    {
        Console.WriteLine(English);
        Console.WriteLine(Bulgarian);
        Console.WriteLine(Infinitive);
    }
}
public class Noun : Words
{
    public string Plural { get; set; }
    public override void DisplayWordInfo()
    {
        Console.WriteLine(English);
        Console.WriteLine(Bulgarian);
        Console.WriteLine(Plural);
    }
}


public interface English
{
    string EnglishTranslation { get; set; }
}

public interface Bulgarian
{
    string BulgarianTranslation { get; set; }
}


public class Dictionary
{
    private List<Words> words = new List<Words>();

    public void AddWord(Words word)
    {
        words.Add(word);
    }

    public void DisplayWords()
    {
        foreach (Words word in words)
        {
            word.DisplayWordInfo();
        }
    }
}


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
