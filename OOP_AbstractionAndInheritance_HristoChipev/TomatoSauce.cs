using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_Abstraction
{
    public class TomatoSauce : PizzaIngredient
    {
        public TomatoSauce(int servings) : base("Tomato Sauce", "Sauce", 2, 200, servings)
        {
        }

        public override string GetDescription()
        {
            return "Home made pizza sauce from tomatoes";
        }
    }
}