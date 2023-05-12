using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_Abstraction
{
    public interface IIngredient
    {
        public string Name { get; }

        public string Type { get; }

        public double Price { get; }

        public int Calories { get; }

        public int Servings { get; set; }

        public string GetDescription();
    }
}