using System;
using System.Net;

namespace OOP_Objects_Classes
{
    public static class DateModifier
    {
        public static int CalcDifference(string date1, string date2, string separator)
        {
            var data1ToArr = date1.Split(separator);
            var data2ToArr = date2.Split(separator);

            return Math.Abs(DateToInt(data1ToArr) - DateToInt(data2ToArr));
        }
        private static int DateToInt(string[] arr)
        {
            var date = int.Parse(arr[0]);
            var month = int.Parse(arr[1]);
            var year = int.Parse(arr[2]);

            if (month == 1 || month == 2)
            {
                month += 12;
                year--;
            }

            return 365 * year + year / 4 - year / 100 + year / 400 + date + (153 * month + 8) / 5;
        }

        public static int CalcDifferenceWithDateTime(string date1, string date2, string separator)
        {
            var data1ToArr = date1.Split(separator);
            var data2ToArr = date2.Split(separator);
            var convertedDate1 = new DateTime(int.Parse(data1ToArr[2]), int.Parse(data1ToArr[1]), int.Parse(data1ToArr[0]));
            var convertedDate2 = new DateTime(int.Parse(data2ToArr[2]), int.Parse(data2ToArr[1]), int.Parse(data2ToArr[0]));

            return (int)Math.Abs((convertedDate1 - convertedDate2).TotalDays);
        }
    }
}

