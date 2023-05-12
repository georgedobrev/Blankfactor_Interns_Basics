using System;
using System.Runtime.ConstrainedExecution;

namespace CarsAndCargo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Number of cars: ");
            int n = int.Parse(Console.ReadLine());

            List<Car> cars = new List<Car>();

            for (int i = 0; i < n; i++)
            {
                Console.Write("Information about car: ");
                List<string> carInfoList = Console.ReadLine().Split(new[] { '{', '}', ' ' }, StringSplitOptions.RemoveEmptyEntries).ToList();

                string model = carInfoList[0];

                int engineSpeed = int.Parse(carInfoList[1]);
                int enginePower = int.Parse(carInfoList[2]);
                Engine engine = new Engine(engineSpeed, enginePower);

                int cargoWeight = int.Parse(carInfoList[3]);
                string cargoType = carInfoList[4];
                Cargo cargo = new Cargo(cargoWeight, cargoType);

                Tire[] tires = new Tire[4];

                for (int j = 0; j < 4; j++)
                {
                    int startIndex = 5 + j * 2;
                    double tirePressure = double.Parse(carInfoList[startIndex]);
                    int tireAge = int.Parse(carInfoList[startIndex + 1]);
                    tires[j] = new Tire(tirePressure, tireAge);
                }

                Car car = new Car(model, engine, cargo, tires);
                cars.Add(car);
            }
            Console.Write("Command: ");
            string command = Console.ReadLine();

            if (command == "fragile")
            {
                List<string> fragileCars = cars
                    .Where(c => c.Cargo.CargoType == "fragile" && c.Tires.Any(t => t.Pressure < 1))
                    .Select(c => c.Model)
                    .ToList();

                Console.WriteLine(string.Join(Environment.NewLine, fragileCars));
            }
            else if (command == "flammable")
            {
                List<string> flammableCars = cars
                    .Where(c => c.Cargo.CargoType == "flammable" && c.Engine.Power > 250)
                    .Select(c => c.Model)
                    .ToList();

                Console.WriteLine(string.Join(Environment.NewLine, flammableCars));
            }
        }
    }
}