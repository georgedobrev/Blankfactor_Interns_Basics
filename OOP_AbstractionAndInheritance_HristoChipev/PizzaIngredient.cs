using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_Abstraction
{
    public abstract class PizzaIngredient : IIngredient
    {
        private string name;
        private string type;
        private double price;
        private int calories;
        private int servings;

        public string Name
        {
            get { return name; }
        }

        public string Type
        {
            get { return type; }
        }

        public double Price
        {
            get { return price; }
        }

        public int Calories
        {
            get { return calories; }
        }

        public int Servings
        {
            get { return servings; }
            set { servings = value; }
        }

        public PizzaIngredient(string name, string type, double price, int calories, int servings)
        {
            this.name = name;
            this.type = type;
            this.price = price;
            this.calories = calories;
            this.servings = servings;
        }

        public abstract string GetDescription();

        public override string ToString()
        {
            return $"{name} ({type}): {calories} calories, {servings} servings * ${price:F2} = {servings * price:F2}";
        }
    }
}