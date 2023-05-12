using OOP_Objects_Classes;

// Calculate differance between days
Console.WriteLine(DateModifier.CalcDifference("23/01/2020", "04/02/2023", "/"));
Console.WriteLine(DateModifier.CalcDifferenceWithDateTime("23/01/2020", "04/02/2023", "/"));

// Family and Person
Console.WriteLine("Enter number of members.");
var numMembers = int.Parse(Console.ReadLine());
var pesonList = new List<Person>();

for (int i = 0; i < numMembers; i++)
{
    Console.WriteLine("Enter member name.");
    var name = Console.ReadLine();
    Console.WriteLine("Enter member age.");
    var age = int.Parse(Console.ReadLine());

    pesonList.Add(new Person(name, age));
}

var family = new Family(pesonList);

family.PrintFamily();
family.AddMember(new Person("Mitko", 24));
family.PrintFamily();
Console.WriteLine(family.GetOldestMember().Name + " " + family.GetOldestMember().Age);

// Generic
var list = new List<string>(new string[] { "a", "v", "c", "d" });
var list2 = new List<int>(new int[] { 1, 2, 5, 4, 3, 8 });
GenericList.Swap<string>(list, 0, 2);
GenericList.Swap<int>(list2, 0, 4);

foreach (var item in list)
{
    Console.Write($"{item}, ");
}
Console.WriteLine();

foreach (var item in list2)
{
    Console.Write($"{item}, ");
}
Console.WriteLine();

// Cars
Console.WriteLine("Enter number of cars.");
var numCars = int.Parse(Console.ReadLine());
var cars = new List<Car>();

for (int i = 0; i < numCars; i++)
{
    Console.WriteLine("Enter model");
    var model = Console.ReadLine();

    Console.WriteLine("Enter engine power");
    var enginePower = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter engine speed");
    var engineSpeed = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter cargo weight");
    var cargoWeight = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter cargo type");
    var cargoType = Console.ReadLine();

    Console.WriteLine("Enter tire1 pressure");
    var tire1Pressure = double.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire1 age");
    var tire1Age = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire2 pressure");
    var tire2Pressure = double.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire2 age");
    var tire2Age = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire3 pressure");
    var tire3Pressure = double.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire3 age");
    var tire3Age = int.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire4 pressure");
    var tire4Pressure = double.Parse(Console.ReadLine());

    Console.WriteLine("Enter tire4 age");
    var tire4Age = int.Parse(Console.ReadLine());

    cars.Add(new Car(model, enginePower, engineSpeed, cargoWeight, cargoType, tire1Pressure, tire1Age, tire2Pressure, tire2Age,
        tire3Pressure, tire3Age, tire4Pressure, tire4Age));
}

PrintAllCars(cars);

Console.WriteLine("Enter cargo type(\"fragile\", \"flamable\") to print.");
var condition = Console.ReadLine();
PrintCarsOnCondition(cars, condition);

static void PrintAllCars(List<Car> cars)
{
    foreach (var car in cars)
    {
        Console.Write($"[{car.Model}, {car.Engine.EnginePower}, {car.Engine.EngineSpeed}, {car.Cargo.CargoWeight}, {car.Cargo.CargoType}, ");
        foreach (var tire in car.Tires)
        {
            if (tire != car.Tires.Last())
            {
                Console.Write($"{tire.TirePressure}, {tire.TireAge}, ");
            }
            else
            {
                Console.Write($"{tire.TirePressure}, {tire.TireAge}]");
                Console.WriteLine();
            }
        }

        Console.WriteLine();
    }
}

static void PrintCarsOnCondition(List<Car> cars, string condition)
{
    foreach (var car in cars)
    {
        if (car.Cargo.CargoType == condition && (condition == "fragile" && car.Tires.Any(tire => tire.TirePressure < 1) || condition == "flamable" && car.Engine.EnginePower > 250))
        {
            Console.Write($"[{car.Model}, {car.Engine.EnginePower}, {car.Engine.EngineSpeed}, {car.Cargo.CargoWeight}, {car.Cargo.CargoType}, ");

            foreach (var tire in car.Tires)
            {
                if (tire != car.Tires.Last())
                {
                    Console.Write($"{tire.TirePressure}, {tire.TireAge}, ");
                }
                else
                {
                    Console.Write($"{tire.TirePressure}, {tire.TireAge}]");
                    Console.WriteLine();
                }
            }
        }

        Console.WriteLine();
    }
}
