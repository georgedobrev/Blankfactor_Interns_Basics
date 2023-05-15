// Interface exercise

using Abstraction_AndInheritance;


interface Colour
{
    void CarColour ();
}

// Porsche "implements" the LuxuryCarColour interface

class Porsche : LuxuryCarColour
{
    public void CarColour()
    {

        Console.WriteLine("The colour of the luxury car described above is: red ");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Porsche myPorsche = new Porsche();

        myPorsche.CarColour();
    }
}