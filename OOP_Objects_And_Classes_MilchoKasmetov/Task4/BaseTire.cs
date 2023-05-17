namespace Task4
{
    public  abstract class BaseTire
    {
        protected BaseTire(double pressure, int age)
        {
            this.Pressure = pressure;
            this.Age = age;
        }

        public double Pressure { get; set; }
        public int Age { get; set; }
    }
}