using System;
using System.Collections.Generic;
using System.Text;

namespace InterfacesAndAbstraction
{
    public abstract class Product : IInventory
    {         
        public decimal Price { get; set; }
        public int StockLevel { get; set; }
    }
}
