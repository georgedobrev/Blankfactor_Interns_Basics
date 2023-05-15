using System;

namespace Abstraction_AndInheritance

{

    abstract class LocationOfTheCar
    {

        public abstract void location();
    }

    // inheritinance from the already established abstract class
    class Tesla : LocationOfTheCar
    {

        // provide implementation of abstract method

        public override void location()
        {

            Console.WriteLine(" Dubai, UAE ");

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            // establishing an object of Porsche class

            Tesla obj = new Tesla();
            obj.location();

            Console.ReadLine();
        }
    }
}