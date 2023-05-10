using System;

namespace InterfacesAndAbstraction
{
    class Program
    {
        static void Main(string[] args)
        {
            Store store = new Store();
            User user = new User();
            user.Money = 500;
            var nikeShoe = new Shoe() { Price = 55, StockLevel = 10 };
            store.BuyProduct(nikeShoe, user, new ProductForPrinting() { Price = nikeShoe.Price, StockLevel = nikeShoe.StockLevel });
            store.BuyProduct(new Toothbrush() { Price = 22, StockLevel = 0}, user, null);
            store.BuyProduct(new Microphone() { Price = 333, StockLevel = 15 }, user, new ProductForPrinting() { Price = 333, StockLevel = 15 });
            store.BuyProduct(new Shoe() { Price = 555, StockLevel = 3 }, user, new ProductForPrinting() { Price = 555, StockLevel = 3 });
        }
    }
}
