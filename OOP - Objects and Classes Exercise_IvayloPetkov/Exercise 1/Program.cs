using System;

namespace Application
{
    public class DateModifier
    {
        public static int Difference(string FirstDateString, string SecondDateString)
        {
            DateTime FirstDateTime = DateTime.ParseExact(FirstDateString, "yyyy MM dd", null);
            DateTime SecondDateTime = DateTime.ParseExact(SecondDateString, "yyyy MM dd", null);
            TimeSpan TimeDifference = SecondDateTime - FirstDateTime;
            return Math.Abs(TimeDifference.Days);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            string date1 = "2022 05 10";
            string date2 = "2022 05 12";
            int days = DateModifier.Difference(date1, date2);
            Console.WriteLine($"The difference between {date1} and {date2} is {days} days.");
        }
    }
}
