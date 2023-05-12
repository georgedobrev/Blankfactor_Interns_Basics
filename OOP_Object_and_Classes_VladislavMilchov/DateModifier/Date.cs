using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace DateModifier
{
    public class Date
    {
        DateTime firstDate;
        DateTime secondDate;
        public void SetFirstDate(int year, int month, int day)
        {
            firstDate = new DateTime(year, month, day);
            
        }

        public void SetSecondDate(int year, int month, int day)
        {
            secondDate = new DateTime(year, month, day);
            
        }

        public void DateDiff()
        {
            TimeSpan diff1 = firstDate.Subtract(secondDate);  
            Console.Write(firstDate.ToString("dd/MM/yyyy") + " - ");
            Console.Write(secondDate.ToString("dd/MM/yyyy") + " - " + diff1.ToString("dd"));
            
        }
    }
}
