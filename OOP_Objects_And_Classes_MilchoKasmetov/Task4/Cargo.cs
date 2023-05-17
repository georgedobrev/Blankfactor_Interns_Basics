using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task4
{
    public class Cargo : BaseCargo
    {
        public Cargo(int cargoWeight, CargoType cargoType) : base(cargoWeight, cargoType)
        {
        }
    }
}
