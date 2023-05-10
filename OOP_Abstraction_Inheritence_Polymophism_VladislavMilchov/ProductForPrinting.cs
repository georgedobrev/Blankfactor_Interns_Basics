using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace InterfacesAndAbstraction
{
    class ProductForPrinting : Product , IPrintable
    {
        public void PrintToFile(Product product, string fileName)
        {
            using (StreamWriter writer = new StreamWriter(fileName))
            {
                writer.WriteLine($"Product Details:\nPrice: {product.Price:C}\nStock Level: {product.StockLevel}\n");
            }
        }
    }
}
