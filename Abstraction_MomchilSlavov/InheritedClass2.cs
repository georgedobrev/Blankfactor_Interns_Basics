using System;

namespace Abstraction_AndInheritance
{
    public class CarPrice : LuxuryCarBrands
    {

        public string NewYork { get; set; }
        public override void DisplayLuxuryCarInfo()

        {
            Console.WriteLine(Dubai);
            Console.WriteLine(London);
            Console.WriteLine(NewYork);
        }
    }
}

