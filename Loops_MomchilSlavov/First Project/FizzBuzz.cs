/*
 * C# Program aimed at displaying "Fizz", "Buzz" or "FizzBuzz" based on the division of a certain number
 */

public class For_Loop
{
    public static void main(String[] args)
    {
        int n = 15;
        for (int i = 1; i <= 15; i++)
        {
            if (n % 3 == 0 && n % 5 == 0)
            {
                Console.WriteLine("FizzBuzz");
            }
            //System.out.println(i);
            else if (n % 3 == 0)
                Console.WriteLine("Fizz");
            else if (n % 5 == 0)
                Console.WriteLine("Buzz");
        }
    }
}


   





    