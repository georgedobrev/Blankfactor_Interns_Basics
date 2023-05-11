
using System;
using System.Collections.Generic;
using System.Text;

namespace InterfacesAndAbstraction
{
    class Store
    {

        public void BuyProduct(Product product, User user , ProductForPrinting printable)
        {
            if (product.StockLevel == 0)
            {
                Console.WriteLine($"Sorry, {product.GetType().Name} is out of stock");
                return;
            }

            if (user.Money >= product.Price)
            {
                Console.WriteLine($"You have purchased a {product.GetType().Name} for {product.Price:C}");                
                user.Money -= product.Price;
                product.StockLevel--;
                if (printable != null)
                {
                    var productForPrinting = new ProductForPrinting { Price = product.Price };
                    printable.PrintToFile(productForPrinting, "product_details.txt");
                }
            }
            else
            {
                Console.WriteLine($"You cannot afford this product, it costs {product.Price:C}");
            }
        }

        
    }   

        
            
      
    
}
