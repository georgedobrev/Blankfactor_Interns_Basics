using System;
using System.Xml.Linq;

namespace OOP_Objects_Classes
{
    public class Car
    {
        private string model;
        private Engine engine;
        private Cargo cargo;
        private List<Tire> tires;

        public Car(string model, int enginePower, int engineSpeed, int cargoWeight, string cargoType, double tire1Pressure, int tire1Age, double tire2Pressure,
            int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age)
        {
            this.model = model;
            engine = new Engine(enginePower, engineSpeed);
            cargo = new Cargo(cargoWeight, cargoType);
            tires = new List<Tire>(new Tire[]{ new Tire(tire1Pressure, tire1Age), new Tire(tire2Pressure, tire2Age),
                new Tire(tire3Pressure, tire3Age), new Tire(tire4Pressure, tire4Age) });
        }


        public Engine Engine
        {
            get { return engine; }
            set { engine = value; }
        }

        public Cargo Cargo
        {
            get { return cargo; }
            set { cargo = value; }
        }

        public List<Tire> Tires
        {
            get { return tires; }
            set { tires = value; }
        }

        public string Model
        {
            get { return model; }
            set { model = value; }
        }
    }
}

