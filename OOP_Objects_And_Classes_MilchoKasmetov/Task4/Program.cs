namespace Task4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    Console.WriteLine("Number of cars");

                    var n = int.Parse(Console.ReadLine().Trim());

                    var carList = new List<Car>();

                    var carFactory = new CarFactory();

                    for (int i = 0; i < n; i++)
                    {
                        Console.WriteLine($"Input parts for car number {i + 1}");

                        var input = Console.ReadLine();

                        if (string.IsNullOrEmpty(input) || string.IsNullOrWhiteSpace(input))
                        {
                            throw new ArgumentNullException();
                        }

                        carList.Add(carFactory.CreateCar(input));

                        Console.WriteLine("Car created");
                    }

                    Console.WriteLine("Input fragile or flammable");

                    var inputPrint = Console.ReadLine().Trim().ToLower();

                    //var printList = new List<Car>();

                    Console.WriteLine(new string('-', 130));

                    var printList = inputPrint switch
                    {
                        "fragile" => carList.Where(x => x.Cargo.CargoType == CargoType.fragile && x.Tires.Any(r => r.Pressure < 1)),
                        "flammable" => carList.Where(x => x.Cargo.CargoType == CargoType.flammable && x.Engine.EnginePower > 250),
                        _ => Enumerable.Empty<Car>()
                    };

                    //if (inputPrint == "fragile")
                    //{
                    //    printList = carList.Where(x =>
                    //                      x.BaseCargo.CargoType.ToString() == "fragile" &&
                    //                      x.Tires.Any(r => r.Pressure < 1))
                    //                       .ToList();
                    //}
                    //else if (inputPrint == "flammable")
                    //{
                    //    printList = carList.Where(x =>
                    //                     x.BaseCargo.CargoType.ToString() == "flammable" &&
                    //                     x.BaseEngine.EnginePower > 250)
                    //                      .ToList();
                    //}

                    if (printList.Any())
                    {
                        foreach (var car in printList)
                        {
                            Console.WriteLine(car.ToString());
                        }

                    }
                    else
                    {
                        Console.WriteLine("Car list is empty :(");
                    }

                    Console.WriteLine(new string('-', 130));
                }
                catch (Exception e)
                {
                    Console.WriteLine($"ERORR TRY AGAIN !!! :( {e.Message}");
                }
            }

        }
    }
}