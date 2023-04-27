using System.Text;

namespace FizzBuzz;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Insert Number");

        Console.WriteLine(BuzzOrFizz(int.Parse(Console.ReadLine())));



    }
    public static string BuzzOrFizz(int input)
    {
        var sb = new StringBuilder();

        foreach (var number in Enumerable.Range(1,input))
        {
            if(number % 15 == 0)
            {
                sb.Append("FizzBuzz");
            }else if(number % 3 == 0)
            {
                sb.Append("Fizz");
            }
            else if(number % 5 == 0)
            {
                sb.Append("Buzz");
            }
            else
            {
                sb.Append(number);
            }

            sb.Append(", ");
        }


        return sb.ToString();

        //var count = 1;

        //var list = new List<string>();

        //while (count <= input)
        //{
            

        //    if (count % 3 == 0 && count % 5 == 0)
        //    {
        //        list.Add("FizzBuzz");
        //    }
        //    else if (count % 3 == 0)
        //    {
        //        list.Add("Fizz");
             
        //    }
        //    else if (count % 5 == 0)
        //    {
        //        list.Add("Buzz");
        //    }
            
        //    else
        //    {
        //        list.Add($"{count}");
        //    }

        //    count++;

        //}

        //return string.Join(',',list);

    }
}

