//Write a program that tracks cars and their cargo. Define a class Car that holds a piece of information
//about the model, engine, cargo, and a collection of exactly 4 tires. The engine, cargo and tire should
//be separate classes. Create a constructor that receives all of the information about the Car and creates
//and initializes its inner components (engine, cargo, and tires). On the first line of input, you will
//receive a number N - the number of cars you have. 
//On each of the next N lines, you will receive information about each car in the format: 
//"{model} {engineSpeed} {enginePower} {cargoWeight} {cargoType} {tire1Pressure} {tire1Age} {tire2Pressure} " +
//    "{tire2Age} {tire3Pressure} {tire3Age} {tire4Pressure} {tire4Age}"
//The speed, power, weight and tire age are integers and tire pressure is a double.
//After the N lines, you will receive a single line with one of the following commands:
//· "fragile" - print all cars whose cargo is "fragile" with a tire, whose pressure is < 1
//· "flammable" - print all of the cars, whose cargo is "flammable" and have engine power > 250
//The cars should be printed in order of appearance in the input.

using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());

        List<Car> cars = new List<Car>();

        for (int i = 0; i < n; i++)
        {
            string[] carInfo = Console.ReadLine().Split();

            string model = carInfo[0];
            int engineSpeed = int.Parse(carInfo[1]);
            int enginePower = int.Parse(carInfo[2]);
            int cargoWeight = int.Parse(carInfo[3]);
            string cargoType = carInfo[4];

            double[] tirePressures = new double[4];
            int[] tireAges = new int[4];

            for (int j = 0; j < 4; j++)
            {
                tirePressures[j] = double.Parse(carInfo[5 + j * 2]);
                tireAges[j] = int.Parse(carInfo[6 + j * 2]);
            }

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];

            for (int j = 0; j < 4; j++)
            {
                tires[j] = new Tire(tirePressures[j], tireAges[j]);
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.Add(car);
        }

        string command = Console.ReadLine();

        if (command == "fragile")
        {
            List<Car> fragileCars = cars.Where(c => c.Cargo.Type == "fragile" &&
                c.Tires.Any(t => t.Pressure < 1)).ToList();

            foreach (Car car in fragileCars)
            {
                Console.WriteLine(car.Model);
            }
        }
        else if (command == "flammable")
        {
            List<Car> flammableCars = cars.Where(c => c.Cargo.Type == "flammable" &&
                c.Engine.Power > 250).ToList();

            foreach (Car car in flammableCars)
            {
                Console.WriteLine(car.Model);
            }
        }
    }
}

class Car
{
    public string Model { get; set; }
    public Engine Engine { get; set; }
    public Cargo Cargo { get; set; }
    public Tire[] Tires { get; set; }

    public Car(string model, Engine engine, Cargo cargo, Tire[] tires)
    {
        Model = model;
        Engine = engine;
        Cargo = cargo;
        Tires = tires;
    }
}

class Engine
{
    public int Speed { get; set; }
    public int Power { get; set; }

    public Engine(int speed, int power)
    {
        Speed = speed;
        Power = power;
    }
}

class Cargo
{
    public int Weight { get; set; }
    public string Type { get; set; }

    public Cargo(int weight, string type)
    {
        Weight = weight;
        Type = type;
    }
}

class Tire
{
    public double Pressure { get; set; }
    public int Age { get; set; }

    public Tire(double pressure, int age)
    {
        Pressure = pressure;
        Age = age;
    }
}