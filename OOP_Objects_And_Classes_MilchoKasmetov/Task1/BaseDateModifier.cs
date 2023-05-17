using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task1
{
    public abstract class BaseDateModifier
    {
        public static  int CalcDiffDays(string dateOne, string dateTwo)
        {
            DateTime convertedDateOne = DateTime.Parse(dateOne);
            DateTime convertedDateTwo = DateTime.Parse(dateTwo);


            var diff = convertedDateOne - convertedDateTwo;

            return Math.Abs(diff.Days);
        }
    }
}
