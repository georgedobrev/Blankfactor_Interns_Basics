namespace CheckTheSum;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Input Word One");
        var inputOne = Console.ReadLine().ToCharArray();
        Console.WriteLine("Input Word Two");
        var inputTwo = Console.ReadLine().ToCharArray();
        Console.WriteLine("Target Result");
        var result = Console.ReadLine().ToCharArray();

        Console.WriteLine("Is equal ???");
        Console.WriteLine(IsEqual(inputOne,inputTwo, result));

    }

    public static bool IsEqual(char[] inputWordOne, char[] inputWordTwo, char[] result)
    {


        return result.Sum(x => x - 97) == inputWordOne.Sum(x => x - 97) + inputWordTwo.Sum(x => x - 97);
    }
}

