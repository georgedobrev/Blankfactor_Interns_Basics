using System;
using System.Collections.Generic;
using System.Linq;

namespace Exercise4
{
    class Engine
    {
        public int Speed { get; set; }
        public int Power { get; set; }

        public Engine(int speed, int power)
        {
            Speed = speed;
            Power = power;
        }
    }

    class Cargo
    {
        public int Weight { get; set; }
        public string Type { get; set; }

        public Cargo(int weight, string type)
        {
            Weight = weight;
            Type = type;
        }
    }

    class Tire
    {
        public double Pressure { get; set; }
        public int Age { get; set; }

        public Tire(double pressure, int age)
        {
            Pressure = pressure;
            Age = age;
        }
    }

    class Car
    {
        public string Model { get; set; }
        public Engine Engine { get; set; }
        public Cargo Cargo { get; set; }
        public List<Tire> Tires { get; set; }

        public Car(string model, int engineSpeed, int enginePower, int cargoWeight, string cargoType,
                   double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age,
                   double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age)
        {
            Model = model;
            Engine = new Engine(engineSpeed, enginePower);
            Cargo = new Cargo(cargoWeight, cargoType);
            Tires = new List<Tire>
        {
            new Tire(tire1Pressure, tire1Age),
            new Tire(tire2Pressure, tire2Age),
            new Tire(tire3Pressure, tire3Age),
            new Tire(tire4Pressure, tire4Age)
        };
        }

        public bool IsFragile()
        {
            return Cargo.Type == "fragile" && Tires.Any(tire => tire.Pressure < 1);
        }

        public bool IsFlammable()
        {
            return Cargo.Type == "flammable" && Engine.Power > 250;
        }
    }


    class Program
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());

            List<Car> cars = new List<Car>();

            for (int i = 0; i < n; i++)
            {
                string[] input = Console.ReadLine().Split();

                string model = input[0];
                int engineSpeed = int.Parse(input[1]);
                int enginePower = int.Parse(input[2]);
                int cargoWeight = int.Parse(input[3]);
                string cargoType = input[4];
                double tire1Pressure = double.Parse(input[5]);
                int tire1Age = int.Parse(input[6]);
                double tire2Pressure = double.Parse(input[7]);
                int tire2Age = int.Parse(input[8]);
                double tire3Pressure = double.Parse(input[9]);
                int tire3Age = int.Parse(input[10]);
                double tire4Pressure = double.Parse(input[11]);
                int tire4Age = int.Parse(input[12]);

                Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType,
                                  tire1Pressure, tire1Age, tire2Pressure, tire2Age,
                                  tire3Pressure, tire3Age, tire4Pressure, tire4Age);

                cars.Add(car);
            }

            string command = Console.ReadLine();

            if (command == "fragile")
            {
                foreach (Car car in cars.Where(car => car.IsFragile()))
                {
                    Console.WriteLine(car.Model);
                }
            }


            else if (command == "flammable")
            {
                foreach (Car car in cars.Where(car => car.IsFlammable()))
                {
                    Console.WriteLine(car.Model);
                }
            }
        }
    }
}