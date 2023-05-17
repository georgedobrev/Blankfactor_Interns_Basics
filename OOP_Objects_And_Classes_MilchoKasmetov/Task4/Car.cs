using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task4
{
    public class Car : BaseCar
    {
        public Car(BaseModel baseModel, BaseEngine baseEngine, BaseCargo baseCargo) : base(baseModel, baseEngine, baseCargo)
        {
        }
    }
}
