using System;

namespace DateModifier
{
    internal class Program
    {
        static void Main(string[] args)
        {
               
            var Date = new Date();
            Date.SetFirstDate(2023, 1 ,12);
            Date.SetSecondDate(2023, 3, 15);

            Date.DateDiff();
        }
    }
}