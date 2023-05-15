// Interface exercise

using Abstraction_AndInheritance;

interface Brand
{
    class Program
    {
        static void Main(string[] args)
        {
            Porsche myPorsche = new Porsche();

            myPorsche.CarPrice();
        }
    }
}

// Porsche "implements" the LuxuryCarBrand interface

class LuxuryCarBrand : Porsche
{
    public void CarPrice()
    {

        Console.WriteLine("The luxury car described above costs: $ 500,000 ");
    }
}

class Program
{
    static void Main (string[] args)
    {
        Porsche myPorsche = new Porsche();

        myPorsche.CarPrice ();
    }
}