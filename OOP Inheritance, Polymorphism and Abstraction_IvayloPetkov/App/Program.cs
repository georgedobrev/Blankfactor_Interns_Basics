using System;
using System.Collections.Generic;

namespace Application
{
    //Abstract class
    public abstract class Animal
    {
        public string Name { get; set; }
        public int Age { get; set; }

        public abstract string MakeSound();
    }

    public class Lion : Animal
    {
        public string FurColor { get; set; }

        public override string MakeSound()
        {
            return ("The lion roars!");
        }

    }

    public class Zebra : Animal
    {
        public string colors { get; set; }
        public override string MakeSound()
        {
            return ("I really dont know....");
        }
    }

    public interface IVisitor
    {
        void VisitAnimal(Animal animal);
    }

    public interface IAnimalBehavior
    {
        void Eat();
        void Sleep();
    }

    public class Zoo : IVisitor
    {
        private List<Animal> _animals;

        public Zoo()
        {
            _animals = new List<Animal>();
        }

        public void AddAnimal(Animal animal)
        {
            _animals.Add(animal);
        }

        public void RemoveAnimal(Animal animal)
        {
            _animals.Remove(animal);
        }

        public void Accept(IVisitor visitor)
        {
            foreach (Animal animal in _animals)
            {
                visitor.VisitAnimal(animal);
            }
        }

        public void PrintAnimalDetails()
        {
            foreach (Animal animal in _animals)
            {
                Console.WriteLine($"Name: {animal.Name}, Age: {animal.Age}");
            }
        }

        public void VisitAnimal(Animal animal)
        {
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Zoo zoo = new Zoo();

            Lion lion = new Lion { Name = "Toshko", Age = 5, FurColor = "Golden"};
            Zebra zebra = new Zebra { Name = "Krosko", Age = 2, colors = "Black and White"};

            zoo.AddAnimal(lion);
            zoo.AddAnimal(zebra);
            zoo.RemoveAnimal(lion);
            zoo.PrintAnimalDetails();
        }
    }
}