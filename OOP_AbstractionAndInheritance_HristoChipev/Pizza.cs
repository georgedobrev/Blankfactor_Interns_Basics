using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_Abstraction
{
    public class Pizza : IPizza
    {
        private List<PizzaIngredient> toppings;

        public List<PizzaIngredient> Toppings
        {
            get { return toppings; }
        }

        public Pizza(List<PizzaIngredient> toppings)
        {
            this.toppings = toppings;
        }

        public void AddIngredient(PizzaIngredient topping)
        {
            toppings.Add(topping);
        }

        public void RemoveIngredient(string ingredientName)
        {
            var ingredient = toppings.Find(topping => topping.Name == ingredientName);
            if (ingredient != null)
            {
                toppings.Remove(ingredient);
            }
        }

        public int GetCalories()
        {
            var calories = 0;

            foreach (var topping in toppings)
            {
                calories += topping.Servings * topping.Calories;
            }

            return calories;
        }

        public string GetDescription()
        {
            string description = "Pizza with ";
            foreach (var topping in toppings)
            {
                description += topping.GetDescription() + ", ";
            }
            return description.TrimEnd(' ', ',');
        }

        public double GetPrice()
        {
            var price = 0.00;

            foreach (var topping in toppings)
            {
                price += topping.Servings * topping.Price;
            }

            return Math.Round(price, 2);
        }
    }
}