using OOP_Abstraction;

var pizza = new Pizza(new List<PizzaIngredient>(new PizzaIngredient[] { new TomatoSauce(1), new Pepperoni(1) }));
Console.WriteLine(pizza.GetDescription());
Console.WriteLine(pizza.GetCalories());
pizza.RemoveIngredient("Pepperoni");
Console.WriteLine(pizza.GetDescription());
pizza.AddIngredient(new Pepperoni(2));
Console.WriteLine(pizza.GetPrice());
Console.WriteLine(pizza.GetDescription());
Console.WriteLine(pizza.GetCalories());
foreach (var topping in pizza.Toppings)
{
    Console.WriteLine(topping.ToString());
}