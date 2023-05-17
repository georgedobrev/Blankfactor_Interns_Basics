namespace Task4
{
    public abstract class BaseCargo
    {
        protected BaseCargo(int cargoWeight, CargoType cargoType)
        {
            CargoWeight = cargoWeight;
            CargoType = cargoType;
        }

        public int CargoWeight { get; set; }

        public CargoType CargoType { get; set; }
    }
}