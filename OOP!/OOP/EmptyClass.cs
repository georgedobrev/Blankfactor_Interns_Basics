//The goal of this exercise is to create a DateModifier, which stores the difference of the days between two dates.
// Furthermore, it has to include a method that takes two string parameters representing a date as strings and calculates the difference in the days between them.

using System;

class DateModifier
{

    private string date1;
    private string date2;

    public DateModifier(string date1, string date2)
    {
        this.date1 = date1;
        this.date2 = date2;
    }

    public int DifferenceBetweenDates(string date1, string date2)
    {
        DateTime firstDate = DateTime.Parse(this.date1);
        DateTime secondDate = DateTime.Parse(this.date2);

        TimeSpan timespan = secondDate - firstDate;
        int differencindays = (int)timespan.TotalDays;
        return differencindays;

    }

}

class Program
{
    static void Main(string[] args)
    {
        string input1;
        string input2;

        Console.WriteLine("Enter the first date: ");
        input1 = Console.ReadLine();

        string date1 = input1;

        Console.WriteLine("Enter the second date: ");
        input2 = Console.ReadLine();

        string date2 = input2;

        DateModifier dateModifier = new DateModifier(date1, date2);

        int differenceindays = dateModifier.DifferenceBetweenTheTwoDates(date1, date2);
        Console.WriteLine($"The difference between {date1} and {date2} is {differenceindays}");