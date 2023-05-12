using Microsoft.VisualBasic;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace OOP_Abstraction
{
    public class Pepperoni : PizzaIngredient
    {
        private const int perServing = 8;

        public int PerServing
        {
            get { return perServing; }
        }

        public Pepperoni(int servings)
            : base("Pepperoni", "Meat", 2.5, 150, servings)
        {
        }

        public override string GetDescription()
        {
            return "Spicy pepperoni slices";
        }

        public override string ToString()
        {
            return $"{Name} ({Type}): {Calories} calories, {Servings} servings({Servings * perServing} slices) * ${Price:F2} = {Servings * Price:F2}";
        }
    }
}