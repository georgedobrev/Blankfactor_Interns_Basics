using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CarsAndCargo
{
    internal class Cargo
    {
        public int Weight { get; set; }
        public string CargoType { get; set; }

        public Cargo(int weight, string cargoType)
        {
            Weight = weight;
            CargoType = cargoType;
        }
    }
}
