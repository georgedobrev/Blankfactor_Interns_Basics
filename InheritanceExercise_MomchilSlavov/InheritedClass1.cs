using System;

namespace Abstraction_AndInheritance

{

    abstract class AgeOfTheCar
    {

        public abstract void ageinyears();
    }

    // inheritinance from the already established abstract class
    class Lamborghini : AgeOfTheCar
    {

        // provide implementation of abstract method

        public override void ageinyears()
        {

            Console.WriteLine(" 2 years ");

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            // establishing an object of Lamborghini class

            Lamborghini obj = new Lamborghini();
            obj.ageinyears();

            Console.ReadLine();
        }
    }
}