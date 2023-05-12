using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_Abstraction
{
    public interface IPizza
    {
        public void RemoveIngredient(string ingredientName);

        public void AddIngredient(PizzaIngredient topping);

        public double GetPrice();

        public int GetCalories();

        public string GetDescription();
    }
}