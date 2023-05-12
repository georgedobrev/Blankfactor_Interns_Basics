using System;
namespace OOP_Objects_Classes
{
    public class Tire
    {
        private double tirePressure;
        private int tireAge;

        public Tire(double tirePressure, int tireAge)
        {
            this.tirePressure = tirePressure;
            this.tireAge = tireAge;
        }

        public double TirePressure
        {
            get { return tirePressure; }
            set { tirePressure = value; }
        }

        public int TireAge
        {
            get { return tireAge; }
            set { tireAge = value; }
        }
    }
}

