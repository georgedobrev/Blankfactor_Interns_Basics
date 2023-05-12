using System;
namespace OOP_Objects_Classes
{
    public class Engine
    {
        private int enginePower;
        private int engineSpeed;

        public Engine(int enginePower, int engineSpeed)
        {
            this.enginePower = enginePower;
            this.engineSpeed = engineSpeed;
        }

        public int EnginePower
        {
            get { return enginePower; }
            set { enginePower = value; }
        }

        public int EngineSpeed
        {
            get { return engineSpeed; }
            set { engineSpeed = value; }
        }
    }
}

