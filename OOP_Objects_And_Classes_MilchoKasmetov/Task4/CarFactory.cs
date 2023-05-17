using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task4
{
    public class CarFactory
    {
        public Car CreateCar(string input)
        {
            var parts = input.Split(" ", StringSplitOptions.RemoveEmptyEntries).ToList();

            var model = new Model(parts[0]);
            var engine = new Engine(int.Parse(parts[1]), int.Parse(parts[2]));

            Enum.TryParse(parts[4], out CargoType cargoType);

            var cargo = new Cargo(int.Parse(parts[3]), cargoType);

            var car = new Car(model, engine, cargo);

            for (int j = 5; j < parts.Count; j += 2)
            {
                car.Tires.Add(new Tire(double.Parse(parts[j]), int.Parse(parts[j + 1])));
            }

            return car;
        }
    }
}
